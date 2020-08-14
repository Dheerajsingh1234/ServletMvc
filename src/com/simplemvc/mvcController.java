package com.simplemvc;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class mvcController
 */
@WebServlet("/mvcController")
public class mvcController extends HttpServlet {
	
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			//String[] Array1= {"food","vegitable","cofy"};
		
		List<Food> Array1;
		try {
			Array1 = mvcdb.getdata();
			request.setAttribute("Array1", Array1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			//request.setAttribute("Array1",Array1);
			RequestDispatcher dispactcher=request.getRequestDispatcher("index.jsp");
			dispactcher.forward(request, response);
		
	}

	
}
