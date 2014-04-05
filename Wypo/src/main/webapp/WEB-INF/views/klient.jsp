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
<form:form action="klient.do" method="POST" commandName="klient">
	<table>
		<tr>
			<td>klient ID</td>
			<td><form:input path="pesel" /></td>
			<td><form:input path="imie" /></td>
			<td><form:input path="nazwisko" /></td>
			<td><form:input path="telefon" /></td>
			<td><form:input path="stan" /></td>
			<td><form:input path="miejscowosc" /></td>
			<td><form:input path="ulica" /></td>
			<td><form:input path="poczta" /></td>
			<td><form:input path="kodPocztowy" /></td>
						<td><form:input path="email" /></td>
			
						<td><form:input path="nrDomu" /></td>
			
		</tr>
		<tr>
			<td>First name</td>
			<td><form:input path="imie" /></td>
		</tr>
		<tr>
			<td>Last name</td>
			<td><form:input path="nazwisko" /></td>
		</tr>
		<tr>
			<td>Year Level</td>
			<td><form:input path="stan" /></td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" name="action" value="Add" />
				<input type="submit" name="action" value="Edit" />
				<input type="submit" name="action" value="Delete" />
				<input type="submit" name="action" value="Search" />
			</td>
		</tr>
	</table>
</form:form>
<br>
<table border="1">
	
	<c:forEach var="klient" items="${klientP}" >
		<tr>
			<td>${klient.pesel}</td>
			<td>${klient.imie}</td>
			<td>${klient.nazwisko}</td>
			<td>${klient.telefon}</td>
			<td>${klient.stan}</td>
			<td>${klient.miejscowosc}</td>
			<td>${klient.ulica}</td>
			<td>${klient.poczta}</td>
			<td>${klient.kodPocztowy}</td>
			<td>${klient.email}</td>
	
		</tr>
	</c:forEach>
</table>
</body>
</html>