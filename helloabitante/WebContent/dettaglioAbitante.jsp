<%@page import="java.util.List"%>
<%@page import="it.helloabitante.model.Abitante"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dettaglio abitante</title>
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
	
		
		<% Abitante abitanteItem=(Abitante)request.getAttribute("abitantedaInviareAPaginaDettaglio");%>
						
			
				<tr>
					<td><%=abitanteItem.getIdAbitante() %></td>
				<td><%=abitanteItem.getNome() %></td>
				<td><%=abitanteItem.getCognome() %></td>
				<td><%=abitanteItem.getCodiceFiscale()%></td>
				<td><%=abitanteItem.getEta() %></td>
				<td><%=abitanteItem.getMottoDiVita() %></td>
					<td>
			
						<a href="PreparaModificaServlet?idDaInviareComeParametro=<%=abitanteItem.getIdAbitante() %>">Modifica</a>
					</td>
				</tr>
		<% %>
				
	</table>
	
	
</body>
</html>