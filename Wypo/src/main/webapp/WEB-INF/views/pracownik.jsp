<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/views/includes.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Management</title>
</head>
<body>
<h1>Klients Data</h1>

<table border="1">
	
	<c:forEach var="pracownik" items="${pracownikP}" >
		<tr>
			<td>${pracownik.imie}</td>
			<td>${pracownik.nazwisko}</td>
			<td>${idPunkt.miejscowosc}</td> 
			
	
		</tr>
	</c:forEach>
</table>
</body>
</html>