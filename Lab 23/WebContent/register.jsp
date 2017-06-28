<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<body>
	<h1>ERX SOLUTION TECH SUPPORT</h1>
	<h2>Registration Form</h2>
	<font color=red size=5>${MSG}></font>
	<form action="register.jlc" method="post">
		<table>
			<tr>
			<td>Email ID</td>
			<td><input type="text" name="email"/></td>
			</tr>
			
			<tr>
			<td>Phone</td>
			<td><input type="text" name="phone"/></td>
			</tr>
			
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
</body>
</html>