<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Administrator</title>
</head>
<body>
<%@ page import="hibertest1.entity.Users,hibertest1.Load_4_21,java.util.*" %>

<%
	List<Users> list=Load_4_21.load();
%>
Welcome Administrator<br>
<table border="1">
	<tr>
		<td>Manage User</td>
	</tr>
	<tr>
		<td><a href="delete_4_21.jsp">delete</a><br></td>	
	</tr>
	<tr>
		<td><a href="update_4_21.jsp">update</a><br></td>
	</tr>
	
</table>
All Users
<table border="1">
	<tr>
		<th>Id</th>
		<th>LoginName</th>
		<th>LoginPwd</th>
	</tr>
	<%for(Users u:list){%>
		<tr>
			<td><%=u.getId() %></td>
			<td><%=u.getLoginName()%></td>
			<td><%=u.getLoginPwd()%></td>
		</tr>
	<%} %>
</table>
</body>
</html>