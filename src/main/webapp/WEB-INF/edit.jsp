<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <form:form action="/languages/update/${index}" method="post" modelAttribute="newLanguage">
        <h3>Editing ${oldLanguage.getName()}</h3>
        <form:label path="name">Name: 
        <form:input path="name" value="${oldLanguage.getName()}"/><br/>
        <form:errors path="name"/>
        </form:label><br/>
        <form:label path="creator">Creator: 
        <form:input path="creator" value="${oldLanguage.getCreator()}"/><br/>
        <form:errors path="creator"/>
        </form:label><br/>
        <form:label path="version">Version: 
        <form:input path="version" value="${oldLanguage.getVersion()}"/><br/>
        <form:errors path="version"/>
        </form:label><br/>
        <input type="submit">
    </form:form>
</body>
</html>