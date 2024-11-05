<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <title>Affichage de la Matrice</title>
</head>
<body>

<%-- Affichage de la matrice entière si elle est présente --%>
<% int[][] matrice = (int[][]) request.getAttribute("matrice"); %>
<% if (matrice != null) { %>
<h2>Matrice complète</h2>
<table border="1">
  <% for (int i = 0; i < matrice.length; i++) { %>
  <tr>
    <% for (int j = 0; j < matrice[i].length; j++) { %>
    <td><%= matrice[i][j] %></td>
    <% } %>
  </tr>
  <% } %>
</table>
<% } %>

<%-- Affichage d'une valeur spécifique ou message d'erreur si attribuée --%>
<% String celluleValeur = (String) request.getAttribute("celluleValeur"); %>
<% if (celluleValeur != null) { %>
<p><%= celluleValeur %></p>
<% } %>

<%-- Affichage du message de mise à jour ou réinitialisation dans doPost --%>
<% String message = (String) request.getAttribute("message"); %>
<% if (message != null) { %>
<p><%= message %></p>
<% } %>

</body>
</html>
