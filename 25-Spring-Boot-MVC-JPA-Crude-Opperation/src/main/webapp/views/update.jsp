<%@page import="com.cjc.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>WELCOME TO UPDATE</h2>
	<hr>
	<%
		Employee stu = (Employee) request.getAttribute("emp");
	%>
	<div align="center">
		<form action="up">
			<label>ID :-<%=stu.getId()%>>
			</label> <input type="hidden" name="id" value="<%=stu.getId()%>"><br>
			<label>NAME :</label> <input type="text" name="name" value="<%=stu.getName()%>"><br> 
			<label>ADDRESS :</label> <input type="text" name="address" value="<%=stu.getAddress()%>"><br>
			 <label>SALARY :</label> <input type="text" name="salary" value="<%=stu.getSalary()%>"><br> 
			 <label>MOBILE_NO :</label> <input type="number" name="mobileno" value="<%=stu.getMobileno()%>"><br>

			<input type="submit" value="UPDATE">
		</form>
	</div>
</body>
</html>