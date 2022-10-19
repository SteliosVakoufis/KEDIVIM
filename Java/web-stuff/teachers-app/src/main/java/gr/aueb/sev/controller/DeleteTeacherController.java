package gr.aueb.sev.controller;

import java.io.IOException;
import java.sql.SQLException;

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
import gr.aueb.sev.service.exceptions.TeacherNotFoundException;

/**
 * Servlet implementation class DeleteTeacherController
 */
@WebServlet("/Delete")
public class DeleteTeacherController extends HttpServlet {
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

        var teacherDTO = new TeacherDTO(
            Integer.parseInt(request.getParameter("id").trim()),
            request.getParameter("firstname").trim(),
            request.getParameter("lastname").trim()
        );

        // Validation

        try {
            teacherServ.deleteTeacher(teacherDTO);

            request.setAttribute("teacher", teacherDTO);
            request.getRequestDispatcher("/jsps/Teacherdeleted.jsp")
                    .forward(request, response);

        } catch (TeacherNotFoundException e) {
            request.setAttribute("teacherNotFound", true);
            request
                    .getRequestDispatcher("/jsps/Teachers.jsp")
                    .forward(request, response);
        } catch (SQLException e) {
            request.setAttribute("deleteAPIError", true);
            request
                    .getRequestDispatcher("/jsps/Teachers.jsp")
                    .forward(request, response);
        }
    }
}
