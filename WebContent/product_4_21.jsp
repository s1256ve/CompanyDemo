<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "s" uri = "/struts-tags"%>
    <%@ page import="hibertest1.entity.Users" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Product</title>
</head>
<body>
<script type="Text/JavaScript" src="http://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<s:label>Order</s:label>
			PName
			<select id="pnames">
				<option value="Java">Java</option>
				<option value="Struts">Struts</option>
				<option value="C#">C#</option>
			</select>
<form action="order_4_21">
	
		
			Name<input type="text" name="name" value="${u.getLoginName()}" readonly="readonly"/>
		<br>
			
		
		
			Number<input type="text" id="number" name="number" value="0"/>
		<br>
		
			Price<input type="text" id="price" name="price" value="0" readonly="readonly"/>
		<br>
			<input type="hidden" id="pname" readonly="readonly" value=""/>
			
			<input type="hidden" id="amount" readonly="readonly" value=""/>
			
			<input type="submit" name="Order" value="Order"/>
		
	
</form>
<script type="text/javascript">
$("#pnames").change(function(){
	if($(this).val()=="Java"){
		$("#price").val("250");
	}else if($(this).val()=="Struts"){
		$("#price").val("300");
	}else if($(this).val()=="C#"){
		$("#price").val("280");
	}
	$("#pname").val($(this).val());
});
$("#number").change(function(){
	var n=parseInt($(this).val());
	var p=parseInt($("#price").val());
	alert(n+","+p);
	$("#amount").val((n*p));
});
</script>
</body>
</html>