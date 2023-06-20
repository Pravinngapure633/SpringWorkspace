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
							value="<%=bu.getBookId()%>"></td>
						<td><%=bu.getBookId()%></td>
						<td><%=bu.getBookName()%></td>
						<td><%=bu.getBookPrice()%></td>
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