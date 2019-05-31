package dk.shop;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dk.shop.BasketItem;
import dk.shop.ProductData;

@WebServlet("/basket")
public class basket extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public basket() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("basket.jsp").forward(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		
		if (action.equals("add")) {
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
			
			BasketItem foundItem = null; 
			
			for (BasketItem existingitem : list){
				if (existingitem.getId()== item.getId()){
					foundItem = existingitem;
				}
			}
			if (foundItem == null){
				list.add(item);				
			} else {
				foundItem.setQuantity(foundItem.getQuantity()+ item.getQuantity());
			}

			ses.setAttribute("basketlist", list);
			request.setAttribute("basketlist", list);
			request.getRequestDispatcher("basket.jsp").forward(request,response);
				 
			
		} else if (action.equals("delete")) {
			BasketItem item= new BasketItem();
			item.setId(Integer.parseInt(request.getParameter("Id")));
					
			HttpSession ses = request.getSession(true);
			@SuppressWarnings("unchecked")
			ArrayList<BasketItem> list = (ArrayList<BasketItem>)ses.getAttribute("basketlist");
			
			int id = Integer.parseInt(request.getParameter("Id"));
			int counter = 0;
			int indexToDelete = 0;
			for (BasketItem listUser: list) { 
				int userId = listUser.getId();
				if (id == userId) {
					indexToDelete = counter;
				}
				counter = counter + 1;
			}
			list.remove(indexToDelete);
			ses.setAttribute("basketlist", list);
			request.setAttribute("basketlist", list);
			request.getRequestDispatcher("basket.jsp").forward(request,response);
			
		} else if (action.equals("update")) {
			HttpSession ses = request.getSession(true);
			
			@SuppressWarnings("unchecked")
			ArrayList<BasketItem> list = (ArrayList<BasketItem>)ses.getAttribute("basketlist");
			
			int id = Integer.parseInt(request.getParameter("Id"));
			int count = Integer.parseInt(request.getParameter("count"));
			
			BasketItem foundItem = null; 
			
			for (BasketItem existingitem : list){
				if (existingitem.getId()== id){
					foundItem = existingitem;
				}
			}
			
			foundItem.setQuantity(count);
			ses.setAttribute("basketlist", list);
			request.setAttribute("basketlist", list);
			request.getRequestDispatcher("basket.jsp").forward(request,response);
		
		}
	}
}
