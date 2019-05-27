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
 * Servlet implementation class Update
 */
@WebServlet("/update")
public class Update extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Update() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("Info.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Person updatedUser = new Person();
		
		updatedUser.setName(request.getParameter("name"));
		updatedUser.setEmail(request.getParameter("email"));
		updatedUser.setAge(request.getParameter("age"));
		updatedUser.setId(Integer.parseInt(request.getParameter("age")));
		
		HttpSession session = request.getSession(true);
		ArrayList<Person> list = (ArrayList<Person>)session.getAttribute("NewEmailpersons");
		
		int id = Integer.parseInt(request.getParameter("Id"));
		int counter = 0;
		int indexToUpdate = 0;
		
		for (Person listPerson : list) { 
			int personId = listPerson.getId();
			
			if (id == personId) {

				indexToUpdate = counter;

			}
			counter = counter + 1;
		}
		list.remove(indexToUpdate);
		list.add(indexToUpdate,updatedUser);
		session.setAttribute("NewEmailpersons", list);

		response.sendRedirect("Info.jsp");	
	}
}

