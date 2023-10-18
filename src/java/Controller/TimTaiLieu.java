/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.TaiLieu417;


@WebServlet("/SearchBook")
public class TimTaiLieu extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private TaiLieu417 tailieu = new TaiLieu417();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TimTaiLieu() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		if (request.getSession().getAttribute("User") == null) {
			String errorString = "Bạn cần đăng nhập trước";
			request.setAttribute("errorString", errorString);
			RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/login.jsp");
			dispatcher.forward(request, response);
		} else {
			request.setCharacterEncoding("UTF-8");
			String data_search = request.getParameter("data_search");
			String errorString = null;
			ArrayList<TaiLieu417> list = null;

			try {
				list = tailieu.timTaiLieu(data_search);
			} catch (Exception e) {
				e.printStackTrace();
				errorString = e.getMessage();
			}
			if (request.getAttribute("errorString") != null) {
				errorString = (String) request.getAttribute("errorString");
			}
			errorString="Kết quả tìm kiếm cho từ khóa '"+data_search+ "'";
			// Lưu thông tin vào request attribute trước khi forward sang views.
			request.setAttribute("errorString", errorString);
			request.setAttribute("bookList", list);

			// Forward sang /WEB-INF/views/productListView.jsp
			RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/TimTaiLieuFrm.jsp");
			dispatcher.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}