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
 * Servlet implementation class ThirdServlet
 */
@WebServlet("/ThirdServlet")
public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ThirdServlet() {
        super();
        
    }
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Customer g = new Customer();
		g.setFirstname("");
		g.setLastname("");
		g.setGender("");
		
		int id = System.identityHashCode(g);
		g.setId(id);
		
		request.setAttribute("inputCustomer", g);
		request.getRequestDispatcher("third.jsp").forward(request, response);
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String action = request.getParameter("delete");
		
		if(action.equalsIgnoreCase("id"))
	{
	ses.removeAttribute("customerlist");
		response.sendRedirect("secondservlet");
}
}
}