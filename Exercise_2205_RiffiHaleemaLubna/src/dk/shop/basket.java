package dk.shop;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/basket")
public class basket extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public basket() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("basket.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action.equals("add")) {
			
		} else if (action.equals("update")) {
			
		} if (action.equals("delete")) {
			
		}
		BasketItem item= new BasketItem();
		item.setId(Integer.parseInt(request.getParameter("Id")));
		item.setQuantity(Integer.parseInt(request.getParameter("count")));
		
		if (item.getId()==1){
			item.setName(new ProductData().product1Name);	
			item.setDescription(new ProductData().product1Description);
			item.setPrice(new ProductData().product1Price);
			
		} else if (item.getId()==2){
			item.setName(new ProductData().product2Name);	
			item.setDescription(new ProductData().product2Description);
			item.setPrice(new ProductData().product2Price);
			
		} else if (item.getId()==3){
			item.setName(new ProductData().product3Name);	
			item.setDescription(new ProductData().product3Description);
			item.setPrice(new ProductData().product3Price);
		}
		
		
		HttpSession ses = request.getSession(true);
		
		ArrayList<BasketItem> list = (ArrayList<BasketItem>)ses.getAttribute("basketlist");
		
		if (list == null){
			list = new ArrayList<BasketItem>();
		} 
		
		list.add(item);
		ses.setAttribute("basketlist", list);
		
		request.setAttribute("basketlist", list);
		
		request.getRequestDispatcher("basket.jsp").forward(request,response);
			
		} 

	}
