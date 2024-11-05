
package org.example.tp3;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/Servlet_Login")
public class Servlet_Login extends HttpServlet {
    // Identifiants en dur
    private static final String login1 = "admin";
    private static final String pwd1 = "admin";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = request.getParameter("login");
        String password = request.getParameter("password");

        if (login1.equals(login) && pwd1.equals(password)) {
            // Identifiants corrects
            request.setAttribute("message", "Welcome to your First JSP page.");
        } else {
            // Identifiants incorrects
            request.setAttribute("message", "Identification Failure.");
        }

        // Redirection vers la page resultat.jsp
        request.getRequestDispatcher("/resultat.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response); // Redirige vers doPost pour simplifier
    }
}
