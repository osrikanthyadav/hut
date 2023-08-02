package pk;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Calas extends HttpServlet
{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		int i=Integer.parseInt(req.getParameter("n1"));
		int j=Integer.parseInt(req.getParameter("n2"));
		int k=i+j;
		PrintWriter out=res.getWriter();
		out.println("da");
		out.println("result is "+k);
		req.setAttribute("k", k);
		
		RequestDispatcher rd=req.getRequestDispatcher("uk");
		rd.forward(req, res);
	}
}
