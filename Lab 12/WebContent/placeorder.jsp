<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

 <%@ page import="java.util.*"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
	<center>
	<h1>BOOKSTORE</h1>
	<h2>BOOK SEARCH</h2>
	<h1>Your order have been placed successfully</h1>
	<%
	session.invalidate();
	%>
	<br/>
	<a href="index.jsp">Go To Search Page</a>
	</center>
</body>
</html>