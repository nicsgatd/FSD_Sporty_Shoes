<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="pages/css/New.css">

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.11.3/css/jquery.dataTables.min.css">  



<title>Product</title>
</head>
<body>
<jsp:include page="bar.jsp" />


<div class="center" style="width: 80% !important;">
<h3 align="center" style="padding-top: 20px !important;">Products</h3>

<h4  style="text-align:center"><a href="${pageContext.request.contextPath }/addproduct"><img src="pages/img/4.jpg" width="25" height="20"></a></h4>
 

 <div class="col-lg-12" style="padding-left:5%;">
 <table id="prod" class="table">
  <thead>
  

    <tr>
      <th scope="col">Id</th>
      <th scope="col">Product Name</th>
      <th scope="col">Price</th>
      <th scope="col">Discription</th>
      <th scope="col">Action</th>
    </tr>
  </thead>
  <tbody>
  
   <c:forEach var="pro" items="${products}">
	
	<tr scope="row">
	<td>${pro.productId}</td>
	<td>${pro.productName}</td>
	<td>${pro.price}</td>
	<td>${pro.discription}</td>
	<td><a href="${pageContext.request.contextPath }/delete/${pro.productId}">Delete</a></td>
	</tr>
	
	</c:forEach>
  </tbody>
</table>

	 
	

 	 
    
</div>
<script type="text/javascript" charset="utf8" src="https://cdn.datatables.net/1.11.3/js/jquery.dataTables.min.js"></script>
<script>

$(document).ready( function () {
    $('#prod').DataTable();
} );
</script>
</body>
</html>