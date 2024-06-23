import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FactServlet")
public class FactServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		int n=Integer.parseInt(request.getParameter("tno"));
		int f=1;
		
		for(int i=1;i<=n;i++)
		{
			f=f*i;
		}
		
		PrintWriter pw=response.getWriter();
		pw.write("<br> Factorial = "+f);
		
		request.getRequestDispatcher("/final.jsp").include(request, response);
	}
}