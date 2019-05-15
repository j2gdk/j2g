package dk.form.servlet;

import java.io.IOException;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dk.form.data.Users;

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

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
				
		ses.setAttribute("userlist", list);
		response.sendRedirect("output.jsp");
	
	}
}