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
@WebServlet("/OfferController")
public class OfferController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public OfferController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		if(session.getAttribute("email")!=null) {
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/adminOffer.jsp");
		rd.forward(request, response);
		}else {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/adminLogin.html");
			rd.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		if(session.getAttribute("email")!=null) {
		String total = request.getParameter("total");
		String offer = request.getParameter("offer");
		String email = request.getParameter("email");
		DAOServices dao = new DAOServiceImpl();
		dao.connectionDB();
		dao.insertOffer(total, offer, email);
		request.setAttribute("msg", "Offer Inserted/Shared");

		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/adminOffer.jsp");
		rd.forward(request, response);
		
		}else {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/adminLogin.html");
			rd.forward(request, response);
		}
	}

}
