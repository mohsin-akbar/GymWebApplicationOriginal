package com.controller.bhaigym;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.bhaigym.DAOServiceImpl;
import com.model.bhaigym.DAOServices;
@WebServlet("/UserLoginController")
public class UserLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UserLoginController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/userLogin.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = (String) request.getParameter("id");
		String email = request.getParameter("email");

		DAOServices dao = new DAOServiceImpl();
		dao.connectionDB();
		boolean status = dao.userLogin(id, email);
		if (status == true) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/offer.jsp");
			rd.forward(request, response);
		} else {
			request.setAttribute("msg", "X Invalid Email/Id");
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/userLogin.jsp");
			rd.forward(request, response);
		}
	}

}
