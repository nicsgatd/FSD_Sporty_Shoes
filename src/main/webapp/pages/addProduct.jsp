<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

<link rel="stylesheet" href="pages/css/New1.css">
<title>Admin Login</title>
</head>
<body>
<jsp:include page="bar.jsp" />
     <div class="center">
            <h3>Add Product</h3>
            <form action="${pageContext.request.contextPath }/saveProduct"" method="post">
        <div class="txt_field">
          <input type="text" name="productName" required>
          <span></span>
          <label>product Name</label>
        </div>
        <div class="txt_field">
          <input type="text" name="price" required>
          <span></span>
          <label>Product Price</label>
        </div>
        
          <div class="txt_field">
          <input type="text" name="discription" required>
          <span></span>
          <label>Product Description</label>
        </div>
        <input type="submit" value="Login">
        
      </form>
        </div>

</body>
</html>