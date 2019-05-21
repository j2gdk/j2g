package dk.form.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dk.form.data.Users;
import dk.form.data.newUpdatedPerson;


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
		request.getRequestDispatcher("form.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Users u = new Users();
		u.setName(request.getParameter("name"));
		u.setEmail(request.getParameter("email"));
		u.setAge(request.getParameter("age"));
	
		newUpdatedPerson updated = new newUpdatedPerson();
		
		request.setAttribute("inputUsers", u);
		request.setAttribute("indexToUpdate", updated);
		
		 HttpSession ses = request.getSession(true);

			@SuppressWarnings("unchecked")

			ArrayList<Users> list = (ArrayList<Users>)ses.getAttribute("userlist");

			int id = Integer.parseInt(request.getParameter("Id"));

			int counter = 0;

			int indexToDelete = 0;

			for (Users listUser: list) { 

				int userId = listUser.getId();

				if (id == userId) {

					indexToDelete = counter;

				}

				counter = counter + 1;

			}


			list.remove(indexToDelete);
			list.add(indexToUpdate, newUpdatedPerson);

			ses.setAttribute("userlist", list);

			response.sendRedirect("output.jsp");

		
		if (request.getParameter("Update") != null) {

			response.sendRedirect("Output");

		} else {
			response.sendRedirect("Form");

		}

	}
	}

