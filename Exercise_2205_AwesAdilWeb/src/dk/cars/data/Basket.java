package dk.cars.data;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Basket
 */
@WebServlet("/basket")
public class Basket extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Basket() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("page3.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println(request.getParameter("count"));
		System.out.println(request.getParameter("id"));
		
		HttpSession s=request.getSession();
		// s.setAttribute("carList",carsList);
		ArrayList<cars> carsList = null;
		
		if(s.getAttribute("carList")!=null){ 
			carsList = (ArrayList<cars>) s.getAttribute("carList"); 
			//new ArrayList<cars>();
		} else {
			carsList = new ArrayList();
		}
			
		
		
		Integer id = Integer.parseInt(request.getParameter("carid")); 
		
		if (id==1) {
			cars audi = new cars();
			audi.setName("Audi");
			audi.setPrice(200);
			carsList.add(audi);
//			request.setAttribute("car", audi);
			request.setAttribute("id", 1);
			request.setAttribute("name", audi.getName());
			request.setAttribute("price", audi.getPrice());
//			new cars().setName("Audi"));
			
		} else if (id==2) {
			cars bentley = new cars();
			bentley.setName("Bentley");
			bentley.setPrice(400);
//			request.setAttribute("car", audi);
			carsList.add(bentley);
			request.setAttribute("id", 2);
			request.setAttribute("name", bentley.getName());
			request.setAttribute("price", bentley.getPrice());
			request.setAttribute("car", new cars().getName()); 
			
		}	
		
		
		response.sendRedirect("page3.jsp");
		s.setAttribute("carList",carsList);
	}

}
