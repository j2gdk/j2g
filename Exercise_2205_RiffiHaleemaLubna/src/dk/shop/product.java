package dk.shop;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/product")
public class product extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public product() {
        super();
    }
     
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

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		if (request.getParameter("previous") != null) {
			response.sendRedirect("start");

		} else {

			response.sendRedirect("basket");
		}
	}
}
