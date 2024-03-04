package _2.mem;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ex1/_2.mem/memReg")
public class memReg_get extends HttpServlet{
	private static final long serialVersionUID = -4444808615778048924L;

	protected void doGet(HttpServletRequest request,
            HttpServletResponse response) 
		throws ServletException, IOException {
		
		//응답하는 데이터 타입이 html
		//charset=utf-8로 지정하면서 응답되는 데이터들의 한글 처리를 한 부분입니다.
		response.setContentType("text/html;charset=utf-8");
		
		//getParameter()메서드 :
		//html의 태그 속성 중에서 "name=id,name=passwd"인 곳에서 입력한 후 전송되어 온
		//파라미터 값을 반환해 주는 메서드입니다.
		//클라이언트에서 전송되어 오는 id라는 이름의 파라미터 값과
		//passwd라는 이름의 파라미터 값을 받는 부분입니다.
		//id=admin&passwd=1
		String name = request.getParameter("name"); 
		String addr = request.getParameter("addr"); 
		String tel = request.getParameter("tel"); 
		String hobby = request.getParameter("hobby"); 
		
		//문자열 단위로 response객체에 내용을 출력할 수 있는 출력 스트림을 생성한 부분입니다.
		PrintWriter out = response.getWriter();
		
		//getContentPath() : 웹 애플리케이션 경로 정보를 반환합니다.
		//URL에서 포트번화와 슬래시 다음이 웹 애플리케이션 이름을 의미하며 이 값을 추출합니다.
		
		//응답에 id변수 값과 passwd변수 값을 출력하는 부분입니다.
		out.println("<HTML><HEAD><link href='../../css/table.css' type='text/css' rel='stylesheet'>");
		out.println("</HEAD>");
		out.println("<BODY><table><thead><tr><th>회원명</th><td>"+name+"</td></tr></thead>");
		out.println("<tbody><tr><th>주소</th><td>"+addr+"</td></tr>");
		out.println("<tr><th>전화번호</th><td>"+tel+"</td></tr>");
		out.println("<tr><th>취미</th><td>"+hobby+"</td></tr>");
		out.println("</tbody></table></body>");
		out.close();
	}
}


