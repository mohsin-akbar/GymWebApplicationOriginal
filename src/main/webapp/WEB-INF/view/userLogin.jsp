<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en" >
<head>
  <meta charset="UTF-8">
  <title>user Login</title>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">
<link rel="stylesheet" href="login.css">

</head>

<body style="background-color: #222429;">

<!-- partial:index.partial.html -->

<div id="login-form-wrap">
  <h2 id="head">Login</h2>
  <%if(request.getAttribute("msg")!=null){
	  out.println(request.getAttribute("msg"));
  }
	  %>
  <form id="login-form" action="UserLoginController" method="post">
    <p>
    <input type="email" id="username" name="email" placeholder="Your Email" required><i class="validation"><span></span><span></span></i>
    </p>
    <p>
    <input type="text"  id="email" name="id" placeholder="Your Id" required><i class="validation"><span></span><span></span></i>
    </p>
   
    <p>
    <input type="submit" id="login" value="Login">
    </p>
  </form>
  <div id="create-account-wrap">
  <h5>Dont have an Account?<a href="NewRegistration">Register here</a></h5>
    <p>&#9410 Copyright Created by <a href="https://www.instagram.com/x_mohsin_nazir_x7/">@Mohsin_Bhai</a><p>
  </div><!--create-account-wrap-->
</div><!--login-form-wrap-->
<!-- partial -->


</body>
</html>