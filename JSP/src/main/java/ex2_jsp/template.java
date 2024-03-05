package ex2_jsp;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/ex2_jsp/_2.include_ex_3/loginProcess")
public class template extends HttpServlet{
	private static final long serialVersionUID = -5415471442653253176L;

	public template() {
		super();
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException {
		String value = request.getParameter("id");
		
		HttpSession session = request.getSession();
		session.setAttribute("id", value);  //request에 객체 저장
		
		response.sendRedirect("template.jsp");
	}
}
