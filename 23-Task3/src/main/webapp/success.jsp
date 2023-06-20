<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<script type="text/javascript">
	function book() {
		alert("Book");
		document.abc.action = "bo";
		document.abc.submit();
	}
	function author() {
		alert("author");
		document.abc.action = "au";
		document.abc.submit();
	}
	function publisher() {
		alert("publisher");
		document.abc.action = "pu";
		document.abc.submit();

	}
	function categories() {
		alert("categorie");
		document.abc.action = "ca";
		document.abc.submit();
	}
	function logout() {
		alert("Logout");
		document.abc.action = "lo";
		document.abc.submit();
	}
</script>
<body>
<h1>Welcome To Library</h1>

	
		<form name="abc">
		<div align="center">
			<input type="button" onclick="book()" value="BOOK"> <input
				type="button" onclick="author()" value="AURTHOR"> <input
				type="button" onclick="publisher()" value="PUBLISHER"> <input
				type="button" onclick="categories()" value=CATEGORIE>
	</div>
	<div align="right">
		<input type="button" onclick="logout()" value="LOGOUT">
	</div>
	</form>
</body>
</html>