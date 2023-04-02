<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">
<link rel="stylesheet" href="login.css">

<title>Update page</title>
</head>
<body style="background-color: #222429;">

<!-- partial:index.partial.html -->

<div id="login-form-wrap">
  <h2 id="head">Update Your Mobile</h2>
  
  <form id="login-form" action="Update" method="post">
    <p>
    <input type="email" id="username" name="email" value="<%=request.getAttribute("email")%>" required><i class="validation"><span></span><span></span></i>
    </p>
    <p>
    <input type="text"  id="email" name="mobile" placeholder="Enter New MobileNO." required><i class="validation"><span></span><span></span></i>
    </p>
   
    <p>
    <input type="submit" id="login" value="Update">
    </p>
  </form>
  <div id="create-account-wrap">
    <p>&#9410 Copyright Created by <a href="https://www.instagram.com/x_mohsin_nazir_x7/">@Mohsin_Bhai</a><p>
  </div><!--create-account-wrap-->
</div><!--login-form-wrap-->
<!-- partial -->

</body>
</html>