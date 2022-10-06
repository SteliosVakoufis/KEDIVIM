package gr.aueb.sev.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HelloDispatcherController")
public class HelloDispatcherController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm");
		String strDate = formatter.format(date);

		String name = request.getParameter("name");
		String surname = request.getParameter("surname");
		
		request.setAttribute("strDate", strDate);
		request.setAttribute("name", name);
		request.setAttribute("surname", surname);
		
		request.getRequestDispatcher("/jsps/jstldate.jsp").forward(request, response);
		
	}
}
