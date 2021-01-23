<%@page import="java.util.List"%>
<%@page import="it.helloabitante.model.Abitante"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Id</title>
<style type="text/css">
	table, th, td {
	  border: 1px solid black;
	}
	
	th, td {
	  padding: 10px;
	}
	.center {
		margin-left: auto;
		margin-right: auto;
	}
</style>

</head>
<body>

	<table class="center">

		<%
			Abitante abitanteItem = (Abitante) request.getAttribute("abitanteDaRimuovere");
		%>


		<h1>
			Vuoi proprio eliminare l'abitante con id:<%=abitanteItem.getIdAbitante()%></h1>

		<form action="EliminazioneServlet?idDaInviareComeParametro=<%=abitanteItem.getIdAbitante() %>" method="post">

<input type="submit" value="Elimina">
</form>

	
	
</body>
</html>