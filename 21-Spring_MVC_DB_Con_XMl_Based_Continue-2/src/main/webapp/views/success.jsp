<%@page import="com.cjc.model.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Welcome to success</h2>
	<hr>
	<%List<Student> stuList=(List<Student>)request.getAttribute("data"); %>
	
	<div align="center">
	<table border="2px" cellspacing="10px">
		<thead>
		<tr>
		<th>Rollno</th>
		<th>Name</th>
		<th>Marks</th>
		<th>Address</th>
		</tr>
		</thead>
		<tbody>
		<%for(Student stu:stuList) {%>
		<tr>
		<td><%=stu.getRollno() %></td>
		<td><%=stu.getName() %></td>
		<td><%=stu.getMarks() %></td>
		<td><%=stu.getAddress() %></td>
		</tr>
		<%} %>
		</tbody>
	</table>
</div>
</body>
</html>