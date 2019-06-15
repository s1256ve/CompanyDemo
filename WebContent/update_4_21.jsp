<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "s" uri = "/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Account</title>
</head>
<body>
<s:label>Add Accout</s:label>
<s:form action="update_4_21">
	<table border="1">
		<tr>
			<s:textfield name="id" label="id"/>
		</tr>
		<tr>
			<s:textfield name="loginName" label="loginName"/>
		</tr>
		<tr>
			<s:password name="loginPwd" label="loginPwd"/>
		</tr>
		<tr>
			<s:submit name="update" value="update"/>
		</tr>
	</table>
</s:form>
</body>
</html>