<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/index.css">
</head>
<body>
    <table>
        <tr>
            <th>Name</th>
            <th>Creator</th>
            <th>Version</th>
            <th>Actions</th>
        </tr>
        <c:forEach var="language" items="${languages}" varStatus="loop">
            <tr>
                <td><a href="/languages/${loop.index}">${language.getName()}</a></td>
                <td>${language.getCreator()}</td>
                <td>${language.getVersion()}</td>
                <td><a href="/languages/edit/${loop.index}">Edit</a> <a href="/languages/delete/${loop.index}">Delete</a></td>
            </tr>
        </c:forEach>
    </table>
    <form:form method="post" action="/languages/add" modelAttribute="language">
        <h3>Add new language</h3>
        <form:label path="name">Name: 
        <form:input path="name"/><br/>
        <form:errors path="name"/>
        </form:label><br/>
        <form:label path="creator">Creator: 
        <form:input path="creator"/><br/>
        <form:errors path="creator"/>
        </form:label><br/>
        <form:label path="version">Version: 
        <form:input path="version"/><br/>
        <form:errors path="version"/>
        </form:label><br/>
        <input type="submit">
    </form:form>
</body>
</html>