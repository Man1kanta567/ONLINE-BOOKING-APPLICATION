<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js">
	
</script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<!-- <script type="text/javascript" th:src="@{/js/shipmenttype.js}"></script>
 -->
</head>
<body>
	<div class="container">
		<form:form method="post" action="successRegister" modelAttribute="user">
			<div class="card col-md-10">
			
			<div class="card-header">
			<h1 class="display4 text-danger bg-warning" style="text-align: center;">USER REGISTRATION FORM</h1>
			</div>
			
			<div class="card-body">
			
			<div class="row text-white" style="background-color:black;text-align: center;">
			<label class="col-md-2">USERNAME</label>
			<form:input path="username" id="username"  class="form-control col-md-4"/>
			<span id="usernameError"></span>
           
			<label class="col-md-2">PASSWORD</label>
			<form:password path="password" id="password"  class="form-control col-md-4"/>
			<span id="passwordError"></span>
             </div>
			<br>
			
			<div class="row" style="text-align: center;font-family: fantasy;font-weight: bold;">
			<label class="col-md-2">ID</label>
			<form:input path="id" id="id"  class="form-control col-md-4"/>
			<span id="idError"></span>
            
             
			<label class="col-md-2">MAIL</label>
			<form:input path="mail" id="mail"  class="form-control col-md-4"/>
			<span id="mailError"></span>
             </div>
		
             
             
             <br>
			<div class="row" style="background-color: lime">
			<label class='col-md-2'>FIRSTNAME</label>
			<form:input path="firstname" id="firstname"  class="form-control col-md-4"/>
			<span id="firstnameError"></span>
             
			<label class="col-md-2">LASTNAME</label>
			<form:input path="lastname" id="lastname"  class="form-control col-md-4"/>
			<span id="lastnameError"></span>
             </div>
			<br>
			
			
			
			
			
			<div class="row">
			<label class="col-md-1">AGE</label>
			<form:input path="age" id="age"  class="form-control col-md-2"/>
			<span id="ageError"></span>
             </div>
             <br>
             
			<div class="row">
			  <label class="col-md-2">GENDER</label>
			 
			   male &nbsp<form:radiobutton path="gender" value="male"></form:radiobutton>&nbsp&nbsp&nbsp&nbsp
			   female &nbsp<form:radiobutton path="gender" value="female"></form:radiobutton>&nbsp&nbsp&nbsp&nbsp
			   other &nbsp<form:radiobutton path="gender" value="other"></form:radiobutton>
             </div>
             
               <br>
             
             <div class="row">
               <label>NOTE</label>
               <form:textarea path="note" class="form-control" id="note"/>
             </div>
             <br>
             
             </div>
             
             <div class="card-footer">
             <input type="submit" value="Create User" class="btn btn-info col-md-12"/>
             </div>
             
          </div>
		</form:form>
	</div>
	<br><br>
	${msg }
	
	
</body>
</html>