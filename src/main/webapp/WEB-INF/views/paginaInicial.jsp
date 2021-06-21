<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BLOG</title>
<spring:url var="css" value="/static/css/bootstrap.css"></spring:url>
<link type="text/css" rel="stylesheet" href="${css}"/>
</head>
<body>
	<h1>Página aonde ficam os posts</h1>
	<form action="novoPost">
		<input type="submit" value="Fazer novo Post">
	</form>
	<form action="novoComentario">
		<input type="submit" value="Fazer novo Comentário">
	</form>
</body>
</html>