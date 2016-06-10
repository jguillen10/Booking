<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h2>User Manager</h2>

<form:form method="post" action="addUser.html" commandName="user">

	<table>
	<tr>
		<td><form:label path="user"><spring:message code="label.usr"/></form:label></td>
		<td><form:input path="user" /></td> 
	</tr>
	<tr>
		<td><form:label path="password"><spring:message code="label.pass"/></form:label></td>
		<td><form:input path="password" /></td> 
	</tr>
	<tr>
		<td><form:label path="firstname"><spring:message code="label.firstname"/></form:label></td>
		<td><form:input path="firstname" /></td> 
	</tr>
	<tr>
		<td><form:label path="lastname"><spring:message code="label.lastname"/></form:label></td>
		<td><form:input path="lastname" /></td>
	</tr>
	<tr>
		<td><form:label path="email"><spring:message code="label.email"/></form:label></td>
		<td><form:input path="email" /></td>
	</tr>
	<tr>
		<td><form:label path="telephone"><spring:message code="label.telephone"/></form:label></td>
		<td><form:input path="telephone" /></td>
	</tr>
	<tr>
		<td colspan="2">
			<input type="submit" value="<spring:message code="label.addcontact"/>"/>
		</td>
	</tr>
</table>	
</form:form>

	
<h3>Users</h3>
<c:if  test="${!empty userList}">
<table class="data">
<tr>
	<th>Name</th>
	<th>User</th>
	<th>Email</th>
	<th>Telephone</th>
	<th>&nbsp;</th>
</tr>
<c:forEach items="${userList}" var="user">
	<tr>
		<td>${user.lastname}, ${user.firstname} </td>
		<td>${user.user}</td>
		<td>${user.email}</td>
		<td>${user.telephone}</td>
		<td><a href="deleteUser/${user.id_user}">delete</a></td>
	</tr>
</c:forEach>
</table>
</c:if>

