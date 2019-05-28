package dk.Hamzah.Servlet;

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
		// TODO Auto-generated method stub
		request.getRequestDispatcher("Input.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Student updatedStudent = new Student();
		
		updatedStudent.setName(request.getParameter("name"));
		updatedStudent.setEmail(request.getParameter("email"));
		updatedStudent.setAge(request.getParameter("age"));
		updatedStudent.setId(Integer.parseInt(request.getParameter("id")));
		
		HttpSession ses = request.getSession(true); 

		@SuppressWarnings("unchecked")
		ArrayList<Student> list = (ArrayList<Student>) ses.getAttribute("studentlist"); 

			
		int id = Integer.parseInt (request.getParameter("Id"));
		
		int counter = 0;
		int indexToUpdate = 0;
		for (Student studentlist : list) { 
			int studentId = studentlist.getId();
			if (id == studentId) {
				indexToUpdate = counter; 
			}
			counter = counter + 1; 
		}			
		list.remove(indexToUpdate);
		list.add(indexToUpdate, updatedStudent ); 
		ses.setAttribute("studentlist", list); 

		response.sendRedirect("outprint.jsp");
}
	}

