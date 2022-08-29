<%--
  Created by IntelliJ IDEA.
  User: kaya
  Date: 29/08/2022
  Time: 11:50 am
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello JSP</title>
</head>
<body>
 <%
     String name = request.getParameter("name");
     String surname = request.getParameter("surname");
 %>
<h1> <%="Hello, " + name + " " + surname + "!" %> </h1>
</body>
</html>
