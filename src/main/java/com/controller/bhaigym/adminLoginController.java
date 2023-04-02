package com.controller.bhaigym;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.bhaigym.DAOServiceImpl;
import com.model.bhaigym.DAOServices;
@WebServlet("/adminLoginController")
public class adminLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public adminLoginController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/adminLogin.html");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
	
		DAOServices dao = new DAOServiceImpl();
		dao.connectionDB();
		boolean status = dao.adminLogin(email, password);
		if (status == true) {
			HttpSession session = request.getSession(true);
			session.setAttribute("email", email);
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/menu.jsp");
			rd.forward(request, response);
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/adminLogin.html");
			rd.forward(request, response);
		}

	}

}
