<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="Stylesheet" href="login.css">

<style >
body{
color:white;
}
#id{
background-color:#FB5B21;
}
table{
margin-left:500px;
margin-top:10px;
}
</style>
<meta charset="ISO-8859-1">
<title>Offer page</title>
</head>
<body>
<h1>Check New DhamakeDar Offer</h1>
	<a href="UserOfferController"><input type="submit" id="id" value="Generate Offer"/></a>
	<table border="1">
	<tr>
	<td>Current Fee</td>
	<td>
	<%if(request.getAttribute("total")!=null){
		out.println(request.getAttribute("total"));
	   }
		%>&#8377;
		</td>
	</tr>
	<tr>
	<td>Offer in %</td>
	<td>
		<%if(request.getAttribute("offer")!=null){
		out.println(request.getAttribute("offer"));
	    }
		%>%
		</td>
	</tr>
	<tr>
	<td>PayAble Ammount</td>
	<td>	
		<%if(request.getAttribute("payAble")!=null){
		out.println(request.getAttribute("payAble"));
	    }
		%>&#8377;
		</td>
	</tr>
	</table>
	
</body>
</html>