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
	<form action="<c:url value ="/updateCategory"/>" method="post">
		<table>
			<tr>
				<td>Category Id</td>
				<td><input type = "text" name="catId" value = "${category.categoryId }" readonly></td>
			</tr>
			<tr>
				<td>Category Name</td>
				<td><input type = "text" name="catName" value = "${category.categoryName }"></td>
			</tr>
			<tr>
				<td>Category Description</td>
				<td><input type = "text" name="catDesc" value = "${category.categoryDesc }"></td>
			</tr>
			<tr>	
				<center>
				<td colspan="2">
				<input type="submit" value="Update Category"/>
				</center>
			</tr>
		</table>
	</form>
	
</body>
</html>