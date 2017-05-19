<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Product Form</title>
    <link href="${pageContext.request.contextPath}/resources/css/main.css" rel="stylesheet">
</head>
<body>

<div id="ProductForm">
    <form:form commandName="product" action="product_save" method="post">
        <fieldset>
            <legend>Add a product</legend>
            <form:errors path="name"/>
            <p>
                <label for="name">Product Name:</label>
                <form:input path="name"/>
            </p>

            <p>
                <label for="description">Description :</label>
                <form:input path="description"/>
            </p>

            <p>
                <label for="price">Price :</label>
                <form:input path="price"/>
            </p>

            <p>
                <label for="productionDate">Production Date:</label>
                <form:input path="productionDate"/>
            </p>

            <p>
                <input id="reset" type="reset">
                <input id="submit" type="submit" value="Add Product">
            </p>
        </fieldset>
    </form:form>
</div>
</body>
</html>
