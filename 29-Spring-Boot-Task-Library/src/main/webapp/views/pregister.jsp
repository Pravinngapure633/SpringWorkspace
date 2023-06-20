<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<script type="text/javascript">
	function pregister() {
		document.p.action = "pubreg";
		document.p.submit();
	}
</script>
<body>
	<h2 align="center">Welcome To Publisher</h2>

	<hr>
	<div align="center">
		<form action="br" name="p">
			<label>publishId</label> <input type="text" name="pID"><br>
			<label>publishName</label> <input type="text" name="pName"><br>
			<br> <input type="submit" onclick="pregister()" value="REGISTER">
		</form>
	</div>

</body>
</html>