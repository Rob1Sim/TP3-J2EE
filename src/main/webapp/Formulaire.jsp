<%--
  Created by IntelliJ IDEA.
  User: robis
  Date: 05/11/2024
  Time: 08:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/equation" method="post">
    <label for="a">a:</label>
    <input type="number" id="a" name="a"><br><br>

    <label for="b">b:</label>
    <input type="number" id="b" name="b"><br><br>

    <label for="c">c:</label>
    <input type="number" id="c" name="c"><br><br>

    <input type="submit" value="Envoyer">
</form>
</body>
</html>
