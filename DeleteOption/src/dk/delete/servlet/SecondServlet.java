package dk.delete.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dk.delete.data.Customer;

/**
 * Servlet implementation class SecondServlet
 */
@WebServlet(name = "secondservlet", urlPatterns = { "/secondservlet" })
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecondServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*Customer g = new Customer();
		g.setFirstname("");
		g.setLastname("");
		g.setGender("");
		request.setAttribute("inputCustomer", g);*/
		request.getRequestDispatcher("Second.jsp").forward(request, response);
		 
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		Customer g = new Customer();
		g.setFirstname("");
		g.setLastname("");
		g.setGender("");
		request.setAttribute("inputCustomer", g);
	request.getRequestDispatcher("Second.jsp").forward(request, response);
	
}
}