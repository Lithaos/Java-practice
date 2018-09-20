
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="assets/css/bootstrap.css">
<title>Admin</title>
</head>
<body>
	<form:form action="/form" modelAttribute="form" method="post"> 
	
	Imie: <form:input path="imie" id="imie"></form:input>
		<form:errors path="imie" cssclass="error" />
		<br /> Adres email: <form:input path="email" id="email"></form:input>
		<form:errors path="email" cssclass="error" />
		<br /> Wiek: <form:input path="wiek" id="wiek"></form:input>
		<form:errors path="wiek" cssclass="error" />
		<br />
		<input type="submit" value="Wyslij formularz" />
	</form:form>
</body>
</html>