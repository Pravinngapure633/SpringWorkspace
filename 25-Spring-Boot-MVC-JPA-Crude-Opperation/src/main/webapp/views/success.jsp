

<%@page import="com.cjc.model.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
html, body {
	height: 100%;
}

body {
	margin: 0;
	background: linear-gradient(45deg, #80ffff, black);
	/*background: linear-gradient(45deg, #e6ffff, #5f2c82);*/
	font-family: sans-serif;
	font-weight: 100;
}

.container {
	position: absolute;
	top: 50%;
	left: 50%;
	transform: translate(-50%, -50%);
}

table {
	width: 800px;
	border-collapse: collapse;
	overflow: hidden;
	box-shadow: 0 0 20px rgba(0, 0, 0, 0.1);
}

th, td {
	padding: 15px;
	background-color: rgba(255, 255, 255, 0.2);
	color: #fff;
}

th {
	text-align: left;
}

thead {th { background-color:#55608f;
	
}

}
tbody {tr { &:hover {background-color : rgba(255, 255, 255, 0.3);
	
}

}
td {
	position: relative; &: hover { & : before {  
 content : "";
	position: absolute;
	left: 0;
	right: 0;
	top: -9999px;
	bottom: -9999px;
	background-color: rgba(255, 255, 255, 0.2);
	z-index: -1;
}
}
}
}
</style>
</head>
<script type="text/javascript">
	function addEmployee() {
		alert("You are Adding new Employee");
		document.myForm.action = "regPage";
		document.myForm.submit();
	}
	function editEmployee() {
		alert("You are Deleting Employee");
		document.myForm.action = "edit";
		document.myForm.submit();
	}
	function deleteEmployee() {
		alert("You are Deleting Employee");
		document.myForm.action = "delete";
		document.myForm.submit();
	}
</script>
<body>
	<h1>Welcome To Success</h1>
	<hr>
	<%
		List<Employee> empList = (List<Employee>) request.getAttribute("data");
	%>
	<!-- template -->
	<div class="container">
		<form name="myForm">
			<table>
				<thead>
					<tr>
						<th>Select</th>
						<th>ID</th>
						<th>NAME</th>
						<th>ADDRESS</th>
						<th>SALARY</th>
						<th>MOBILE_NO</th>
					</tr>
				</thead>
				<tbody>
					<%
						for (Employee emp : empList) {
					%>
					<tr>
						<td><input type="radio" name="id" value="<%=emp.getId()%>"></td>
						<td><%=emp.getId() %></td>
						<td><%=emp.getName()%></td>
						<td><%=emp.getAddress()%></td>
						<td><%=emp.getSalary()%></td>
						<td><%=emp.getMobileno()%></td>
					</tr>
					<%
						}
					%>
				</tbody>
			</table>
			<input type="button" onclick="addEmployee()" value="Add"> <input
				type="button" onclick="editEmployee()" value="Edit"> <input
				type="button" onclick="deleteEmployee()" value="Delete">
		</form>
	</div>
</body>
</html>