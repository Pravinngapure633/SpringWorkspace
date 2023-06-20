<%@page import="com.cjc.model.Author"%>
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
function aregister() {
	document.ar.action="areg";
	document.ar.submit();
	
}
</script>
<body>
	<h2 align="center">**Welcome To Aurthor Details**</h2>
	<br>
	<h2><a href="b2">BACK</a></h2>
	<hr>
	<%
		List<Author> alist=(List<Author>)request.getAttribute("adata");
	%>
	<form name="ar">
		<div align="center">
			<table border="2px" cellspacing="10px">
				<thead>
					<tr>
						<th>select</th>
						<th >AuthorId</th>
						<th>AuthorName</th>
				</thead>
				<tbody>
				<%
					for(Author au: alist) {
				%>
				<tr>
				<td><input type="radio" name="aId" 
				value="<%=au.getaId()%>"></td>
				<td><%=au.getaId() %></td>
				<td><%=au.getaName() %></td>
				</tr>
				<%
					}
				%>
				
				</tbody>
			</table>
			<input type="button" onclick="aregister()" value="ADDAUTHOR">
		</div>
	</form>
</body>
</html>