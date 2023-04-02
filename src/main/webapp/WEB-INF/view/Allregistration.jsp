<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">
<link rel="stylesheet" href="login.css">
<style>
#table{
margin-left:150px;
background-color:white;
width:1000px;
box-shadow:5px 5px 2px #FB5B21;
border-radius:30px;
}
#table table{
	margin-left:20px;
}
h2{
margin-left:0px;
color:black;
}
#button{
  background-color:#FB5B21;
  cursor:pointer;
}
#botton:hover{
background-color:#05A0C8;
}

</style>
<meta charset="ISO-8859-1">
<title>all registration</title>
</head>
<body>
<div id="table" >
<h2>All Registration</h2>
	<table border="0">
	<tr>
		<th>ID</th>
		<th>Name</th>
		<th>City</th>
		<th>Email</th>
		<th>Mobile</th>
		<th>DELETE</th>
		<th>UPDATE</th>
	</tr>
	<% 
  	ResultSet rs=(ResultSet)request.getAttribute("result");
  	while(rs.next()){
  	%>
  	
  	<tr>
  	<td><%=rs.getString(1)%></td>
	<td><%=rs.getString(2)%></td>
	<td><%=rs.getString(3)%></td>
	<td><%=rs.getString(4)%></td>
	<td><%=rs.getString(5)%></td>
	
	<td><a href="DeleteController?email=<%=rs.getString(4)%>" ><input type="button" id="button" value="Delete"/></a></td>
     <td><a href="Update?email=<%=rs.getString(4)%>&mobile=<%=rs.getString(5) %>" ><input type="button" id="button" value="Update"/></a></td>
  	</tr>
  <%} %>
	</table>
	</div>
</body>
</html>