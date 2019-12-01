<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Manage Products</title>
</head>
<body>
<form:form action="${pageContext.request.contextPath}/InsertProduct" enctype="multipart/form-data" method="post" modelAttribute="product">
<table align="center" >
	<tr>
		<td>Product Name</td>
		<td><form:input path="productName"/></td>
	</tr>
	<tr>
		<td>Product Price</td>
		<td><form:input path="price"/></td>
	</tr>
	<tr>
		<td>Stock</td>
		<td><form:input path="stock"/></td>
	</tr>
	<tr>
		<td>Category</td>
		<td><form:select path="categoryId">
			<form:option value="0" label="--Select List--"/>
			<form:options items="${categoryList}"/>
			</form:select>
		</td>
	</tr>
	<tr>
		<td>Supplier</td>
		<td><form:input path="supplierId"/></td>
	</tr>
	<tr>
		<td>Product Desc</td>
		<td><form:input path="productDesc"/></td>
	</tr>
	<tr>
		<td>Product Image</td>
		<td><form:input type="file" path="pimage"/></td>
	</tr>
	<tr>	
		
		<td colspan="2">
			<center><input type="submit" value="Insert Product"/></center>
		</td>
	</tr>
</table>
</form:form>

<table>
<tr>
	<td>Product ID</td>
	<td>Product Name</td>
	<td>Category</td>
	<td>Price</td>
	<td>Supplier</td>
	<td>Operation</td>
</tr>
<c:forEach items= "${productList }" var="product">
		<tr>
			<td>${product.productId }</td>
			<td>${product.productName }</td>
			<td>${product.categoryId}</td>
			<td>${product.price }</td>
			<td>${product.supplierId }</td>
			<td>
				<a href="<c:url value="/deleteProduct/${product.productId }"/>">Delete</a>
				<a href="<c:url value="/editProduct/${product.productId }"/>">Edit</a> 
			</td>
		</tr>
</c:forEach>
</table>
</body>
</html>