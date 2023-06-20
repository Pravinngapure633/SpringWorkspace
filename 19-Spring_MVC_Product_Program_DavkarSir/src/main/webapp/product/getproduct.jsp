<%@page import="com.cjc.model.Product"%>
<%@page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<body>
	<table border="2">
		<caption>
			<h3>List of Products</h3>
		</caption>
		<tr>
			<th>Product Id</th>
			<th>Product Name</th>
			<th>Product Price</th>
			<th>Product Quantity</th>
		</tr>
		<c:forEach var="product" items="${productList}">
			<tr>


				<td>${product.productId}</td>
				<td>${product.productName}</td>
				<td>${product.productPrice}</td>
				<td>${product.quantity }</td>


			</tr>
		</c:forEach>

	</table>

</body>
</html>
