package kr.ac.hansung;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// request에 사용자가 입력한 값이 들어옴 id, pw --> 사용자의 입력을 처리해줌.
		// 클라이언트한테 리퀘스트가 올 때마다 thread가 생성되어 이를 처리해줌 (dopost로 처리)
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		// ... db access
		
		// Build HTML code
		PrintWriter out = response.getWriter(); // printwirter의 객체 out에 response를 받아옴
		
		String htmlResponse = "<html>";
		htmlResponse += "<h2> your username is " + username + "<br/>";
		htmlResponse += " your password is " + password + "</h2>";
		htmlResponse += "</html>";
		out.println(htmlResponse); // client에 username, password를 전송한다.
		
	}

}
