<%@page import="com.cjc.model.Publisher"%>
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
function pregister() {
	document.pr.action="preg";
	document.pr.submit();
}
</script>
<body>
	<h2 align="center">**Welcome To Publisher Details**</h2><br>
	<br>
	<h2><a href="b3">BACK</a></h2>
	<hr>
	
	<%
		List<Publisher> plist=(List<Publisher>)request.getAttribute("pdata");
	%>
	<form name="pr">
	<div align="center">
		<table border="2px" cellspacing="10px">
			<thead>
				<tr>
					<th>select</th>
					<th>PublishId</th>
					<th>PublishName</th>
				</tr>
			</thead>
			<tbody>
			<%
				for(Publisher pu:plist) {
			%>
			<tr>
			<td><input type="radio" name="pId" 
			value="<%=pu.getpId() %>>"></td>
			<td><%=pu.getpId() %></td>
			<td><%=pu.getpName() %></td>
			</tr>
			<%
				}
			%>
			
			
			</tbody>
		</table>
		<input type="button" onclick="pregister()" value="ADDPUBLISHER">
	</div>
	</form>
</body>
</html>