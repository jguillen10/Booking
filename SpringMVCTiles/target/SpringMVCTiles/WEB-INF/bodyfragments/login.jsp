<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<table >
	<tr>
		<td>Usuario</td>
		<td><input name="user"></td> 
	</tr>
	<tr>
		<td>Password</td>
		<td><input name="pass"></td>
	</tr>
	<tr>
	<td></td>
		<td><button type="button" onclick="alert('Login!!!')">LogIn</button></td>
	</tr>
</table>