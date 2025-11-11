package member;

import java.io.IOException;

import org.json.simple.JSONObject;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("*.do")
public class MemberController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		MemberDAO dao = new MemberDAO();
		String userid = request.getParameter("userid");
		String passwd = request.getParameter("passwd");
		MemberDTO dto = new MemberDTO();
		dto.setUserid(userid);
		dto.setPasswd(passwd);
		MemberDTO output = dao.loginCheck(dto);
		JSONObject jsonObj = new JSONObject();
		if (output != null) {
			jsonObj.put("name", output.getName());
		} else {
			jsonObj.put("name", "null");
		}
		response.getWriter().println(jsonObj);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}