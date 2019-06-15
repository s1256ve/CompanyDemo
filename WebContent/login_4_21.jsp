<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "s" uri = "/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
<s:label>Login</s:label>
<s:form action="login_4_21">
	<table border="1">
		<tr>
			<s:textfield name="loginName" label="loginName"/>
		</tr>
		<tr>
			<s:password name="loginPwd" label="loginPwd"/>
		</tr>
		<tr>
			<s:submit name="Login" value="Login"/>
		</tr>
	</table>
</s:form>
</body>
</html>