package dk.cars.data;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class update
 */
@WebServlet("/update")
public class update extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public update() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nextJSP = "/page3.jsp";
		
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP); 

		dispatcher.forward(request,response); 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		cars s = new cars(); 
		
		updatedcars.setName(request.getParameter("name")); 
		
		HttpSession ses = request.getSession(true);
		
		ArrayList<cars> carsList = (ArrayList<cars>)ses.getAttribute("carList"); 
		
		int id = Integer.parseInt(request.getParameter("carid"));
		
		int counter = 0; 
		int indexToUpdate = 0; 
		for (cars carList: carsList); 
		
		int carId = carList.getName(); 
		if (id == carId) {
			indexToUpdate = counter; 
			
		}
			counter = counter +1; 
			
	}
		list.remove(indexToUpdate);
		list.add(indexToUpdate, updatedcars); 
		
		ses.setAttribute("carList", carList);
		response.sendRedirect("page3.jsp");
	
	}
	

