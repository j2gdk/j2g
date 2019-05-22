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
 * Servlet implementation class InputServlet
 */
@WebServlet("/InputServlet")
public class InputServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public InputServlet() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Customer g = new Customer();
		g.setName("");
		g.setEmail("");;
		g.setAge("");;
		
		request.setAttribute("inputCustomer", g);
		request.getRequestDispatcher("first.jsp").forward(request, response);
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Customer g = new Customer();
		Customer valid = new Customer();
		g.setName(request.getParameter("name"));
		g.setEmail(request.getParameter("email"));
		g.setAge(request.getParameter("age"));
		request.setAttribute("inputCustomer", g);
		 
		 
		    
		  
		  boolean isNameValid = valid.isNameValid(g.getName());
		  boolean isEmailValid = valid.isEmailValid(g.getEmail());
		  boolean isAgeValid = valid.isAgeValid(g.getAge());
		  if ( isNameValid && isEmailValid && isAgeValid) 
		  
		  {
		  
		  HttpSession ses = request.getSession(true);
			
			@SuppressWarnings("unchecked")
			ArrayList<Customer> oldlist = (ArrayList<Customer>)ses.getAttribute("customerlist");
			ArrayList<Customer> list = null;
			
			if (oldlist == null){
				list = new ArrayList<Customer>();
			} else {
				list = oldlist;
			}
			int maxId=0;
			for (Customer listUser: list){
				int userId = listUser.getId();
				if(maxId<userId){
					maxId=userId;
				}
			}
			g.setId(maxId+1);
			list.add(g);
			ses.setAttribute("customerlist", list);
			
			response.sendRedirect("DisplayServlet"); 
		  
		  } else {
			  request.setAttribute("error_name", valid.getNameError());
			  request.setAttribute("error_email", valid.getEmailError());
			  request.setAttribute("error_age", valid.getAgeError());
			  
			  getServletContext().getRequestDispatcher("/first.jsp").forward(request, response);
		  }
		  
		  
	} 

}
