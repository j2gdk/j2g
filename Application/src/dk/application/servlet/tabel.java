package dk.application.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class tabel
 */
@WebServlet("/tabel")
public class tabel extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public tabel() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("Tabel.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getSession().setAttribute ("uniqueID", request.getParameter("uniqueID"));
		request.getSession().setAttribute ("firstname", request.getParameter("firstname"));
		request.getSession().setAttribute ("lastname", request.getParameter("lastname"));
		request.getSession().setAttribute ("gender", request.getParameter("gender"));
		
		
		Student s = new Student();
		s.setUniqueID(request.getParameter("uniqueID"));
		s.setFirstName(request.getParameter("firstname")); 
		s.setLastName(request.getParameter("lastname"));
		s.setGender(request.getParameter("gender"));
		
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


		list.add(s); 


		ses.setAttribute("studentlist", list); 


		response.sendRedirect("tableregistred");
	}

	}
