package dk.exercise_1505_AfzalWeb.servlet;

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
@WebServlet("/Delete")
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
		response.sendRedirect("outprint");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		HttpSession ses = request.getSession(); 
		ArrayList<Student> list = (ArrayList<Student>) ses.getAttribute("studentlist"); 
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

		list.remove(indexToDelete);

				

		ses.setAttribute("studentlist", list);

		response.sendRedirect("outprint.jsp");
		
	}

}
