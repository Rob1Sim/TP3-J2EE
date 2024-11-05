package org.example.tp3;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "equation", value = "/equation")
public class Equation extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        String a = request.getParameter("a");
        String b = request.getParameter("b");
        String c = request.getParameter("c");

        int res = (Integer.parseInt(b)*Integer.parseInt(b)) - 4*Integer.parseInt(a)* Integer.parseInt(c);

        request.setAttribute("result", res);
        request.setAttribute("a", Integer.parseInt(a));
        request.setAttribute("b", Integer.parseInt(b));

        try{
            this.getServletContext().getRequestDispatcher("/result.jsp").forward(request,response);
        }catch(ServletException e){
            e.printStackTrace();
        }
    }
}
