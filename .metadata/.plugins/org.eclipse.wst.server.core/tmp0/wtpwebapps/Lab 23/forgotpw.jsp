<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<body>
<center>
	<h1>ERX SOLUTION TECH SUPPORT</h1>
	<h2>Password Assistance Form</h2>
	<font color=red  size=5>${MSG}></font>
	<form action="forgotpw.jlc" method="post">
	<table>
		<tr>
		<td>Email ID</td>
		<td><input type="text" name="email"/></td>
		</tr>
		
		<tr>
		<td colspan="2" align="center">
		<input type="submit" value="Submit"/>
		</td>
		</tr>
	</table>
	</form>
</center>
</body>
</html>