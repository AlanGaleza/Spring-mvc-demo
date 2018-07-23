<%--
  Created by IntelliJ IDEA.
  User: Alan
  Date: 15.07.2018
  Time: 18:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Student Registration Form</title>
</head>
<body>
    <form:form action="processForm" modelAttribute="student">
        First name: <form:input path="firstName" />
        <br><br>
        Last name: <form:input path="lastName" />
        <br><br>
        Country
        <br><br>
        <form:select path="country">

            <%-- for external txt file - lesson 132>
            <form:options items="${theCountryOptions}" /> --%>
            <%-- for java obj --%>
            <form:options items="${student.countryOptions}" />
            <%-- hardcoded --%>
            <form:option value="UK" label="UK" />

        </form:select>
        <br><br>

        Java <form:radiobutton path="favouriteLanguage" value="Java" />
        C# <form:radiobutton path="favouriteLanguage" value="C#" />
        PHP <form:radiobutton path="favouriteLanguage" value="PHP" />
        Ruby <form:radiobutton path="favouriteLanguage" value="Ruby" />

        <br><br>

        <br><br>
        <input type="submit" value="Submit" />
    </form:form>



</body>
</html>
