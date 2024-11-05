package org.example.tp3;

import java.io.*;

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
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String xParam = req.getParameter("x");
        String yParam = req.getParameter("y");

        if (xParam == null || yParam == null) {
            // Si aucun paramètre n'est fourni, afficher toute la matrice
            out.println("<table border='1'>");
            for (int i = 0; i < SIZE; i++) {
                out.println("<tr>");
                for (int j = 0; j < SIZE; j++) {
                    out.println("<td>" + matrice[i][j] + "</td>");
                }
                out.println("</tr>");
            }
            out.println("</table>");
        }else {
            // Si les paramètres x et y sont fournis, afficher la valeur de la cellule
            try {
                int x = Integer.parseInt(xParam);
                int y = Integer.parseInt(yParam);
                if (x >= 0 && x < SIZE && y >= 0 && y < SIZE) {
                    out.println("Valeur à (" + x + ", " + y + ") : " + matrice[x][y]);
                } else {
                    out.println("Erreur : Coordonnées hors limites.");
                }
            } catch (NumberFormatException e) {
                out.println("Erreur : Paramètres x et y non valides.");
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String xParam = request.getParameter("x");
        String yParam = request.getParameter("y");
        String valParam = request.getParameter("val");

        if (xParam == null && yParam == null && valParam == null) {
            // Réinitialiser toute la matrice à 0
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    matrice[i][j] = 0;
                }
            }
            response.getWriter().println("La matrice a été réinitialisée.");
        } else {
            // Mise à jour de la cellule spécifiée
            try {
                assert xParam != null;
                int x = Integer.parseInt(xParam);
                int y = Integer.parseInt(yParam);
                int val = Integer.parseInt(valParam);
                if (x >= 0 && x < SIZE && y >= 0 && y < SIZE) {
                    matrice[x][y] = val;
                    response.getWriter().println("La valeur à (" + x + ", " + y + ") a été mise à jour à : " + val);
                } else {
                    response.getWriter().println("Erreur : Coordonnées hors limites.");
                }
            } catch (NumberFormatException e) {
                response.getWriter().println("Erreur : Paramètres x, y ou val non valides.");
            }
        }
    }
}



