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
 * Servlet implementation class CreatePerson
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

		request.getRequestDispatcher("Input1.jsp").forward(request, response);

		Student s = new Student ();
		
		s.setEmail("");  
		s.setName(""); 
		s.setAge(""); 
	
		request.setAttribute("Userlist", s);
	
	
		
		
	}

	


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Student s = new Student();
				
		s.setEmail(request.getParameter("name"));
		s.setName(request.getParameter("email"));
		s.setAge(request.getParameter("age"));
		
	
	
		
		HttpSession ses = request.getSession(true);
		
		ArrayList<Student> oldList = (ArrayList<Student>) ses.getAttribute("Userlist");
		ArrayList<Student> list = null;
		
		if (oldList == null) {

			list = new ArrayList<Student>();
		} else { 
	
			
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
		ses.setAttribute("Userlist", list);	
		
		response.sendRedirect("Output");
		
	}

}
