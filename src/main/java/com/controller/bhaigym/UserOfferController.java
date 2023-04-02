package com.controller.bhaigym;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.bhaigym.DAOServiceImpl;
import com.model.bhaigym.DAOServices;
@WebServlet("/UserOfferController")
public class UserOfferController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UserOfferController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		DAOServices dao = new DAOServiceImpl();
		dao.connectionDB();
		ResultSet rs = dao.offer();

		try {
			while (rs.next()) {
				int total = Integer.parseInt(rs.getString(2));
				int offer = Integer.parseInt(rs.getString(3));
				int payAble = total - (total * offer) / 100;
				System.out.println(payAble);
				request.setAttribute("total", total);
				request.setAttribute("offer", offer);
				request.setAttribute("payAble", payAble);
				RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/offer.jsp");
				rd.forward(request, response);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
