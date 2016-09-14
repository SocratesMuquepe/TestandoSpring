<%-- 
    Document   : list
    Created on : 13/jul/2016, 22:12:49
    Author     : len
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>List of all Agents</h1>
        <c:forEach items="${list}" var="person">
            <p>Name: <b>${person.name}</b></p>
            <p>Age: <b>${person.age}</b></p>
        </c:forEach>
         <a href="<%=request.getContextPath()%>/">Inicio</a>
    </body>
</html>
