package com.controller.bhaigym;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.bhaigym.DAOServiceImpl;
import com.model.bhaigym.DAOServices;
@WebServlet("/Update")
public class Update extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Update() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// only take email as attribute to show on update jsp.
		HttpSession session = request.getSession(false);
		if(session.getAttribute("email")!=null) {
		String email = request.getParameter("email");
		request.setAttribute("email", email);

		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/Update.jsp");
		rd.forward(request, response);
		}else {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/adminLogin.html");
			rd.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		DAOServices dao = new DAOServiceImpl();
		dao.connectionDB();
		dao.updateRegistration(email, mobile);
		ResultSet rs = dao.allRegistration();
		request.setAttribute("result", rs);
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/Allregistration.jsp");
		rd.forward(request, response);
	}

}
