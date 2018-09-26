<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<h1>Dziękuje za rejestrację!</h1>
	<h2>Dane które wprowadziłeś:</h2>
	 <p><%= request.getParameter("imie")%></p>
	 <p><%= request.getParameter("email")%></p>
	 <p><%= request.getParameter("wiek")%></p>
