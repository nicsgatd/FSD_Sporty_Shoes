<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="pages/css/New.css">

<title>Dashboard</title>
</head>
<body>
<jsp:include page="bar.jsp" />


     <div class="center">
       <h3>Purchase</h3>
       <form action="${pageContext.request.contextPath }/saveOrder" method="post">    
        <div class="txt_field">
        <select name="productName" class="form-select form-select-lg mb-3" aria-label=".form-select-lg example">
 		 <option selected>Select Product</option>
 		 <c:forEach var="pro" items="${products}">
 		 <option value="${pro.productName}">${pro.productName}</option>
		  </c:forEach>
		  </select>
          </div>
        <div class="txt_field">
        <select name="email" class="form-select form-select-lg mb-3" aria-label=".form-select-lg example">
 		<option selected>Email</option>
 		 <c:forEach var="u" items="${user}">
  		<option value="${u.email}">${u.email}</option> 
		</c:forEach>
		</select>   
        </div>
        
         <div class="txt_field">
          <input type="text" name="purchasedate">
          <label>Date</label>
        </div>
 
          <div class="txt_field">      
          <select name="price" class="form-select form-select-lg mb-3" aria-label=".form-select-lg example">
 		  <option selected>Select Product</option>
           <c:forEach var="pro" items="${products}">
          <option value="${pro.price}">${pro.price}</option> 
          </c:forEach>
          </select>
          </div>
        <input type="submit" value="Submit">
      </form>
</body>
</html>