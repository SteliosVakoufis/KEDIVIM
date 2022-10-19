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
 * Servlet implementation class UpdateTeacherController
 */
@WebServlet("/Update")
public class UpdateTeacherController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    ITeacherDAO teacherDAO = new TeacherDAOImpl();
    ITeacherService teacherServ = new TeacherServiceImpl(teacherDAO);

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id").trim());
        String firstname = request.getParameter("firstname").trim();
        String lastname = request.getParameter("lastname").trim();

        TeacherDTO teacherDTO = new TeacherDTO();
        teacherDTO.setId(id);
        teacherDTO.setFirstname(firstname);
        teacherDTO.setLastname(lastname);

        request.setAttribute("insertedTeacher", teacherDTO);
        request.getRequestDispatcher("/jsps/Teacherupdate.jsp")
                .forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html, charset=UTF8");

        int id = Integer.parseInt(request.getParameter("id").trim());
        String firstname = request.getParameter("firstname").trim();
        String lastname = request.getParameter("lastname").trim();

        TeacherDTO oldTeacherDTO = new TeacherDTO();
        oldTeacherDTO.setId(id);

        TeacherDTO newTeacherDTO = new TeacherDTO();
        newTeacherDTO.setFirstname(firstname);
        newTeacherDTO.setLastname(lastname);

        try {
            teacherServ.updateTeacher(oldTeacherDTO, newTeacherDTO);
            request.setAttribute("insertedTeacher", newTeacherDTO);
            request.getRequestDispatcher("/jsps/Teacherupdated.jsp")
                    .forward(request, response);

        } catch (Exception e) {
            request.setAttribute("sqlError", true);
            request.getRequestDispatcher("/jsps/Teachersmenu.jsp")
                    .forward(request, response);
        }
    }
}
