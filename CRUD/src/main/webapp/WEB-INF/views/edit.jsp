<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<html>
<head>
<title>User Page</title>
</head>
<body>
	<h1>Edit User</h1>

	<c:url var="addAction" value="/user/update"></c:url>

	<form:form action="${addAction}" commandName="userdetails">
		<table>
			<tr>
				<td><form:label path="id">
						<spring:message text="ID" />
					</form:label></td>
				<td><form:input path="id" readonly="true" disabled="true" /> <form:hidden
						path="id" /></td>
			</tr>
			<tr>
				<td><form:label path="name">
						<spring:message text="Name" />
					</form:label></td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td><form:label path="phone">
						<spring:message text="Phone No" />
					</form:label></td>
				<td><form:input path="phone" /></td>
			</tr>
			<tr>
				<td><form:label path="email">
						<spring:message text="Email Address" />
					</form:label></td>
				<td><form:input path="email" /></td>
			</tr>
			<tr>
				<td><form:label path="address">
						<spring:message text="Address" />
					</form:label></td>
				<td><form:input path="address" /></td>
			</tr>
			<tr>
				<td><form:label path="username">
						<spring:message text="Username" />
					</form:label></td>
				<td><form:input path="username" readonly="true" disabled="true" />
					<form:hidden path="username" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit"
					value="<spring:message text="Edit"/>" /></td>
			</tr>
		</table>
	</form:form>
	<c:url var="home" value="/home"></c:url>
	<form:form action="${home}" commandName="login">
		<table>
			<tr>
				<td colspan="2"><input type="submit"
					value="<spring:message text="Home"/>" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>
