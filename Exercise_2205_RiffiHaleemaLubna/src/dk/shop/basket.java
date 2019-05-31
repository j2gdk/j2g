package dk.shop;

import java.io.IOException;
import java.math.BigDecimal;
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
        
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		
		HttpSession ses = request.getSession(true);
		ArrayList<BasketItem> list = (ArrayList<BasketItem>)ses.getAttribute("basketlist");

		if (action.equals("add")) {
			BasketItem item= new BasketItem();
			item.setId(Integer.parseInt(request.getParameter("Id")));
			item.setQuantity(Integer.parseInt(request.getParameter("count")));

			Validator validator = new Validator();
			boolean isQuantityValid = validator.isQuantityValid(item.getQuantity());
			if (!isQuantityValid) {
				response.sendRedirect("product?id="+item.getId()+"&quantityerror=true");
				return;
			}
			
			if (item.getId()==1){
				item.setName(new ProductData().product1Name);	
				item.setDescription(new ProductData().product1Description);
				item.setTotalPrice(new ProductData().product1Price.multiply(new BigDecimal(item.getQuantity())));
				item.setUnitPrice(new ProductData().product1Price);
				
			} else if (item.getId()==2){
				item.setName(new ProductData().product2Name);	
				item.setDescription(new ProductData().product2Description);
				item.setTotalPrice(new ProductData().product2Price.multiply(new BigDecimal(item.getQuantity())));
				item.setUnitPrice(new ProductData().product2Price);
				
			} else if (item.getId()==3){
				item.setName(new ProductData().product3Name);	
				item.setDescription(new ProductData().product3Description);
				item.setTotalPrice(new ProductData().product3Price.multiply(new BigDecimal(item.getQuantity())));
				item.setUnitPrice(new ProductData().product3Price);
			}
			
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
				foundItem.setTotalPrice(foundItem.getUnitPrice().multiply(new BigDecimal(foundItem.getQuantity())));
			}

			ses.setAttribute("basketlist", list);
			request.setAttribute("basketlist", list);
		} else if (action.equals("delete")) {
			BasketItem item= new BasketItem();
			item.setId(Integer.parseInt(request.getParameter("Id")));

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
		} else if (action.equals("update")) {
			int id = Integer.parseInt(request.getParameter("Id"));
			int count = Integer.parseInt(request.getParameter("count"));
			
			BasketItem foundItem = null; 
			
			for (BasketItem existingitem : list){
				if (existingitem.getId()== id){
					foundItem = existingitem;
				}
			}
			
			foundItem.setQuantity(count);
			foundItem.setTotalPrice(foundItem.getUnitPrice().multiply(new BigDecimal(foundItem.getQuantity())));
					
			ses.setAttribute("basketlist", list);
			request.setAttribute("basketlist", list);
		}
	
		// validate that items (regardless of add, update, delete) has not exceeded 10 items
		Validator validator = new Validator();
		for (BasketItem item : list){
			if (!validator.isQuantityValid(item.getQuantity())) {
				item.setInStock(false);
			}
		}
		
		request.getRequestDispatcher("basket.jsp").forward(request,response);
	}
}
