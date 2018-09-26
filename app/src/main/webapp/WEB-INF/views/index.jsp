<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>dodaj konto</title>
</head>
<body>
	<form:form action="/formularz" modelAttribute="form" method="post">Imię: <form:input
			path="imie" id="imie"></form:input>
	
		<br />
		Adres email: <form:input path="email" id="email"></form:input>
		
		<br /> Wiek: <form:input path="wiek" id="wiek"></form:input>
	
		${form.imie}
		<br/>
		<input type="submit" value="Wyślij formularz" />
	</form:form>
</body>
</html>