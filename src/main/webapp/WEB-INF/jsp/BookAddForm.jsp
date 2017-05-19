<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Add Book Form</title>
    <style type="text/css">@import url("<c:url value="/resources/css/main.css"/>");</style>
</head>
<body>
<div id="bookAddForm">
    <form:form commandName="book" action="book_save" method="post">
        <fieldset>
            <legend>Add a book</legend>
            <p>
                <label for="category">Category:</label>
                <form:select id="category" path="category.id"
                             items="${categories}" itemLabel="name" itemValue="id"/>
            </p>

            <p>
                <label for="title">Title:</label>
                <form:input id="title" path="title"/>
            </p>

            <p>
                <label for="author">Author :</label>
                <form:input id="author" path="author"/>
            </p>

            <p>
                <label for="isbn">ISBN :</label>
                <form:input id="isbn" path="isbn"/>
            </p>

            <p>
                <input id="reset" type="reset">
                <input id="submit" type="submit" value="Add Book">
            </p>

        </fieldset>
    </form:form>
</div>
</body>
</html>
