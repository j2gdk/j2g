package dk.email.data;

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
@WebServlet("/Update")
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
    	request.getRequestDispatcher("Input1.jsp").forward(request,response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Student updateds = new Student ();
				
		HttpSession ses = request.getSession(true);
		
		updateds.setName(request.getParameter("name"));
		updateds.setEmail(request.getParameter("email"));
		updateds.setAge(request.getParameter("age"));
		updateds.setId(Integer.parseInt(request.getParameter("id")));
		
		ArrayList<Student> list = (ArrayList<Student>) ses.getAttribute("Userlist");
		
		
int id = Integer.parseInt(request.getParameter("id"));
		
		int counter = 0;
		int indexToDelete = 0;
		for (Student listUser: list) { 

			int studentId = listUser.getId();

			if (id == studentId) {

				indexToDelete = counter;

			}

			counter = counter + 1;

		}

		list.remove(indexToUpdate);
		list.remove(indexToDelete);

		ses.setAttribute("Userlist", list);

		response.sendRedirect("Output2.jsp");
		
		
	}

}