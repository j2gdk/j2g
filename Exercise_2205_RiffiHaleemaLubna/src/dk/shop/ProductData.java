package dk.shop;

public class ProductData {
	public final String product1Name = "Lipstick";
	public final String product1Description = "A creamy rich Lipstick formula with high colour payo..";
	public final String product1Image = "images/product1.jpg";
	public final Integer product1Price = new Integer(100);
	
	public final String product2Name = "Foundation";
	public final String product2Description = "BAREPRO® Performance Wear Powder Foundation";
	public final String product2Image = "images/product2.jpg";
	public final Integer product2Price = new Integer(300);
	
	public final String product3Name = "Contour Kit";
	public final String product3Description = "Loot-y Call from BH Cosmetics and Coastal Scents!";
	public final String product3Image = "images/product3.jpg";
	public final Integer product3Price = new Integer(300);

	private Integer id = null;
	private String product_name = null;
	private String product_description = null;
	private String product_price = null;
	private String quantity = null;
	
	public Integer getId() {return id;}
	public void setId(Integer id) {this.id = id;}
	public String getProduct_name() {return product_name;}
	public void setProduct_name(String product_name) {this.product_name = product_name;}
	public String getProduct_description() {return product_description;}
	public void setProduct_description(String product_description) { this.product_description = product_description;}
	public String getProduct_price() {return product_price;}
	public void setProduct_price(String product_price) {this.product_price = product_price;}
	public String getQuantity() {return quantity;}
	public void setQuantity(String quantity) {this.quantity = quantity;}
	
	
	
	


}
