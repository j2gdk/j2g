package dk.cars.data;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class product_details
 */
@WebServlet("/product")
public class product_details extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public product_details() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @param id 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer id = Integer.parseInt(request.getParameter("id")); 
		
		
		if (id==1) {
			cars audi = new cars();
			audi.setName("Audi");
			audi.setPrice(200);
//			request.setAttribute("car", audi);
			request.setAttribute("id", 1);
			request.setAttribute("name", audi.getName());
			request.setAttribute("price", audi.getPrice());
//			new cars().setName("Audi"));
			
		} else if (id==2) {
			cars audi = new cars();
			audi.setName("Bentley");
			audi.setPrice(400);
//			request.setAttribute("car", audi);
			request.setAttribute("id", 2);
			request.setAttribute("name", audi.getName());
			request.setAttribute("price", audi.getPrice());
			request.setAttribute("car", new cars().getName()); 
			
		}	else if (id==3) {
//			request.setAttribute("car", new cars().car3); 
			
		}
		
		
		String nextJSP = "/page2.jsp";
		
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP); 

		dispatcher.forward(request,response); 

		
		
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.sendRedirect("Basket");
	}

}