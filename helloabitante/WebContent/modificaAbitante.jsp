<%@page import="it.helloabitante.model.Abitante"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MODIFICA ABITANTE</title>
</head>
<body>

 <% 
	Abitante abitanteItem = (Abitante)request.getAttribute("abitanteDaModificare");

 %>
 
<table width="80" id="customers" id="Add">



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
</body>
</html>