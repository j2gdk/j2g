package dk.ID.data;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Delete
 */
@WebServlet("/delete")
public class Delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Delete() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession(true);
		ArrayList<Person> list = (ArrayList<Person>)session.getAttribute("NewEmailpersons");
		
		int id = Integer.parseInt(request.getParameter("Id"));
		
		int counter = 0;
		int indexToDelete = 0;
		
			for(Person listPerson: list){
				int  personId = listPerson.getId();
				
				if(id == personId){
					indexToDelete = counter;
				}
				counter = counter+1;
			}
			
			list.remove(indexToDelete);
			session.setAttribute("NewEmailpersons", list);
			response.sendRedirect("Info.jsp");
	}

}
