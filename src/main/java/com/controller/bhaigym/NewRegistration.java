package com.controller.bhaigym;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.bhaigym.DAOServiceImpl;
import com.model.bhaigym.DAOServices;

@WebServlet("/NewRegistration")
public class NewRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public NewRegistration() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/saveRegistration.jsp");
			rd.forward(request, response);
		} catch (Exception e) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/saveRegistration.jsp");
			rd.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		String city = request.getParameter("city");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		DAOServices dao = new DAOServiceImpl();
		dao.connectionDB();
		dao.newRegistration(name, city, email, mobile);
		dao.confirmRegistraion(email);
		ResultSet id = dao.confirmRegistraion(email);
		request.setAttribute("Id", id);
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/showid.jsp");
		rd.forward(request, response);
	}

}
