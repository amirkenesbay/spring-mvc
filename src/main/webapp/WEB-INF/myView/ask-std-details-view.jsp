<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Dear Student, Please enter your details</h2>
<br><br>
<%--@elvariable id="student" type="com"--%>
<form:form action = "showStudentDetails" modelAttribute = "student">
    Name <form:input path="name"/>
    <form:errors path="name"/>
    <br><br>
    Surname <form:input path="surname"/>
    <form:errors path="surname"/>
    <br><br>
    Age <form:input path="age"/>
    <form:errors path="age"/>
    <br><br>
    Course <form:select path="course">
    <form:options items="${student.courses}"/>
    </form:select>
    <br><br>
    What kind of sport do u prefer?
    <form:radiobuttons path="sport" items="${student.sports}"/>
    <br><br>
    <form:checkboxes path="subject" items="${student.subjects}"/>
    <br><br>
    Street <form:input path="street"/>
    <form:errors path="street"/>
    <br><br>
    Apartment <form:input path="apartment"/>
    <form:errors path="apartment"/>
    <br><br>
    Home <form:input path="home"/>
    <form:errors path="home"/>
    <br><br>
    Site <form:input path="site"/>
    <form:errors path="site"/>
    <br><br>
    Phone number <form:input path="phoneNumber"/>
    <form:errors path="phoneNumber"/>
    <br>
    <input type="submit" value="OK">
</form:form>
</body>
</html>
