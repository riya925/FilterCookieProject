import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/LoginServlet")
public class Loginfilter implements Filter
{
    public Loginfilter()
    {
    	
    }
	public void destroy()
	{
		
	}
	//to filter authorized user filter is used i.e. filter is checkpoint or security point
	//servlet can use cookies and session while filter cannot allow cookies
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException
	{
		String us=request.getParameter("tus");
		String pa=request.getParameter("tpa");
		
		//request.getrequestdispatcher will index the file but forward will send the file
		if(us.equals("COMPACT") && pa.equals("JAVA"))
		{
			chain.doFilter(request, response);
		}
		//forward jump to next page while include will jump to next page including current page status
		else
		{
			PrintWriter pw=response.getWriter();
			pw.write("UNAUTHORIZED USER---- TRY AGAIN");
			//request.getRequestDispatcher("/index.jsp").forward(request, response);
			request.getRequestDispatcher("/index.jsp").include(request, response);
		}
	}
	public void init(FilterConfig fConfig) throws ServletException
	{
		
	}
}