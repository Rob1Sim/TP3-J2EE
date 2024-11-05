<%--
  Created by IntelliJ IDEA.
  User: robis
  Date: 05/11/2024
  Time: 09:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Test</h1>
    <%
        int result = (int) request.getAttribute("result");
        int a = (int) request.getAttribute("a");
        int b = (int) request.getAttribute("b");

        if (result < 0) {
    %>
    <h1 style="color:red">pas de racines réelles</h1>
    <%
        }else if(result == 0) {
            double valeurNull =  ((double) (-b) /(2*a));
    %>
        <h1 style="color:blue">Racine : <%=valeurNull%></h1>
    <%}else {
        double a1 =  ((-b + Math.sqrt(result)) /(2*a));
        double a2 =  ((-b - Math.sqrt(result)) /(2*a));

    %>
    <h1 style="color:blue">Racine 1 : <%=a1%></h1>
    <h1 style="color:blue">Racine 2 : <%=a2%></h1>

    <%
        }
    %>
</body>
</html>
