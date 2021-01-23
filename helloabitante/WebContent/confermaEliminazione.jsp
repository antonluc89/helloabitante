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
		
		<% Abitante abitanteItem=(Abitante)request.getAttribute("abitanteDaRimuovere");%>
	
            <tr>
            
                <td width="5%"><%=abitanteItem.getIdAbitante() %></td>
				<td width="20%"><%=abitanteItem.getNome() %></td>
				<td width="20%"><%=abitanteItem.getCognome() %></td>
				<td width="20%"><%=abitanteItem.getEta() %></td>
				<td width="20%"><%=abitanteItem.getMottoDiVita() %></td>


  	<form action="EliminazioneServlet" method="post">
       <td width="20%"> <input type="submit" name="idDaInviareDaEliminare" value="Delete" /></td>
        <input type="hidden" name="idDaInviareDaEliminare" value="<%=abitanteItem.getIdAbitante()%>" />
    </form>

	</table>
	
	
</body>
</html>