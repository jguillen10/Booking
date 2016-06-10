<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<form:form method="post" action="login" commandName="user">
<table >
	<tr>
		<tr>
		<td><form:label path="user"><spring:message code="label.usr"/></form:label></td>
		<td><form:input path="user" /></td> 
	</tr>
	<tr>
		<td><form:label path="password"><spring:message code="label.pass"/></form:label></td>
		<td><form:input path="password" /></td> 
	</tr>
	</tr>
	<tr>
	<td></td>
		<td>	<input type="submit" value="Login"/></td>
	</tr>
</table>
</form:form>