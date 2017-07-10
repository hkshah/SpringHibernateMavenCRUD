<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<html>
<head>
<title>User Page</title>
</head>
<body>
	<h1>Login</h1>

	<c:url var="addAction" value="/user/login"></c:url>

	<form:form action="${addAction}" commandName="login">
		<table>
			<tr>
				<td><form:label path="username">
						<spring:message text="Username :" />
					</form:label></td>
				<td><form:input path="username" /></td>
			</tr>
			<tr>
				<td><form:label path="password">
						<spring:message text="Password" />
					</form:label></td>
				<td><form:input path="password" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit"
					value="<spring:message text="Login"/>" /></td>
			</tr>
		</table>
	</form:form>
	<c:url var="register" value="/register"></c:url>
	<form:form action="${register}" commandName="register">
		<table>
			<tr>
				<td colspan="2"><input type="submit"
					value="<spring:message text="Register"/>" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>
