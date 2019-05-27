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
		Users updatedUser = new Users();
		updatedUser.setName(request.getParameter("name"));
		updatedUser.setEmail(request.getParameter("email"));
		updatedUser.setAge(request.getParameter("age"));
		updatedUser.setId(Integer.parseInt(request.getParameter("id")));
		
		HttpSession ses = request.getSession(true);
		
		@SuppressWarnings("unchecked")
		ArrayList<Users> list = (ArrayList<Users>)ses.getAttribute("userlist");
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		int counter = 0;
		int indexToUpdate = 0;
		for (Users listUser: list) { 
			int userId = listUser.getId();
			if (id == userId) {
				indexToUpdate = counter;
			}
			counter = counter + 1;
		}
		list.remove(indexToUpdate);
		list.add(indexToUpdate, updatedUser);
				
		ses.setAttribute("userlist", list);
		response.sendRedirect("output.jsp");
	
}


}

