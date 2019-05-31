package dk.shop;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dk.shop.ProductData;
import dk.shop.Validator;

/**
 * Servlet implementation class product
 */
@WebServlet("/product")
public class product extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public product() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	Integer id = Integer.parseInt(request.getParameter("id"));
	
	if (id==1){
		request.setAttribute("price", new ProductData().product1Price);
		request.setAttribute("name", new ProductData().product1Name);
		request.setAttribute("description", new ProductData().product1Description);
		request.setAttribute("image", new ProductData().product1Image);
 
	} else if (id==2){
		request.setAttribute("price", new ProductData().product2Price);
		request.setAttribute("name", new ProductData().product2Name);
		request.setAttribute("description", new ProductData().product2Description);
		request.setAttribute("image", new ProductData().product2Image);
		
	} else if (id==3){
		request.setAttribute("price", new ProductData().product3Price);
		request.setAttribute("name", new ProductData().product3Name);
		request.setAttribute("description", new ProductData().product3Description);
		request.setAttribute("image", new ProductData().product3Image);
	}
	    
	    
		request.getRequestDispatcher("product.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("start");
	}
	

}
