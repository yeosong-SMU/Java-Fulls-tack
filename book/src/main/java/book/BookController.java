package book;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("*.do")
public class BookController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String url = request.getRequestURI();
		BookDAO dao = new BookDAO();
		if (url.indexOf("xml.do") != -1) {
			String result = dao.xml();
			response.getWriter().println(result);
		} else if (url.indexOf("json.do") != -1) {
			String result = dao.json();
			response.getWriter().println(result);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}