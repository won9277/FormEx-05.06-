package FormServelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class param
 */
@WebServlet("/param")
public class param extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public param() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String age = request.getParameter("age");
		String gender = request.getParameter("gender");
		String hobby = request.getParameter("hobby");
		String job = request.getParameter("job");
		
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.println("<br>고객님의 아이디는 : ");
		out.println(id);
		out.println("<br> 비밀번호는 : ");
		out.println(pwd);
		out.println("<br> 나이는 : ");
		out.println(age);
		out.println("<br> 성별은 : ");
		out.println(gender);
		out.println("<br> 관심사는 : ");
		out.println(hobby);
		out.println("<br> 직업은 : ");
		out.println(job);
	
		out.print("<br>");
		out.print("<a href =/Webex02/FromTest.jsp>");
		out.println("회원등록화면으로 돌아가기</a>");

	}

}
