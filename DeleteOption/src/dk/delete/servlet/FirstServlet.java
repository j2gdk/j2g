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


@WebServlet(name = "firstservlet", urlPatterns = { "/firstservlet" })
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public FirstServlet() {
        super();
       
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*Customer g = new Customer();
		g.setFirstname("");
		g.setLastname("");;
		g.setGender("");;
		
		request.setAttribute("inputUsers", g);*/
		request.getRequestDispatcher("First.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Customer g = new Customer();
		g.setFirstname(request.getParameter("firstname"));
		g.setLastname(request.getParameter("lastname"));
		g.setGender(request.getParameter("gender"));
		
		int id = System.identityHashCode(g);
		g.setId(id);
		
		request.setAttribute("inputCustomer", g);
		
		HttpSession ses = request.getSession(true);
		
		@SuppressWarnings("unchecked")
		ArrayList<Customer> oldlist = (ArrayList<Customer>)ses.getAttribute("customerlist");
		ArrayList<Customer> list = null;
		
		if (oldlist == null){
			list = new ArrayList<Customer>();
		} else {
			list = oldlist;
		}

		list.add(g);
		ses.setAttribute("customerlist", list);
		
		response.sendRedirect("secondservlet");
			
		} 


}
