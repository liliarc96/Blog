<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Novo Post</title>
<spring:url var="css" value="/static/css/bootstrap.css"></spring:url>
<link type="text/css" rel="stylesheet" href="${css}"/>
</head>
<body>

<form:form method="POST" modelAttribute="postagem" action="criarPost">
	Título: <br><form:input path="titulo"/>
	<br><br>
	<form:textarea path="post"/>
	<br><br>
	<form:button>Fazer Postagem</form:button>
</form:form>
	<p>
		<table>
			<thead>
				<tr>
				<th>TÍTULO</th>
				<th>POST</th>
				<th>AÇÃO</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach var = "postagem" items = "${postagens}">
				<tr>
					<td>${postagem.titulo}</td>
					<td>${postagem.post}</td>
					<td>
						<a href="editar/${postagens.id}">EDITAR</a>
						<a href="excluir/${posagens.id}">EXCLUIR</a>
					</td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
	<p>
</body>
</html>