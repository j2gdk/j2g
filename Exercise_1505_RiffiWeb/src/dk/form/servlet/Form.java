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
 * Servlet implementation class Form
 */
@WebServlet("/Form")
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
		Users u = new Users();
		u.setName("");
		u.setEmail("");;
		u.setAge("");;
		
		request.setAttribute("inputUsers", u);
		request.getRequestDispatcher("form.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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

		list.add(u);
		ses.setAttribute("userlist", list);
		
		response.sendRedirect("Output");
			
		} 

	}
