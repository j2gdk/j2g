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
		request.getRequestDispatcher("input.jsp").forward(request, response);
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
		Student s = new Student();
		request.getSession().setAttribute ("email", request.getParameter("email"));
		request.getSession().setAttribute ("name", request.getParameter("name"));
		request.getSession().setAttribute ("age", request.getParameter("age"));
		
		
		s.setEmail(request.getParameter("email")); 
		s.setName(request.getParameter("name"));
		s.setAge(request.getParameter("age"));
		
		HttpSession ses1 = request.getSession(); 

		@SuppressWarnings("unchecked")
		ArrayList<Student> oldList = (ArrayList<Student>) ses.getAttribute("studentlist"); 
		ArrayList<Student> list1 = null; 


		if (oldList == null) { 
		// første gang 
		list1 = new ArrayList<Student>(); 

		} else { 
		// ikke første gang 
		list1 = oldList; 
		} 
		int maxId = 0;
		for (Student listUsers : list1){
			int userId = listUsers.getId();
			if (maxId<userId) {
				maxId = userId;
			}
		}

		s.setId(maxId+1);
		
		list1.add(s); 


		ses.setAttribute("studentlist", list1); 


		response.sendRedirect("outprint");
		list1.add(s);
		
	}

}
