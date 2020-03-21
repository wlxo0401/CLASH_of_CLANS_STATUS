package user;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserInputServlet
 */
@WebServlet("/UserInputServlet")
public class UserInputServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		String userName = request.getParameter("userName");
		String plunderGold = request.getParameter("plunderGold");
		String plunderElixir = request.getParameter("plunderElixir");
		String plunderDarkElixir = request.getParameter("plunderDarkElixir");
		response.getWriter().write(register(userName, plunderGold, plunderElixir, plunderDarkElixir) + "");
	}
	
	public int  register(String userName, String plunderGold, String plunderElixir, String plunderDarkElixir) {
		User user = new User();
		try {
			user.setUserName(userName);
			user.setPlunderGold(Integer.parseInt(plunderGold));
			user.setPlunderElixir(Integer.parseInt(plunderElixir));
			user.setPlunderDarkElixir(Integer.parseInt(plunderDarkElixir));
		} catch(Exception e) {
			return 0;
		}
		return new UserDAO().input(user);
	}
}
