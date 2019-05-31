package dk.shop;

import java.math.BigDecimal;

public class BasketItem {

		Integer id=null;
		String name=null;
		String description=null;
		Integer quantity=null;
		BigDecimal price=null;
		
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public String getDescription() {
			return description;
		}
		
		public void setDescription(String description) {
			this.description = description;
		}
		
		public Integer getQuantity() {
			return quantity;
		}
		
		public void setQuantity(Integer quantity) {
			this.quantity = quantity;
		}
		
		public BigDecimal getPrice() {
			return price;
		}
		
		public void setPrice(BigDecimal product1Price) {
			this.price = product1Price;
		}
		
		
	}
