<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<title>Projekt</title>
</head>
<body>
	<h1>Fomularz dodawania rodziny.</h1>
	<p>Wprowadz dane do formularza</p>
	<form action = "/" method="post">
		Podaj nazwisko <input type="text" name="nazwisko" value="nazwisko">  <br>
		
		Podaj Imię <input type="text" name="imie" value="imie"> <br>
		
		Podaj Pesel <input type="number" name="pesel" value="numer"> <br>
		
		Podaj Adres <input type="text" name="adres" value="Adres"> <br>
		 <input type="submit" value="Wyślij">
	</form>
</body>
</html>