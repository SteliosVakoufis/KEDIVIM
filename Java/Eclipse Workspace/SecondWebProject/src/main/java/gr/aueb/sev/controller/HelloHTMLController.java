package gr.aueb.sev.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HelloHTMLController")
public class HelloHTMLController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter pw = response.getWriter();
		pw.write(
				"<!DOCCTYPE html>"
				+ "<html>"
				+ ""
				+ "<head>"
				+ "</head>"
				+ ""
				+ "<body>"
				+ "<h2>Hello worlds!!!!</h2>"
				+ "</body>"
				+ ""
				+ "</html>"
				);
	}

}
