<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Novo Comentário</title>
</head>
<body>

<form:form method="POST" modelAttribute="comentario" action="criarComentario">
	Nome: <br><form:input path="nome"/>
	<br><br>
	<form:textarea path="coment"/>
	<br><br>
	<form:button>Fazer Comentário</form:button>
</form:form>
	<p>
		<table>
			<thead>
				<tr>
				<th>NOME</th>
				<th>COMENTÁRIO</th>
				<th>AÇÃO</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var = "comentario" items = "${comentarios}">
					<tr>
						<td>${comentario.nome}</td>
						<td>${comentario.coment}</td>
						<td>
							<a href="editar/${comentarios.indexOf(comentario)}">EDITAR</a>
							<a href="excluir/${comentarios.indexOf(comentario)}">EXCLUIR</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	<p>
</body>
</html>