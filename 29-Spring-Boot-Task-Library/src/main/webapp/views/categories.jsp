<%@page import="com.cjc.model.Categories"%>
<%@page import="java.util.List"%>
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
	<br>
	<h2><a href="b4">BACK</a></h2>
	<hr>
	
	<%
		List<Categories> clist = (List<Categories>) request.getAttribute("cdata");
	%>
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
			<tbody>
					<%
						for (Categories ca : clist) {
					%>
					<tr>
						<td><input type="radio" name="cId"
							value="<%=ca.getcId()%>"></td>
						<td><%=ca.getcId()%></td>
						<td><%=ca.getcName()%></td>
						
					</tr>
					<%
						}
					%>
				</tbody>
		</table>
		<input type="button" onclick="cregister()" value="ADDCATEGORIES">
	</form>
	</div>
</body>
</html>