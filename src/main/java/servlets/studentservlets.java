package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbconnection.studentdb;
import models.student;
import services.studentservices;

@WebServlet("/regster")
public class studentservlets extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String rollnumber = req.getParameter("rollnumber");
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String branch = req.getParameter("branch");
		String section = req.getParameter("section");
		
//		models import =>creating object
		student std = new student(rollnumber,name,email,branch,section);
		
//		service services =>creating object
		studentservices services = new studentservices(studentdb.getconn());
		boolean f = services.addstudent(std);
		if (f) {
			resp.sendRedirect("welcome.jsp");
		}
		else {
			resp.sendRedirect("register.jsp");
		}
	}

}
