<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Show details</title>
</head>
<body>
<h2>Dear Student, you are WELCOME!!!</h2>
<br><br>
Your name: ${student.name}
<br>
Your surname: ${student.surname}
<br>
Your age: ${student.age}
<br>
Your course: ${student.course}
<br>
Your sport: ${student.sport}
<br>
<ul>
    <c:forEach var="subj" items="${student.subjects}">
        <li>${subj}</li>
    </c:forEach>
</ul>
Your street: ${student.street}
<br>
Your apartment: ${student.apartment}
<br>
Your home: ${student.home}
<br>
Your site: ${student.site}
<br>
Your phone number: ${student.phoneNumber}
<br>
<a href="/mvc2/student/">Back to the main page</a>
</body>
</html>
