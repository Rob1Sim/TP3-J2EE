<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>Gestion de la Matrice</title>
</head>
<body>
<h2>Gestion de la Matrice</h2>

<h3>Afficher toute la matrice</h3>
<form action="MatriceServlet" method="get">
  <input type="submit" value="Afficher la matrice complète">
</form>

<h3>Afficher une cellule spécifique</h3>
<form action="MatriceServlet" method="get">
  <label for="x">x :</label>
  <input type="number" id="x" name="x" required>
  <label for="y">y :</label>
  <input type="number" id="y" name="y" required>
  <input type="submit" value="Afficher la cellule">
</form>

<h3>Réinitialiser la matrice</h3>
<form action="MatriceServlet" method="post">
  <input type="submit" value="Réinitialiser la matrice">
</form>

<h3>Mettre à jour une cellule</h3>
<form action="MatriceServlet" method="post">
  <label for="x">x :</label>
  <input type="number" id="x" name="x" required>
  <label for="y">y :</label>
  <input type="number" id="y" name="y" required>
  <label for="val">val :</label>
  <input type="number" id="val" name="val" required>
  <input type="submit" value="Mettre à jour la cellule">
</form>
</body>
</html>