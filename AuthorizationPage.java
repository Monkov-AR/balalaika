import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

public class HelloWorld extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException{
                //getServletContext().getRequestDispatcher("/hello.jsp").forward(request, response);
				String firstName = request.getParameter("firstName");
				String secondName = request.getParameter("secondName");
				
				response.setContentType("text/html;charset=utf-8");
				PrintWriter out = response.getWriter();
				out.print("<h3>NORM VSE</h3>");
				out.close();
				
    }
	public void doPost(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException{
                //getServletContext().getRequestDispatcher("/hello.jsp").forward(request, response);
				String firstName = request.getParameter("firstName");
				String secondName = request.getParameter("secondName");
				
				response.setContentType("text/html;charset=utf-8");
				PrintWriter out = response.getWriter();
				out.print("<h3>NORM VSE</h3>");
				out.close();
    }
}
