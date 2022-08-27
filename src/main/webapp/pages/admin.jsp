<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<link rel="stylesheet" href="pages/css/New1.css">
<title>Admin Login</title>
</head>
<body>
     <div class="center">
            <h3>Admin Login</h3>
            
            <form action="logAdmin" method="post">
            <h4 style="text-align:center">${errorMsg}</h4>
        <div class="txt_field">
          <input type="text" name="username" required>
          <span></span>
          <label>Username</label>
        </div>
        <div class="txt_field">
          <input type="password" name="password" required>
          <span></span>
          <label>Password</label>
        </div>
        <input type="submit" value="Login">
         </form>
        <div class="row">
      
        
        <div class="col-lg-5" style="padding:0; margin:0">
           <form action="${pageContext.request.contextPath }/register" method="post">
         <input type="submit" value="Register">
          </form>
          </div>
         
          <div class="col-lg-7" style=" margin:0">
          <form action="${pageContext.request.contextPath }/updatePassword" method="GET">
          
          <input type="submit" value="Forget Password" >
         </form>
         
         </div>
         </div>
      
        </div>

</body>
</html>