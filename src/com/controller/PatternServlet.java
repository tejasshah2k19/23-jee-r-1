package  com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PatternServlet")
public class PatternServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String n1 = request.getParameter("n1");

		int printInd = 0; // 0 -> nothing 1 -> num = 5 {blank} 2 -> PrintSymbol 3->Print Numeric 4-> input
							// String [ test ]
							// InputString

		int no = 5;
		if (n1 == null || n1.trim().length() == 0) {
			// n1 is blank
			no = 5;
			printInd = 1;
		} else if ("@#$%^&*()_+".contains(n1) && n1.length() == 1) { // @  @#$%^.contains("$$$") 
			// n1 == "@"
			printInd = 2;
			no = 5;
		} else {

			try {
				no = Integer.parseInt(n1);// $$$
				printInd = 3;
			} catch (NumberFormatException e) {
				printInd = 4;
			}

		}

		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		out.print("<html><body>");

		if (printInd != 4) {
			for (int i = 1; i <= no; i++) {
				for (int j = 1; j <= i; j++) {
					if (printInd == 2)
						out.println(n1);
					else
						out.println(j);
				}
				out.print("<br>");
			}
		} else {
			out.print("Invalid Input");
		}

		out.print("</body></html>");
	}
}
