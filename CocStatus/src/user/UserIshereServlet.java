package user;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserIshereServlet
 */
@WebServlet("/UserIshereServlet")
public class UserIshereServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		String userName = request.getParameter("userName");
		response.getWriter().write(register(userName) + "");
	}
	
	public int  register(String userName) {
		User user = new User();
		try {
			user.setUserName(userName);
		} catch(Exception e) {
			return 0;
		}
		return new UserDAO().ishere(user);
	}
}
