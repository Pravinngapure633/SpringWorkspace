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
	document.ar.action="areg";
	document.ar.submit();
	
}
</script>
<body>
	<h2 align="center">**Welcome To Aurthor Details**</h2>
	<hr>
	<form name="ar">
		<div align="center">
			<table border="2px" cellspacing="10px">
				<thead>
					<tr>
						<th>select</th>
						<th >AuthorId</th>
						<th>AuthorName</th>
						<th>AuthorDescription</th>
				</thead>
			</table>
			<input type="button" onclick="aregister()" value="ADDAUTHOR">
		</div>
	</form>
</body>
</html>