<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<spring:url var="css" value="/static/css/bootstrap.css"></spring:url>
<link type="text/css" rel="stylesheet" href="${css}"/>
</head>
<body>
<form:form method="POST" modelAttribute="comentario" action="../updateComentario/${id}" >
	Nome: <br><form:input path="nome"/>
	<br><br>
	<form:textarea path="coment"/>
	<br><br>
	<form:button>Editar Comentário</form:button>
</form:form>
</body>
</html>