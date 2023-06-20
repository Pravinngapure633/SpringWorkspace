<%@page import="java.util.List"%>
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
	function bregister() {
		document.bk.action = "breg";
		document.bk.submit();
	}
	function bdelete() {
		alert("Delete")
		document.bk.action="bdel";
		document.bk.submit();
		
	}
	function bedit() {
		doucment.bk.action = "beid";
		document.bk.submit();
	}
</script>
<body>
	<h2 align="center">**Welcome To Book Details**</h2>
	<br>
	<h2><a href="back">BACK</a></h2>
	<hr>
	<%
		List<Book> list = (List<Book>) request.getAttribute("data");
	%>
	<form name="bk">
		<div align="center">
			<table border="2px" cellspacing="10px">
				<thead>
					<tr>
						<th>select</th>
						<th>BookID</th>
						<th>BookName</th>
						<th>BookPrice</th>
					</tr>
				</thead>
				<tbody>
					<%
						for (Book bu : list) {
					%>
					<tr>
						<td><input type="radio" name="bookId"
							value="<%=bu.getId()%>"></td>
						<td><%=bu.getId()%></td>
						<td><%=bu.getName()%></td>
						<td><%=bu.getPrice()%></td>
						<%-- <td><%=bu.getAuthor().getaId()%></td>
						<td><%=bu.getAuthor().getaName()%></td> --%>
						
					</tr>
					<%
						}
					%>
				</tbody>
			</table>
			<input type="button" onclick="bregister()" value="ADDBOOK"> <input
				type="button" onclick="bdelete()" value="DELETEBOOK"> <input
				type="button" onclick="bedit()" value="EDITBOOK">
		</div>
	</form>

</body>
</html>