<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	<!DOCTYPE html>
	<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>BLOG DE FULANA</title>
	</head>
	<style>
		body {
		  font-family: Arial, Helvetica, sans-serif;
		  background-color: #ACE1AF;
		}
		
		h1 {color: #789d7c;text-align: center;}
		
		* {
		  box-sizing: border-box;
		}
		
		/* Add padding to containers */
		.container {
		  padding: 16px;
		  background-color: #e1ffe4;
		}
		
		/* Full-width input fields */
		input[type=text] {
		  width: 100%;
		  padding: 15px;
		  margin: 5px 0 22px 0;
		  display: inline-block;
		  border: none;
		  background: #f1f1f1;
		}
		
		input[type=text]:focus {
		  background-color: #a6d4abe1;
		  outline: none;
		}
		
		/* Overwrite default styles of hr */
		hr {
		  border: 1px solid gray;
		  margin-bottom: 25px;
		}
		
		/* Set a style for the submit button */
		.registerbtn {
		  background-color: #04AA6D;
		  color: white;
		  padding: 16px 20px;
		  margin: 8px 0;
		  border: none;
		  cursor: pointer;
		  width: 100%;
		  opacity: 0.9;
		}
		
		.registerbtn:hover {
		  opacity: 1;
		}
		
		/* Set a grey background color and center the text of the "sign in" section */
		.signin {
		  background-color: #f1f1f1;
		  text-align: center;
		}
		</style>
		
		</head>
		<body>
		<form>
		  <div class="container">
			<h1>Adicionar um post</h1>
			<hr>
		
			<label for="titulo"><b>Título</b></label>
			<input type="text" placeholder="Digite o título..." name="titulo" id="titulo" required>
			<label for="post"><b>Post</b></label>
			<input type="text" placeholder="Escreva o seu post..." name="post" id="post" required>
			<hr>
			<button type="submit" class="registerbtn">Postar</button>
		  </div>
		</form>
	</body>
	</html>