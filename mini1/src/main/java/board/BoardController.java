package board;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/board_servlet/*")
public class BoardController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String url = request.getRequestURI();
		String context = request.getContextPath();
		BoardDAO dao = new BoardDAO();
		
		if (url.indexOf("list.do") != -1) {
			
			Map<String, Object> map = new HashMap<String, Object>();
			List<BoardDTO> list = dao.list();
			map.put("list", list);
			map.put("count", list.size());
			request.setAttribute("map", map);
			String page = "/board/list.jsp";
			RequestDispatcher rd = request.getRequestDispatcher(page);
			rd.forward(request, response);
			
		} else if (url.indexOf("join.do") != -1) {
			
			int no = Integer.parseInt(request.getParameter("no"));
			String title = request.getParameter("title");
			String content = request.getParameter("content");
			BoardDTO dto = new BoardDTO(no, title, content);
			dao.insert(dto);
			response.sendRedirect(context + "/member_servlet/list.do");
			
		} else if (url.indexOf("view.do") != -1) {
			
			String no = request.getParameter("no");
			BoardDTO dto = dao.detail(no);
			request.setAttribute("dto", dto);
			String page = "/board/view.jsp";
			RequestDispatcher rd = request.getRequestDispatcher(page);
			rd.forward(request, response);
			
		} else if (url.indexOf("update.do") != -1) {
			
			int no = Integer.parseInt(request.getParameter("no"));
			String title = request.getParameter("title");
			String content = request.getParameter("content");
			BoardDTO dto = new BoardDTO(no, title, content);
			dao.update(dto);
			response.sendRedirect(context + "/member_servlet/list.do");
			
		} else if (url.indexOf("delete.do") != -1) {
			
			String no = request.getParameter("no");
			dao.delete(no);
			response.sendRedirect(context + "/board_servlet/list.do");
			
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
		
	}
	
}
