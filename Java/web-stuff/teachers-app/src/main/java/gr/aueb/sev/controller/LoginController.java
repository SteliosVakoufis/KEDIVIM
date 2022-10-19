package gr.aueb.sev.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/Login")
public class LoginController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
        super.doGet(req, resp);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");

        String email = request.getParameter("email");
        String password = request.getParameter("password");

        if (email == null || password == null) {
            request.getRequestDispatcher("/jsps/Login.jsp")
                    .forward(request, response);
            
            return;
        }

        // Assume that we call a login service
        if (email.trim().equals("stelios.vakoufis@gmail.com") &&
                password.equals("123")) {
            request.getRequestDispatcher("/jsps/Teachersmenu.jsp")
                    .forward(request, response);
        } else {
            request.setAttribute("error", true);
            request.getRequestDispatcher("/jsps/Login.jsp")
                    .forward(request, response);
        }
    }
}
