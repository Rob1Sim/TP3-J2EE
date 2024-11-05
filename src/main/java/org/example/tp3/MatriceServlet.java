package org.example.tp3;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/MatriceServlet")
public class MatriceServlet extends HttpServlet {
    private static final int SIZE = 10;
    private int[][] matrice;

    @Override
    public void init() throws ServletException {
        super.init();
        matrice = new int[SIZE][SIZE];
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String xParam = req.getParameter("x");
        String yParam = req.getParameter("y");

        if (xParam == null || yParam == null) {
            // Passer la matrice complète au JSP
            req.setAttribute("matrice", matrice);
            req.getRequestDispatcher("/affichageMatrice.jsp").forward(req, resp);
        } else {
            // Passer la valeur de la cellule spécifiée au JSP
            try {
                int x = Integer.parseInt(xParam);
                int y = Integer.parseInt(yParam);
                if (x >= 0 && x < SIZE && y >= 0 && y < SIZE) {
                    req.setAttribute("celluleValeur", "Valeur à (" + x + ", " + y + ") : " + matrice[x][y]);
                } else {
                    req.setAttribute("celluleValeur", "Erreur : Coordonnées hors limites.");
                }
            } catch (NumberFormatException e) {
                req.setAttribute("celluleValeur", "Erreur : Paramètres x et y non valides.");
            }
            req.getRequestDispatcher("/affichageMatrice.jsp").forward(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String xParam = request.getParameter("x");
        String yParam = request.getParameter("y");
        String valParam = request.getParameter("val");

        String message;
        if (xParam == null && yParam == null && valParam == null) {
            // Réinitialiser toute la matrice à 0
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    matrice[i][j] = 0;
                }
            }
            message = "La matrice a été réinitialisée.";
        } else {
            // Mise à jour de la cellule spécifiée
            try {
                assert xParam != null;
                int x = Integer.parseInt(xParam);
                int y = Integer.parseInt(yParam);
                int val = Integer.parseInt(valParam);
                if (x >= 0 && x < SIZE && y >= 0 && y < SIZE) {
                    matrice[x][y] = val;
                    message = "La valeur à (" + x + ", " + y + ") a été mise à jour à : " + val;
                } else {
                    message = "Erreur : Coordonnées hors limites.";
                }
            } catch (NumberFormatException e) {
                message = "Erreur : Paramètres x, y ou val non valides.";
            }
        }
        request.setAttribute("message", message);
        request.getRequestDispatcher("/affichageMatrice.jsp").forward(request, response);
    }
}
