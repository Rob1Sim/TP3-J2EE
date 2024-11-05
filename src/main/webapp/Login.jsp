<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="fr">
<head>
  <meta charset="UTF-8">
  <title>Page de connexion</title>
</head>
<body>
<h2>Connexion</h2>
<form action="Servlet_Login" method="post">
  <label for="login">Nom d'utilisateur :</label>
  <input type="text" id="login" name="login" required><br><br>

  <label for="password">Mot de passe :</label>
  <input type="password" id="password" name="password" required><br><br>

  <input type="submit" value="Envoyer">
</form>
</body>
</html>
