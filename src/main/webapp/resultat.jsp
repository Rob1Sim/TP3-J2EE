<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <title>Résultat de la connexion</title>
</head>
<body>
<h2>Résultat</h2>
<p><%= request.getAttribute("message") %></p>
</body>
</html>
