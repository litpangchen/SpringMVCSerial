<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product Details</title>
    <link href="${pageContext.request.contextPath}/resources/css/main.css" rel="stylesheet" >
</head>
<body>
<div id="productDetails">
    <h4>The product has been saved</h4>
    <p>
    <h5>Details:</h5>
    Product Name : ${product.name} <br/>
    Description : ${product.description} <br/>
    Price : $${product.price}
    </p>
</div>
</body>
</html>
