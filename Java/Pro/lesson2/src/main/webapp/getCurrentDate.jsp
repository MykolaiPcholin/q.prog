<%@ page import="java.time.DayOfWeek" %>
<%@ page import="java.time.LocalDate" %><%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 21.02.2023
  Time: 15:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
        response.getWriter().println(dayOfWeek);
    %>
    <%= LocalDate.now().getDayOfMonth()%>
</body>
</html>
