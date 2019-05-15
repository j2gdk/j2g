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
		HttpSession ses = request.getSession();
		
		ArrayList<String> model = null; 

		if (ses.getAttribute("user")== null){
			model = new ArrayList<String>();
		} else {
			model = (ArrayList<String>)ses.getAttribute("user");
		}

		model.remove(request.getParameter("tv"));
		ses.setAttribute("user", model);

		for(String tv: model){
			response.getWriter().write(tv+"/n");
		}
	}

	}

		
		
		List<String> list = new ArrayList<>();

		for (Iterator<String> iterator = list.iterator(); iterator.hasNext();) {
		    String string = iterator.next();
		    if (string.isEmpty()) {
		        // Remove the current element from the iterator and the list.
		        iterator.remove();

		response.sendRedirect("Output");
			
		} 

	}


	}
	}