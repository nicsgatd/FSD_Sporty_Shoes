<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="pages/css/New1.css">

<title>Insert title here</title>
</head>
<body>
	
	 <div class="center">
     <h3>Welcome to Sporty Shoes</h3>
           
     	<form action="${pageContext.request.contextPath }/user" method="post">
        	<div class="txt_field">
         	<input type="submit" value="User Registration" required>       
        	</div>
       </form>
       <form action="${pageContext.request.contextPath}/admin" method="post">
       	 	<div class="txt_field">
         	<input type="submit" value="Admin Login" required>        
        	</div> 
      </form>
    
       </div>
</body>
</html>