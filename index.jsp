<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %> <!-- this is tag library in scriptlet -->
    <%@ include file="header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1> <% Date d1=new Date();
out.println(d1);
%></h1>

<form name="f1" action="LoginServlet">

USERNAME : <input type="text" name="tus"> <br>
PASSWORD : <input type="password" name="tpa"> <br><br>

<input type="submit" name="sub" value="LOGIN">

</form>

</body>
</html>