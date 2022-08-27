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

<title>Dashboard</title>
</head>
<body>
<jsp:include page="bar.jsp" />


<div class="center" style="width: 80% !important;">
<h3 align="center" style="padding: 20px !important;">Users</h3>
          
     

 <div class="col-lg-12">
  <table id="usert" class="table" style="padding-left:20px">
  <thead>
    <tr>
      <th scope="col">Name</th>
      <th scope="col">Age</th>
      <th scope="col">Gender</th>
      <th scope="col">Email</th>
      <th scope="col">Address</th>
       <th scope="col">Action</th>
    </tr>
  </thead>
  <tbody>
  
   <c:forEach var="u" items="${user}">
	
	<tr scope="row">
	<td>${u.name}</td>
	<td>${u.age}</td>
	<td>${u.gender}</td>
	<td>${u.email}</td>
	<td>${u.address}</td>
	<td><a href="${pageContext.request.contextPath }/delete/${u.id}">Delete</a></td>
	</tr>
	
	</c:forEach>
  </tbody>
</table>

	 
	


 	 
    
</div>

<script type="text/javascript" charset="utf8" src="https://cdn.datatables.net/1.11.3/js/jquery.dataTables.min.js"></script>
<script>

$(document).ready( function () {
    $('#usert').DataTable();
} );
</script>
</body>
</html>