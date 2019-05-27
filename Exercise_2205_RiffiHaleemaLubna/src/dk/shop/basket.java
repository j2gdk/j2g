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
		ProductData u = new ProductData();
		u.setProduct_name(request.getParameter("name"));
		u.setProduct_description(request.getParameter("description"));
		u.setProduct_price(request.getParameter("price"));
	
		
		request.setAttribute("inputProduct", u);
		
		HttpSession ses = request.getSession(true);
		
		@SuppressWarnings("unchecked")
		ArrayList<ProductData> oldlist = (ArrayList<ProductData>)ses.getAttribute("productlist");
		ArrayList<ProductData> list = null;
		
		if (oldlist == null){
			list = new ArrayList<ProductData>();
		} else {
			list = oldlist;
		}
		
		//It will loop the arraylist and will keep increasing the ID. 
		int maxId = 0;
		for (ProductData listProduct: list){
			int userId = listProduct.getId();
			
			if(maxId<userId){
				maxId = userId;
			}
		}
			u.setId(maxId+1);

		list.add(u);
		ses.setAttribute("productlist", list);
		
		request.getRequestDispatcher("basket.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int counter = 0;
		int indexToDelete = 0;		
		
		ProductData u = new ProductData();
		u.setProduct_name(request.getParameter("name"));
		u.setProduct_description(request.getParameter("description"));
		u.setProduct_price(request.getParameter("price"));
	
		
		request.setAttribute("inputProduct", u);
		
		HttpSession ses = request.getSession(true);
		
		@SuppressWarnings("unchecked")
		ArrayList<ProductData> oldlist = (ArrayList<ProductData>)ses.getAttribute("productlist");
		ArrayList<ProductData> list = null;
		
		if (oldlist == null){
			list = new ArrayList<ProductData>();
		} else {
			list = oldlist;
		}
		
		//It will loop the arraylist and will keep increasing the ID. 
		int maxId = 0;
		for (ProductData listProduct: list){
			int userId = listProduct.getId();
			
			if(maxId<userId){
				maxId = userId;
			}
		}
			u.setId(maxId+1);

		list.add(u);
		ses.setAttribute("productlist", list);
		
		response.sendRedirect("basket");
			
		} 

	}
