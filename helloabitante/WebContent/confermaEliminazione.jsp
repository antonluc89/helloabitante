<%@page import="java.util.List"%>
<%@page import="it.helloabitante.model.Abitante"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Id</title>
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
<div class="container">
	<table class="table table-hover">

		<%
			Abitante abitanteItem = (Abitante) request.getAttribute("abitanteDaRimuovere");
		%>


		<h1>
			Vuoi proprio eliminare l'abitante con id:<%=abitanteItem.getIdAbitante()%></h1>

		<form action="EliminazioneServlet?idDaInviareComeParametro=<%=abitanteItem.getIdAbitante() %>" method="post">

<input type="submit" value="Elimina">
</form>

	</table>
	</div>
	
</body>
</html>