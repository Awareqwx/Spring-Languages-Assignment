<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p><a href="/languages">Dashboard</a></p>
<h2>${language.getName()}</h2>
<h4>${language.getCreator()}</h4>
<h4>${language.getVersion()}</h4>
<p><a href="/languages/edit/${index}">Edit</a></p>
<p><a href="/languages/delete/${index}">Delete</a></p>
</body>
</html>