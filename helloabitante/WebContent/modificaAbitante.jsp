<%@page import="it.helloabitante.model.Abitante"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MODIFICA ABITANTE</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	crossorigin="anonymous"></script>
</head>
<body>

 <% 
	Abitante abitanteItem = (Abitante)request.getAttribute("abitanteDaModificare");

 %>
 
<div class="container">
	<table class="table table-hover">



<tr>
<form action="ModificaServlet?idDaInviareComeParametro=<%=abitanteItem.getIdAbitante() %>" method="Post">
		<label for="nomeInputId">NOME:</label><br>
		<input type="text" name="nomeModify" id="nomeInputId" value="<%=abitanteItem.getNome()%>">
		<br>
		<label for="cognomeInputId">COGNOME:</label><br>
		<input type="text" name="cognomeModify" id="cognomeInputId" value="<%=abitanteItem.getCognome()%>">
		<br>
		<label for="codiceFiscaleInputId">CODICE FISCALE:</label><br>
		<input type="text" name="codiceFiscaleModify" id="codiceFiscaleInputId" value="<%=abitanteItem.getCodiceFiscale()%>">
		<br>
		<label for="etaInputId">ETA:</label><br>
		<input type="text" name="etaModify" id="etaInputId" value="<%=abitanteItem.getEta()%>">
		<br>
		<label for="mottoDiVitaId">MOTTO DI VITA:</label><br>
		<input type="text" name="mottoDiVitaModify" id="mottoDiVitaInputId" value="<%=abitanteItem.getMottoDiVita()%>">
			<br><br>
	<input type="submit" value="UPDATE">
	</form>


</table>
</div>
</body>
</html>