<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form method="POST" modelAttribute="postagem" action="../updatePost/${id}">
	Título: <br><form:input path="titulo"/>
	<br><br>
	<form:textarea path="post"/>
	<br><br>
	<form:button>Editar Postagem</form:button>
</form:form>
</body>
</html>