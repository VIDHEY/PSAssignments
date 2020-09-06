package com.sapient.publicis.week2;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/subtractNDays")
public class subtractNDays extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String date = request.getParameter("date");
		String numOfDays = request.getParameter("numOfDays");
		
		LocalDate dt = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

		dt = dt.minusDays(Integer.parseInt(numOfDays));
		
		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().write(dt.toString());
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
