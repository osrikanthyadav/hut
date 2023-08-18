package pk;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Calas extends HttpServlet
{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		res.setContentType("text/html");
		String k=req.getParameter("n1");
		
		PrintWriter out=res.getWriter();
		out.println("da");
		out.println("result is "+k);
	//	req.setAttribute("k", k);
		Cookie c=new Cookie("k",k);
		res.addCookie(c);
		out.print("<a href='s2'>S2</a>");
		out.print("<a href='servlet.pdf'>JAVA-BOOK</a>");
//		RequestDispatcher rd=req.getRequestDispatcher("zzzz");
//		rd.include(req, res);
	}
}
