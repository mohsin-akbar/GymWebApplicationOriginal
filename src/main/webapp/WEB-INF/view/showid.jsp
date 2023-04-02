<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="login.css">
<style >
body{
color : white;
}
#sub{
	width:100px;
	color :black;
	background-color:#FB5B21;
	
}

</style>
<meta charset="ISO-8859-1">
<title>LoginCred</title>
</head>
<body>

<div style="margin-top: 100px">
<h2 style="margin-left: 0%;color:white">Your Login Credentials</h2>
<h5 style="margin-left: 30%">Keep your Id & Email for future Interactions ! </h5>
	<table border="1" style="margin-left:39%;">
	<tr>
		<th>ID</th>
		<th>Email</th>
	</tr>
	<% 
  	ResultSet id=(ResultSet)request.getAttribute("Id");
  	while(id.next()){
  	%>
  	
  	<tr>
  	<td><%=id.getString(1)%></td>
	<td><%=id.getString(4)%></td>
  	</tr>
  <%} %>
	</table>
	<h4 style="margin-left: 37%;">Now Click Here To LogIn- <a href="UserLoginController"><input type="submit" id="sub" value="Login"/></a></h4>
	</div>
	
</body>
</html>