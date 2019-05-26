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
		request.getRequestDispatcher("InputServlet.jsp").forward(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		Customer updatedCustomer = new Customer();

		

		updatedCustomer.setName(request.getParameter("name"));
		updatedCustomer.setEmail(request.getParameter("email"));
		updatedCustomer.setAge(request.getParameter("age"));
		updatedCustomer.setId(Integer.parseInt(request.getParameter("id")));

		

		HttpSession ses = request.getSession(true);
		ArrayList<Customer> list = (ArrayList<Customer>)ses.getAttribute("customerlist");
				
		int id= Integer.parseInt(request.getParameter("id"));
		int counter=0;
		int indexToUpdate = 0;
		for (Customer listCustomer: list){
		int customerId = listCustomer.getId();
			if(id==customerId){
				indexToUpdate=counter;
			}
			counter = counter+1;
		}
		list.remove(indexToUpdate);
		list.add(indexToUpdate, updatedCustomer);
		ses.setAttribute("customerlist", list);
		response.sendRedirect("second.jsp");


		}
}
