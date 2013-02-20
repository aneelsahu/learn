
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class PTwo extends HttpServlet {
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
        throws IOException, ServletException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
		String firstName=request.getParameter("fname");
	    String lastName=request.getParameter("lname");
		String emailId=request.getParameter("email");
	    String add=request.getParameter("address");

        out.println("<html>" + "<head>");    
        out.println("</head>");
        out.println("<body bgcolor=\"white\">");
		String someText = "THIS IS THE SUMMARY OF UR ACCOUNT " ;
        out.println("<h1><U><B>" + someText + "</B></U></h1>");
		out.println("<h4> First Name:" + firstName+ "</h1>");	
		out.println("<h4> Last Name :" + lastName+ "</h1>");	
		out.println("<h4> Email Id  :" + emailId+ "</h1>");	
		out.println("<h4> Addresss  :" + add+ "</h1>");	
	    out.println("</body>");
        out.println("</html>");
    }
}



