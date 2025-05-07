package ch02;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ch02_servlet/sum.do") // 외부에 공개된 url 주소
public class SumController extends HttpServlet { // 실제 실행 클래스

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int number = Integer.parseInt(request.getParameter("number"));
		int sum = 0;
		for (int i = 1; i <= number; i++) {
			sum += i;
		}
		request.setAttribute("sum", sum);
		RequestDispatcher rd = request.getRequestDispatcher("/ch02/sum_result.jsp");
		rd.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
