<%@page import="dk.shop.ProductData"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
   }
   
li {
  float: left;
  }

under{
border-bottom: 3px solid black;
background-color: #f06292;
align: center;
}

in{
   color:MediumSeaGreen;
  }

</style>
<title>Shop</title>
</head>

<body bgcolor="#fce4ec">
	
<h2><under>Shopping Basket</under></h2>
<br style = "line-height:4;">
<div>
<table align="center" width="100%">
		<tr>
			<td><b>Items</b></td>
			<td><b>Item Discription</b></td>
			<td><b>Qty</b></td>
			<td><b>Availability</b></td>
			<td><b>Order Value</b></td>
			
		</tr>
		<tr>
			<td><img width="100px" height="85px"  src="images/product1.jpg"><a href="product?id=1"><%=new ProductData().product1Name %></a></td>
			<td>
				<div> 
					A creamy rich Lipstick formula with high colour payo..
				</div>		
			</td>
			<td><select id="dropdown" name="Qty">
			 			 		<option value="1">1</option>
									<option value="2">2</option>
									<option value="3">3</option>
									<option value="4">4</option>
									<option value="5">5</option>
									<option value="6">6</option>
									<option value="7">7</option>
									<option value="8">8</option>
									<option value="9">9</option>
									</select></td>
			<td>
				<in>	
					In Stock
				</in>	
			</td>
			<td>	
				<%=new ProductData().product1Price %> Kr
			</td>
			<td>	
				<input type="submit" name="Delete" value="Delete">
			</td>	
		</tr>
		<tr>
			<td><img width="100px" height="85px"  src="images/product2.jpg"><a href="product?id=2"><%=new ProductData().product2Name %></a></td>
			<td>
				<div> 
					BAREPRO® Performance Wear Powder Foundation
				</div>		
			</td>
			<td><select id="dropdown" name="Qty">
			 			 		<option value="1">1</option>
									<option value="2">2</option>
									<option value="3">3</option>
									<option value="4">4</option>
									<option value="5">5</option>
									<option value="6">6</option>
									<option value="7">7</option>
									<option value="8">8</option>
									<option value="9">9</option>
									</select></td>
			<td>
				<in>	
					In Stock
				</in>	
			</td>
			<td>	
				<%=new ProductData().product2Price %> Kr
			</td>
			<td>	
				<input type="submit" name="Delete" value="Delete">
			</td>	
		</tr>
		<tr>
			<td>
				<img width="100px" height="85px" src="images/product3.jpg"><a href="product?id=3"><%=new ProductData().product3Name %></a>
			</td>
			<td>
				Loot-y Call from BH Cosmetics and Coastal Scents! 
			</td>
			<td><select id="dropdown" name="Qty">
			 			 		<option value="1">1</option>
									<option value="2">2</option>
									<option value="3">3</option>
									<option value="4">4</option>
									<option value="5">5</option>
									<option value="6">6</option>
									<option value="7">7</option>
									<option value="8">8</option>
									<option value="9">9</option>
									</select>
			</td>
			<td>
				<in>
					In Stock
				</in>	
			</td>
			<td>
				<%=new ProductData().product3Price %> Kr
			</td>
			<td>
				<input type="submit" name="Delete" value="Delete">
			</td>	
		</tr>
				
		
</table><br style = "line-height:6;">
	</div>
		<ul>
		     <form action="payment" method="post">
  			<li><input type="submit" name="continue" value="Continue Shopping"></li>
  			<li style="float:right"><input type="submit" name="checkout" value="Go To Checkout"></li>
  			</form>
		</ul>
</body>
</html>