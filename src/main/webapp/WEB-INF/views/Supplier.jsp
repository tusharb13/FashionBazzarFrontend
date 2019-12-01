<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="<c:url value ="/insertSupplier"/>" method="post">
		<table>
			<tr>
				<td>Supplier Name</td>
				<td><input type = "text" name="sname"></td>
			</tr>
			<tr>
				<td>Supplier Description</td>
				<td><input type = "text" name="supDesc"></td>
			</tr>
			<tr>	
				<center>
				<td colspan="2">
				<input type="submit" value="SUMBIT"/>
				</center>
			</tr>
		</table>
	</form>
	<table>
		<tr>
			<td>Supplier ID</td>
			<td>Supplier Name</td>
			<td>Supplier Desc</td>
			<td>Operation</td>
		</tr>
		<c:forEach items= "${supplierList }" var="supplier">
		<tr>
			<td>${supplier.supplierId }</td>
			<td>${supplier.supplierName }</td>
			<td>${supplier.supplierAddress }</td>
			<td>
				<a href="<c:url value="/deleteSupplier/${supplier.supplierId }"/>">Delete</a>
				<a href="<c:url value="/editSupplier/${supplier.supplierId }"/>">Edit</a> 
			</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>