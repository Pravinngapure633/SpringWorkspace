
<%@page import="com.cjc.model.Student"%>
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
	function addStudent() {
		alert("You are Adding new Student");
		document.myForm.action = "regPage";
		document.myForm.submit();
	}
	function editStudent() {
		alert("You are Deleting Student");
		document.myForm.action = "edit";
		document.myForm.submit();
	}
	function deleteStudent() {
		alert("You are Deleting Student");
		document.myForm.action = "delete";
		document.myForm.submit();
	}
</script>
<body>
	<h1>Welcome To Success</h1>
	<hr>
	<%
		List<Student> stuList = (List<Student>) request.getAttribute("data");
	%>
	<!-- template -->
	<div class="container">
		<form name="myForm">
			<table>
				<thead>
					<tr>
						<th>Select</th>
						<th>Rollno</th>
						<th>Name</th>
						<th>Marks</th>
						<th>Address</th>
					</tr>
				</thead>
				<tbody>
					<%
						for (Student stu : stuList) {
					%>
					<tr>
						<td><input type="radio" name="rollno"
							value="<%=stu.getRollno()%>"></td>
						<td><%=stu.getRollno()%></td>
						<td><%=stu.getName()%></td>
						<td><%=stu.getMarks()%></td>
						<td><%=stu.getAddress()%></td>
					</tr>
					<%
						}
					%>
				</tbody>
			</table>
			<input type="button" onclick="addStudent()" value="Add"> <input
				type="button" onclick="editStudent()" value="Edit"> <input
				type="button" onclick="deleteStudent()" value="Delete">
		</form>
	</div>
</body>
</html>