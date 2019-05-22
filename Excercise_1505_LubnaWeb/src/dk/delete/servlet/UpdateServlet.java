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

@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    public UpdateServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		HttpSession ses = request.getSession(true);
		@SuppressWarnings("unchecked")
		ArrayList<Customer> list = (ArrayList<Customer>)ses.getAttribute("customerlist");
				
		int id= Integer.parseInt(request.getParameter("id"));
		int counter=0;
		int indexToUpdate = 0;
		for (Customer listUser: list){
		int userId = listUser.getId();
			if(id==userId){
				indexToUpdate=counter;
			}
			counter = counter+1;
		}
		list.remove(indexToUpdate);
		request.setAttribute("inputCustomer", "g");
	
		
		
		response.sendRedirect("InputServlet"); 
	  
	  }

	
	
}


