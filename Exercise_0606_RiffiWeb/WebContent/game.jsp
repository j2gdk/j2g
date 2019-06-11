<%@page import="java.util.ArrayList"%>
<%@page import="dk.game.Game"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<link type="text/css" rel="stylesheet" href="css/css.css">
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>TicTacToe</title>
</head>
<body>

<div class="text-center"id="box">
  <header>
    <h1>Play Tic Tac Toe</h1>
  </header>

<%if (request.getAttribute("gameover") != null) { %>
	<span style="color:blue"><%=request.getAttribute("gameover") %></span>
<%} else {
		ArrayList<Integer> board = (ArrayList<Integer>) request.getSession().getAttribute("board");
	%>
		
		<ul id="gameBoard">
   
        <li class="tic"id="0">
		           
		<%
			if (board.get(0) == Game.BLANK) {
		%>
		       		<form action="game" method="post">
						<input type="hidden" name="section" value="0" />
						<input type="submit" name="submit" value="Add X" />
				 	</form>
		<%
			} else if (board.get(0) == Game.X) {
		%>
		X
		<%
			} else if (board.get(0) == Game.O) {
		%>
		O
		<%
			}
		%>
		</li>
				
		  <li class="tic"id="1">    
		      
		<%
			if (board.get(1) == Game.BLANK) {
		%>
		       		<form action="game" method="post">
						<input type="hidden" name="section" value="1" />
						<input type="submit" name="submit" value="Add X" />
				 	</form>
		<%
			} else if (board.get(1) == Game.X) {
		%>
		X
		<%
			} else if (board.get(1) == Game.O) {
		%>
		O
		<%
			}
		%>
			</li> 	
		    <li class="tic"id="2">
		       
		<%
			if (board.get(2) == Game.BLANK) {
		%>
		       		<form action="game" method="post">
						<input type="hidden" name="section" value="2" />
						<input type="submit" name="submit" value="Add X" />
				 	</form>
		<%
			} else if (board.get(2) == Game.X) {
		%>
		X
		<%
			} else if (board.get(2) == Game.O) {
		%>
		O
		<%
			}
		%>
			</li>   	
		      
		     <li class="tic"id="3">   
		       
		<%
			if (board.get(3) == Game.BLANK) {
		%>
		       		<form action="game" method="post">
						<input type="hidden" name="section" value="3" />
						<input type="submit" name="submit" value="Add X" />
				 	</form>
		<%
			} else if (board.get(3) == Game.X) {
		%>
		X
		<%
			} else if (board.get(3) == Game.O) {
		%>
		O
		<%
			}
		%>
			</li>	
			 <li class="tic"id="4">
		       
		<%
			if (board.get(4) == Game.BLANK) {
		%>
		       		<form action="game" method="post">
						<input type="hidden" name="section" value="4" />
						<input type="submit" name="submit" value="Add X" />
				 	</form>
		<%
			} else if (board.get(4) == Game.X) {
		%>
		X
		<%
			} else if (board.get(4) == Game.O) {
		%>
		O
		<%
			}
		%>
			</li>	
			
		     <li class="tic"id="5"> 
		       
		<%
			if (board.get(5) == Game.BLANK) {
		%>
		       		<form action="game" method="post">
						<input type="hidden" name="section" value="5" />
						<input type="submit" name="submit" value="Add X" />
				 	</form>
		<%
			} else if (board.get(5) == Game.X) {
		%>
		X
		<%
			} else if (board.get(5) == Game.O) {
		%>
		O
		<%
			}
		%>
			</li>   	
			  <li class="tic"id="6">
		       
		<%
			if (board.get(6) == Game.BLANK) {
		%>
		       		<form action="game" method="post">
						<input type="hidden" name="section" value="6" />
						<input type="submit" name="submit" value="Add X" />
				 	</form>
		<%
			} else if (board.get(6) == Game.X) {
		%>
		X
		<%
			} else if (board.get(6) == Game.O) {
		%>
		O
		<%
			}	
		%>
			</li>	
			   <li class="tic"id="7">
		      
		      
		<%
			if (board.get(7) == Game.BLANK) {
		%>
		       		<form action="game" method="post">
						<input type="hidden" name="section" value="7" />
						<input type="submit" name="submit" value="Add X" />
				 	</form>
		<%
			} else if (board.get(7) == Game.X) {
		%>
		X
		<%
			} else if (board.get(7) == Game.O) {
		%>
		O
		<%
			}
		%>
			</li>	
		        <li class="tic"id="8">
		       
		<%
			if (board.get(8) == Game.BLANK) {
		%>
		       		<form action="game" method="post">
						<input type="hidden" name="section" value="8" />
						<input type="submit" name="submit" value="Add X" />
				 	</form>
		<%
			} else if (board.get(8) == Game.X) {
		%>
		X
		<%
			} else if (board.get(8) == Game.O) {
		%>
		O
		<%
			}
		%>
			</li>	
<%
}
%>
 
  </ul>
  
</body>
</html>