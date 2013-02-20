
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class POne extends HttpServlet {
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
        throws IOException, ServletException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
		String firstName= request.getParameter("fname");
		String lastName=request.getParameter("lname");
		
		out.println("<html>" + "<head>");    
        out.println("</head>");
        out.println("<body bgcolor=\"white\">");
		String someText = "HERE ARE THE DETAIL U ENTERED ";
       
        // <FORM action="\PG2" method="GET">
		//   <input type="SUBMIT" Value="CLICK"/>
		out.println("<FORM action=\"PG2\">");
		out.println("<h1><U><B>" + someText + "</B></U></h1>");
		out.println("Email :");
		out.println("<input type=\"text\" name=\"email\" /><BR>");
		out.println("Address :");
		out.println("<input type=\"text\" name=\"address\" />");
		
		out.println("<input type=hidden name=\"fname\" VALUE=\"" + firstName + "\">");
		out.println("<input type=hidden name=\"lname\" VALUE=\"" + lastName + "\">");


		out.println("<input type=\"SUBMIT\" VALUE=\"CLICK 2 CONTINUE\"/> ");
		out.println("</FORM>");
	    out.println("</body>");
        out.println("</html>");
    }
}



