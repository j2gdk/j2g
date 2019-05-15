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
		// TODO Auto-generated method stub
		request.getRequestDispatcher("final.jsp").forward(request,response);
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
		
		int id = System.identityHashCode(u);
		u.setId(id);
		
		request.setAttribute("inputUsers", u);
		
		HttpSession ses = request.getSession(true);
		
		@SuppressWarnings("unchecked")
		ArrayList<Users> oldlist = (ArrayList<Users>)ses.getAttribute("userlist");
		ArrayList<Users> list = null;
		
		if (oldlist == null){
			list = new ArrayList<Users>();
		} else {
			list = oldlist;
		}

		list.remove(u);
		ses.setAttribute("userlist", list);
		
		response.sendRedirect("Final");
			
		} 

		
	}


