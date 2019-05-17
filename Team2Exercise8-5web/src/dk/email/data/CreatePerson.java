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
@WebServlet("/createperson")
public class CreatePerson extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreatePerson() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Person emailPerson = new Person();
		//request.setAttribute("EmailPersons", emailPerson);
		request.getRequestDispatcher("CreateForm.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Person emailPerson = new Person();
				
		emailPerson.setEmail(request.getParameter("name"));
		emailPerson.setName(request.getParameter("email"));
		emailPerson.setAge(request.getParameter("age"));
		
		int id = System.identityHashCode(emailPerson);
		emailPerson.setId(id);
		
		//request.setAttribute("EmailPersons", emailPerson);
		
		HttpSession session = request.getSession(true);
		
		ArrayList<Person> oldList = (ArrayList<Person>) session.getAttribute("NewEmailpersons");
		ArrayList<Person> list = null;
		
		if (oldList == null) {

			list = new ArrayList<Person>();
		} else {

		list = oldList;
		}
		
		list.add(emailPerson);
		session.setAttribute("NewEmailpersons", list);	
		
		response.sendRedirect("infopersons");
		
	}

}
