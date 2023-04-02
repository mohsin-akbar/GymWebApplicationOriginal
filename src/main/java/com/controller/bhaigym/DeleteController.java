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
@WebServlet("/DeleteController")
public class DeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DeleteController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		if(session.getAttribute("email")!=null) {
		
		String email = request.getParameter("email");
		DAOServiceImpl dao = new DAOServiceImpl();
		dao.connectionDB();
		dao.deleteRegistration(email);
		ResultSet rs = dao.allRegistration();
		request.setAttribute("result", rs);
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/Allregistration.jsp");
		rd.forward(request, response);
		}else{
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/adminLogin.html");
			rd.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
