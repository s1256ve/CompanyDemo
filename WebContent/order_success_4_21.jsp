<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="hibertest1.entity.Orders,hibertest1.Order_4_21,java.util.*" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Order Success</title>
</head>
<body>
Done Success
<%
	List<Orders> list=Order_4_21.load();
%>
<br>All Orders
<table border="1">
	
	<tr>
		<th>Id</th>
		<th>LoginName</th>
		<th>Product Name</th>
		<th>Price</th>
		<th>Amount</th>
		<th>Total</th>
	</tr>
	<%for(Orders o:list){%>
		<tr>
			<td><%=o.getId() %></td>
			<td><%=o.getName() %></td>
			<td><%=o.getPname()%></td>
			<td><%=o.getPrice() %></td>
			<td><%=o.getNumber() %></td>
			<td><%=o.getAmount() %></td>
		</tr>
	<%} %>
</table>
</body>
</html>