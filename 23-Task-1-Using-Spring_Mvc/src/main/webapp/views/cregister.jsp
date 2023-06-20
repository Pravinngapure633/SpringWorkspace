<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<script type="text/javascript">
function cregister(){
	document.c.action="categoriesreg"
	document.c.submit();
}
</script>
<body>
<h2 align="center">Welcome To Categ</h2>

<hr>
	<div align="center">
	<form action="br" name="c">
	<label>categorieId</label> 
	<input type="text" name="categorieId"><br>
	<label>categorieName</label> 
	<input type="text" name="categorieName"><br>
	
	<input type="submit" onclick="cregister()" value="REGISTER">
	</form>
	</div>
</body>
</html>