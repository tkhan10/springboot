<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">This is List of Contacts</h1>

	<table border="1" cellpadding="10">
		<tr>
			<th>Roll Number</th>
			<th>Name</th>
		</tr>
		<c:forEach items="${listContacts}" var="contacts">
			<tr>
				<td>${contacts.rollNumber}</td>
				<td>${contacts.name}</td>
			</tr>
		 </c:forEach>
	</table>

</body>
</html>