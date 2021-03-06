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
 * Servlet implementation class Input
 */
@WebServlet("/Input")
public class Input extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Input() {
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
		Student s = new Student();
		request.getSession().setAttribute ("email", request.getParameter("email"));
		request.getSession().setAttribute ("name", request.getParameter("name"));
		request.getSession().setAttribute ("age", request.getParameter("age"));
		
		
		s.setEmail(request.getParameter("email")); 
		s.setName(request.getParameter("name"));
		s.setAge(request.getParameter("age"));
		
		HttpSession ses = request.getSession(); 

		@SuppressWarnings("unchecked")
		ArrayList<Student> oldList = (ArrayList<Student>) ses.getAttribute("studentlist"); 
		ArrayList<Student> list = null; 


		if (oldList == null) { 
		// f�rste gang 
		list = new ArrayList<Student>(); 

		} else { 
		// ikke f�rste gang 
		list = oldList; 
		} 
		int maxId = 0;
		for (Student listUsers : list){
			int userId = listUsers.getId();
			if (maxId<userId) {
				maxId = userId;
			}
		}

		s.setId(maxId+1);
		
		list.add(s); 


		ses.setAttribute("studentlist", list); 


		response.sendRedirect("outprint");
	}

}
