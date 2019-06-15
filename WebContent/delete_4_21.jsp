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
<s:label>Delete Accout</s:label>
<s:form action="delete_4_21">
	<table border="1">
		<tr>
			<s:textfield name="id" label="id"/>
		</tr>
		
		<tr>
			<s:submit name="delete" value="delete"/>
		</tr>
	</table>
</s:form>
</body>
</html>