<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Catalog</title>
</head>
<body>
<div class="container">
	<div class="row text-center text-lg-left">
			<c:forEach items="${productList }" var="product">
				<div class="col-md-3 col-sm-4 col-xs-12">
				 	<a href="<c:url value ="/totalProductDisplay/${product.productId }"/>" class ="d-block mb-4">
				 	 	<img class = "img-fluid img-thumbnail" src ="<c:url value ="/resources/images/${product.productId }.jpg"/> " width="100" height="100"/>
				 	 	<p>Price : ${product.price }</p>
				 	 	<p>Stock : ${product.stock }</p>
				 	</a>
				 	
				</div>
			</c:forEach>
	</div>

</div>
</body>
</html>