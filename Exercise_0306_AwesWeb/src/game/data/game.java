package game.data;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class game
 */
@WebServlet("/game")
public class game extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Integer EMPTY = null;
	private static final String X = null;
	private static final Integer String = null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public game() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		HttpSession s=request.getSession();
		
		ArrayList<Integer> game = new ArrayList<Integer>();
		game.add(0, EMPTY);
		game.add(1, EMPTY);
		game.add(2, EMPTY);
		game.add(3, EMPTY);
		game.add(4, EMPTY);
		game.add(5, EMPTY);
		game.add(6, EMPTY);
		game.add(7, EMPTY);
		game.add(8, EMPTY);
		
		
		s.setAttribute("gameList",game);
		String nextJSP = "/tg.jsp";
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP); 
		
		dispatcher.forward(request,response);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession s=request.getSession();
		ArrayList<String> game = null;
		
		request.getSession().getAttribute("gameList"); 
		
		String box = request.getParameter("box");
		game.remove(Integer.parseInt(box));
		game.add(Integer.parseInt(box), X);
		
		if (isgameFull(game)); { 
			request.setAttribute("game over", "try again");
			
		} else { 
		
// https://www.tutorialspoint.com/java/java_break_statement.htm
			
			game.firstElement();
			for ( String s : game) {
		         if (s == EMPTY) {
		            break;
			
		         }
			}           
		            
		
		if (XWon(game)) { 
			request.setAttribute("You won the game", box); 
			
		} else {
			
		(OWon(game)) { 
			request.setAttribute("You lost the game", box);
		}
}
		
		request.getRequestDispatcher("tg.jsp").forward(request, response);
		
		}
}

		private boolean isgameFull(ArrayList<String> board) {
			for (String box : game) {
				if (String box == EMPTY) {
					return false;
				
					
					
					
					
					
					
					
					
					
					
					
					
				}
		
			}	
		
	}	

}
