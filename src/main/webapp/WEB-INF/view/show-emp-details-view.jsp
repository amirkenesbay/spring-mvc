<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<body>
<h2>
    Dear Employee, you are WELCOME!!!
</h2>
<br>
<br>
<br>

<%--Your name: ${param.employeeName}--%>
Your name: ${employee.name}
<br>
Your surname: ${employee.surname}
<br>
Your salary: ${employee.salary}
<br>
Your department: ${employee.department}
<br>
Your car: ${employee.carBrand}
<br>
Languages (s):
<ul>
    <c:forEach var = "lang" items = "${employee.languages}">
        <li> ${lang} </li>
    </c:forEach>
</ul>

Phone number: ${employee.phoneNumber}
<br>
Email: ${employee.email}
<br>
<a href="/spring_course_mvc/employee/">Back to the main page</a>
</body>

</html>