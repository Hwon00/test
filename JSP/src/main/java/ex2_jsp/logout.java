package ex2_jsp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/ex2_jsp/_2.include_ex_3/logout")
public class logout extends HttpServlet{
	private static final long serialVersionUID = -5415471442653253176L;

	public logout() {
		super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.invalidate(); //세션의 모든 속성 삭제
//		session.removeAttribute("id", value);  //특정 속성에 대해 제거
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter(); 
		out.println("<script>alert('로그아웃이 되었습니다.'); "
				+ "location.href='template.jsp;'</script>");
		out.close();
		
	}
}
