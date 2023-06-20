<%@page import="com.cjc.model.Book"%>
<%@page import="java.util.Set"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<script type="text/javascript">
	function register() {
		document.b.action = "reg";
		document.b.submit();
	}
</script>
<body>
	<h2 align="center">Welcome To Book</h2>

	<hr>
	
	<div align="center">
		<form  name="b">
			<label>BookID</label> <input type="text" name="id"><br>
			<label>BookName</label> <input type="text" name="name"><br>
			<label>BookPrice</label> <input type="text" name="price">
			<br> <input type="submit" onclick="register()" value="REGISTER">
		</form>
	</div>

</body>
</html>