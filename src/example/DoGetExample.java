package example;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class DoGetExample extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		String username = req.getParameter("uname");
		String userpass = req.getParameter("upass");
		out.println("Name: "+username);
		out.println("Pass: "+userpass);
		out.close();
	}
}
