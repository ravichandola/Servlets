<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<body>
	<center>
		<h1>JLC TECH SUPPORT</h1>
		<h2>Registration Form</h2>
		<font color=red size=5>${MSG}</font>
		<form action="login.jlc" method="post">
		<table>
		<tr>
		<td>username</td>
		<td><input type="text" name="username"/></td>
		</tr>
		
		<tr>
		<td>Password</td>
		<td><input type="text" name="password"/></td>
		</tr>
		
		<tr>
		<td colspan="2" align="center"/>
		<input type="submit" value="Login"/>
		</td>
		</tr>
		</table>
		</form>
			<h2>
			<a href="register.jsp">New User Signup</a>
			<a href="forgotpw.jsp">Forgot my Password</a>
			</h2>
		
	</center>
</body>
</html>