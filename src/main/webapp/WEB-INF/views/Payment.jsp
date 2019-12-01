<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">

	<div>Total Payment : ${total_Amount}/</div>
	
	<form action =<c:url value ="/receipt"/>" method ="post">
	<table class="table border">
		<tr>
			<td colspan="colspan =2">Payment Detail</td>
		</tr>
		<tr>
			<td>Payment Type</td>
			<td>
				<input type="radio" name="pmode" value="COD"/>COD
				<input type="radio" name="pmode" value="CC"/>CC
			</td>
		</tr>
		<tr>
			<td>Card Number</td>
			<td><input type="text" name="cardNo"/></td>
		</tr>
		<tr>
			<td colspan="2">Valid Upto<td><input type="text" name="valid"/>
			CVV<td><input type="text" name="cvv"/></td>
		</tr>
		<tr>
			<td>Name</td>
			<td><input type="text" name="uname"/></td>
		</tr>
		<tr>
			<input type="submit" value="Pay" clas="btn btn-primary"/>
		</tr>
	</table>
	</form>
	
	<div>Address : ${address}/</div>
</div>
</body>
</html>