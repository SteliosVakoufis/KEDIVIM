package gr.aueb.sev.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import gr.aueb.sev.dao.ITeacherDAO;
import gr.aueb.sev.dao.TeacherDAOImpl;
import gr.aueb.sev.dto.TeacherDTO;
import gr.aueb.sev.service.ITeacherService;
import gr.aueb.sev.service.TeacherServiceImpl;

/**
 * Servlet implementation class InsertTeacherController
 */
@WebServlet("/InsertTeacherController")
public class InsertTeacherController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    ITeacherDAO teacherDAO = new TeacherDAOImpl();
    ITeacherService teacherServ = new TeacherServiceImpl(teacherDAO);

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html, charset=UTF8");

        String firstname = request.getParameter("firstname").trim();
        String lastname = request.getParameter("lastname").trim();

        TeacherDTO teacherDTO = new TeacherDTO();
        teacherDTO.setFirstname(firstname);
        teacherDTO.setLastname(lastname);

        try {
            teacherServ.insertTeacher(teacherDTO);
            request.setAttribute("insertedTeacher", teacherDTO);
            request
                    .getRequestDispatcher("/jsps/Teacherinserted.jsp")
                    .forward(request, response);

        } catch (Exception e) {
            request.setAttribute("sqlError", true);
            request
                    .getRequestDispatcher("/jsps/Teachersmenu.jsp")
                    .forward(request, response);
        }
    }
}
