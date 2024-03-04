package _9;

import java.io.IOException;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/*
	실행방법
	1. 크롬에서 실행
	http://localhost:8088/JSP/ex1/_9.context/input.jsp
	2. 크롬을 제회한 다른 브라우저에서 실행
	http://localhost:8088/JSP/ex1/_9.context/scope.jsp
*/

@WebServlet("/ex1/_9.context/context")
public class ContextServlet2 extends HttpServlet{
	private static final long serialVersionUID = -5415471442653253176L;

	public ContextServlet2() {
		super();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException {
		String value = request.getParameter("food");
		request.setAttribute("food", value);  //request에 객체 저장
		
		HttpSession session = request.getSession();
		session.setAttribute("food", value);  //session에 객체 저장
		
		/*
		  웹 어플리케이션이 서비스되거 있는 동안 유지하는 것을 의미합니다.
		  생명주기가 웹 어플리케이션과 같은 객체는 ServletContext입니다.
		  ServletContext는 웹 애플리케이션 서비스가 시작될 때 생성되고 종료될 때 소멸합니다.
		*/
		
		ServletContext sc = request.getSession().getServletContext();
		sc.setAttribute("food", value);
		
		response.sendRedirect("scope.jsp");
	}
}


