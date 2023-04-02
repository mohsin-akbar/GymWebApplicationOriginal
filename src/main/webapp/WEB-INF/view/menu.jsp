<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="login.css">
<style >
.table{
	margin-left:210px;
	margin-top:50px;

}
.table input[type=submit]{
	width:200px;
	background-color:#FB5B21;
	color:black;
	}
	

</style>
<meta charset="ISO-8859-1">
<title>menu page</title>
</head>
<body >
<div class="table">
	<table  border="1">
	<tr>
	<a href="AllRegistration" ><input type="submit" value="All Registration"/> </a>
	</tr>
	<tr>
	<a href="NewRegistration" ><input type="submit" value="New Rgistration"/> </a>
	</tr>
	<tr>
	<a href="OfferController" ><input type="submit" value="Show Offers"/> </a>
	</tr>
	<tr>
	<a href="LogOutController" ><input type="submit" value="Log out"/> </a>
	</tr>
	
	</table>
	</div>
</body>
</html>