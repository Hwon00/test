package _6;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ex1/_6.redirect/RedirectServlet")
public class RedirectServlet extends HttpServlet{
	private static final long serialVersionUID = -5415471442653253176L;

	public RedirectServlet() {
		super();
	}
	
	/* 페이지 이동 방법
	  Redirect 방식
	  - 이동될 떄 브라우저의 주소 표시줄의 URL이 변경되므로 요청이 바뀌게 됩니다.
	  - 이동한 jsp 페이지에서는 서블릿에서 request영역의 속성 값에 접근할 수 없습니다.
	*/
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException {
		
		System.out.println("요청방식 : " + request.getMethod());
		System.out.println("파라미터 food의 값 : " + request.getParameter("food"));
		response.sendRedirect("redirect.jsp");
	}
}


