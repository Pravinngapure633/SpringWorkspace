<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<script type="text/javascript">
	function aregister() {
		document.a.action = "authorreg";
		document.a.submit();
	}
</script>
<body>
	<h2 align="center">Welcome To Author</h2>

	<hr>
	<div align="center">
		<form action="ar" name="a">

			<label>AuthorID</label> <input type="text" name="aId"><br>
			<label>AuthorName</label> <input type="text" name="aName"><br>
			<br> <input type="submit" onclick="aregister()"
				value="REGISTER">

		</form>
	</div>

</body>
</html>