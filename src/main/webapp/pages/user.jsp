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
            <h3>User Registration</h3>
  
		</form>
            
            <form action="${pageContext.request.contextPath }/userSave"" method="post">
        <div class="txt_field">
          <input type="text" name="name" required>
          <span></span>
          <label>Name</label>
        </div>
        <div class="txt_field">
          <input type="email" name="email" required>
          <span></span>
          <label>Email</label>
        </div>
        <div class= "row">
        <div class="col-lg-6 txt_field">
          <input type="text" name="age" required>
         
          <label>Age</label>
        </div>
          <div class="col-lg-6 txt_field">
          
           <select name="gender" class="form-control" id="exampleFormControlSelect1">  
     <option>Gender</option>
     <option>Male</option>
      <option>Female</option>
       <option>Others</option>
    </select>    
        </div>  
        </div>
          <div class="txt_field">
          <input type="text" name="address" required>
          <span></span>
          <label>Addresss</label>
        </div>
        <input type="submit" value="Login">
        
      </form>
        </div>

</body>
</html>