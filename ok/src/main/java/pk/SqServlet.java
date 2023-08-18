package pk;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/s2")
public class SqServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
//		int i=Integer.parseInt(req.getParameter("n1"));
//		int j=Integer.parseInt(req.getParameter("n2"));
//		int k=i+j;
		
	//	int k=(int)req.getAttribute("k");
		Cookie[] c=req.getCookies();
		int k=Integer.parseInt(c[0].getValue());
		PrintWriter out=res.getWriter();
		out.println("Addition of two numbers= "+(k+k));
		k=k*k;
		out.println("Square for it = "+k);
	}

}
