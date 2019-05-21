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
 * Servlet implementation class CreatePerson
 */
@WebServlet("/form")
public class Form extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Form() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Person emailPerson = new Person();
		//request.setAttribute("EmailPersons", emailPerson);
		request.getRequestDispatcher("Form.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Person emailPerson = new Person();
		Validator valid = new Validator();
				
		emailPerson.setEmail(request.getParameter("name"));
		emailPerson.setName(request.getParameter("email"));
		emailPerson.setAge(request.getParameter("age"));
		
		//request.setAttribute("EmailPersons", emailPerson);
		
		boolean nameValid = valid.isNameValid(emailPerson.getName());
		boolean emailValid = valid.isEmailValid(emailPerson.getEmail());
		boolean ageValid = valid.isAgeValid(emailPerson.getAge());
		
		if(nameValid && emailValid && ageValid){
		HttpSession session = request.getSession(true);
		
		ArrayList<Person> oldList = (ArrayList<Person>) session.getAttribute("NewEmailpersons");
		ArrayList<Person> list = null;
		
		if (oldList == null) {

			list = new ArrayList<Person>();
		} else {

		list = oldList;
		}
		
		int maxId = 0;
		for(Person listPerson: list){
			int  personId = listPerson.getId();
			if(maxId<personId){
				maxId = personId;
			}
			
		}
		emailPerson.setId(maxId+1);
		
		list.add(emailPerson);
		session.setAttribute("NewEmailpersons", list);	
		
		response.sendRedirect("info");
		
		} else{response.sendRedirect("form");}
		
	}

}
