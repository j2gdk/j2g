package dk.game;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class game
 */
@WebServlet("/game")
public class Game extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public static final Integer X = 0;
	public static final Integer O = 1;
	public static final Integer BLANK = 2;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Game() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// New game = empty board
		ArrayList<Integer> board = new ArrayList<Integer>();
		board.add(0, BLANK);
		board.add(1, BLANK);
		board.add(2, BLANK);
		board.add(3, BLANK);
		board.add(4, BLANK);
		board.add(5, BLANK);
		board.add(6, BLANK);
		board.add(7, BLANK);
		board.add(8, BLANK);

		request.getSession().setAttribute("board", board);
		request.getRequestDispatcher("game.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Integer> board = (ArrayList<Integer>) request.getSession().getAttribute("board");

		// 1. add X to the arraylist
		String section = request.getParameter("section");
		board.remove(Integer.parseInt(section));
		board.add(Integer.parseInt(section), X);

		// 3. Loop through all sections to find out if the board is empty, if X
		// has won or O has won
		if (isBoardFull(board)) {
			request.setAttribute("gameover", "Game Over! No more spaces left.");
		} else {
			// 2. add Y (computer) to the arraylist
			int firstEmptyPosititon = 0;
			for (Integer s : board) {
				if (s == BLANK) {
					break;
				}
				firstEmptyPosititon = firstEmptyPosititon + 1;
			}
			board.remove(firstEmptyPosititon);
			board.add(firstEmptyPosititon, O);
		}

		// see if X has won
		if (hasXWon(board)) {
			request.setAttribute("gameover", "Hey, You won!");

		}

		// see if Y has won
		else if (hasOWon(board)) {
			request.setAttribute("gameover","OOOPS! You lost. Better luck next time.");
		}

		request.getRequestDispatcher("game.jsp").forward(request, response);
	}

	// check for full board
	private boolean isBoardFull(ArrayList<Integer> board) {
		for (Integer section : board) {
			if (section == BLANK) {
				return false;
			}
		}
		return true;
	}

	// see if X has won
	private boolean hasXWon(ArrayList<Integer> board) {
		if (board.get(0) == X && board.get(1) == X && board.get(2) == X) {
			return true;
		}

		else if (board.get(3) == X && board.get(4) == X && board.get(5) == X) {
			return true;
		}

		else if (board.get(6) == X && board.get(7) == X && board.get(8) == X) {
			return true;
		}

		else if (board.get(6) == X && board.get(7) == X && board.get(8) == X) {
			return true;
		}

		else if (board.get(0) == X && board.get(3) == X && board.get(6) == X) {
			return true;
		}

		else if (board.get(1) == X && board.get(4) == X && board.get(7) == X) {
			return true;
		}

		else if (board.get(2) == X && board.get(5) == X && board.get(8) == X) {
			return true;
		}

		else if (board.get(0) == X && board.get(4) == X && board.get(8) == X) {
			return true;
		}

		else if (board.get(2) == X && board.get(4) == X && board.get(6) == X) {
			return true;
		}

		return false;

	}

	// see if O has won
	private boolean hasOWon(ArrayList<Integer> board) {

		if (board.get(0) == O && board.get(1) == O && board.get(2) == O) {
			return true;
		}

		else if (board.get(3) == O && board.get(4) == O && board.get(5) == O) {
			return true;
		}

		else if (board.get(6) == O && board.get(7) == O && board.get(8) == O) {
			return true;
		}

		else if (board.get(6) == O && board.get(7) == O && board.get(8) == O) {
			return true;
		}

		else if (board.get(0) == O && board.get(3) == O && board.get(6) == O) {
			return true;
		}

		else if (board.get(1) == O && board.get(4) == O && board.get(7) == O) {
			return true;
		}

		else if (board.get(2) == O && board.get(5) == O && board.get(8) == O) {
			return true;
		}

		else if (board.get(0) == O && board.get(4) == O && board.get(8) == O) {
			return true;
		}

		else if (board.get(2) == O && board.get(4) == O && board.get(6) == O) {
			return true;
		}

		return false;

	}
}
