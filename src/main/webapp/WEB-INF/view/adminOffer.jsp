<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html lang="en" >
<head>
  <meta charset="UTF-8">
  <title>admin Offer</title>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">
<link rel="stylesheet" href="login.css">

</head>
<body style="background-color: #222429;">

<!-- partial:index.partial.html -->

<div id="login-form-wrap">
  <h2 id="head">Give Offer here..</h2>
  <form id="login-form" action="OfferController" method="post">
    <p>
    <input type="text" id="username" name="total" placeholder="Enter Original Fee" required><i class="validation"><span></span><span></span></i>
    </p>
    <p>
    <input type="text" id="email" name="offer" placeholder="Offer in %" required><i class="validation"><span></span><span></span></i>
    </p>
     <p>
    <input type="text" id="email" name="email" placeholder="Admin's Email" required><i class="validation"><span></span><span></span></i>
    </p>
    
    <p>
    <input type="submit" id="login" value="Share To your Members">
    </p>
  </form>
  <div id="create-account-wrap">
  <%if(request.getAttribute("msg")!=null){ 
	  out.println(request.getAttribute("msg"));
  }
  %>
   
    <p>&#9410 Copyright Created by <a href="https://www.instagram.com/x_mohsin_nazir_x7/">@Mohsin_Bhai</a><p>
  </div><!--create-account-wrap-->
</div><!--login-form-wrap-->
<!-- partial -->

</body>
</html>
