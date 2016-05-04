

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Sbarro_Servlet")
public class Servlet_Sbarro extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.println("<html>");
		writer.println("<head>");
		writer.println("<title>FoodbUST</title>");
		
		writer.println("<style>");
		writer.println("ul {");
		writer.println("list-style-type: none;");
		writer.println("margin: 0;");
		writer.println("padding: 0;");
		writer.println("overflow: hidden;");
		writer.println("background-color: #333;");
		writer.println("}");
		writer.println("li {");
		writer.println("float: left;");
		writer.println("}");

		writer.println(" li a {");
		writer.println(" display: block;");
		writer.println(" color: white;");
		writer.println(" text-align: center;");
		writer.println("    padding: 14px 16px;");
		writer.println("text-decoration: none;");
		writer.println("  }");

		writer.println(" li a:hover {");
		writer.println("     background-color: #111;");
		writer.println("    }");
		writer.println("</style>");
		

		writer.println("</head>");
		writer.println("<body>");
		writer.println("<img src = 'images/HEADER.jpg' width = '100%'>");
		
		writer.println("<ul>");
		writer.println("  <li><a class='active' href='index.html'>Home</a></li>");
		writer.println("  <li><a href='HTMLRestoList.html'>Restaurants</a></li>");
		writer.println("  <li><a href='#contact'>Contact Us</a></li>");
		writer.println("  <li><a href='#about'>About</a></li>");
		writer.println("  </ul>");
		
		writer.println("<img src = 'images/sbarro.jpg'>");
		writer.println("<p>Sbarro, LLC is a chain of pizzeria that specializes in New York style pizza by the slice and other Italian-American cuisine.</p>");
		writer.println("</body>");
		writer.println("</html>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
