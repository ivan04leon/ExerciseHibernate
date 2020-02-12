<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Alta de libro</title>
</head>
<body>
	<h2>Alta de libro</h2>
	<form action="altasServlet" method="post">
	<p>
	<label>Nombre de libro</label>
	<input type="text" id="NombreLibro" name="txtNombreLibro">
	</p>
	<p>
	<input type="submit" value="Registrar libro">
	</p>
	
	</form>

</body>
</html>