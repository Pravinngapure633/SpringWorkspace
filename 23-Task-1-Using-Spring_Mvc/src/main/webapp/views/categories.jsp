<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<script type="text/javascript">
function cregister() {
	document.cs.action="creg";
	document.cs.submit();
}
</script>
<body>
	<h2 align="center">**Welcome To Categories Details**</h2><br>
	<hr>
	<div align="center">
	<form name="cs">
		<table border="2px" cellspacing="10px">
			<thead>
				<tr>
					<th>select</th>
					<th>CategorieId</th>
					<th>CategorieName</th>
				</tr>
			</thead>
		</table>
		<input type="button" onclick="cregister()" value="ADDCATEGORIES">
	</form>
	</div>
</body>
</html>