
package org.example.tp3;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet(name = "Servlet_Login", value = "/Servlet_Login")
public class Servlet_Login extends HttpServlet {
    // Identifiants en dur
    private static final String CORRECT_LOGIN = "admin";
    private static final String CORRECT_PASSWORD = "admin";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = request.getParameter("login");
        String password = request.getParameter("password");

        if (CORRECT_LOGIN.equals(login) && CORRECT_PASSWORD.equals(password)) {
            // Identifiants corrects
            request.setAttribute("message", "Welcome to your First JSP page.");
        } else {
            // Identifiants incorrects
            request.setAttribute("message", "Identification Failure.");
        }

        // Redirection vers la page resultat.jsp
        request.getRequestDispatcher("/WEB-INF/resultat.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response); // Redirige vers doPost pour simplifier
    }
}
