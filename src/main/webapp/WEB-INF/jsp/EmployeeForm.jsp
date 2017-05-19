<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Employee Form</title>
</head>
<body>
<form:form commandName="employee" action="employee_save" method="post">

    <form:errors path="firstName"/>

    <fieldset>
        <legend>Add an employee.</legend>

        <p>
            <label for="firstName">First Name:</label>
            <form:input path="firstName"/>
        </p>

        <p>
            <label for="lastName">Last Name:</label>
            <form:input path="lastName"/>
        </p>

        <form:errors path="birthDate"/>

        <p>
            <label for="birthDate">Birth Date</label>
            <form:input path="birthDate"/>
        </p>

        <p>
            <input id="reset" type="reset"/>
            <input id="submit" type="submit" value="Add Employee">
        </p>

    </fieldset>
</form:form>
</body>
</html>
