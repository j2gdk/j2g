package dk.Hamzah.Servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dk.Hamzah.Servlet.Student;

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
		request.getSession().setAttribute ("email", request.getParameter("email"));
		request.getSession().setAttribute ("name", request.getParameter("name"));
		request.getSession().setAttribute ("age", request.getParameter("age"));
		
		
		Student s = new Student();
		s.setEmail(request.getParameter("email")); 
		s.setName(request.getParameter("name"));
		s.setAge(request.getParameter("age"));
		

		
		HttpSession ses = request.getSession(); 

		ArrayList<Student> oldList = (ArrayList<Student>) ses.getAttribute("studentlist"); 
		ArrayList<Student> list = null; 


		if (oldList == null) { 
		// første gang 
		list = new ArrayList<Student>(); 

		} else { 
		// ikke første gang 
		list = oldList; 
		} 
		
		int maxId = 0; 
		for (Student studentlist : list) { 
			int studentId = studentlist.getId();
			if (maxId<studentId) {
				maxId = studentId; 
			}
			
		}
		s.setId(maxId+1);
		

		list.add(s); 
		

		ses.setAttribute("studentlist", list); 


		response.sendRedirect("outprint");
	}
}
