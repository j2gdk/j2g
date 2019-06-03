package dk.shop;

import java.math.BigDecimal;

public class BasketItem {

		Integer id=null;
		String name=null;
		String description=null;
		Integer quantity=null;
		
		//we defined unitPrice and TotalPrice with the error message "inStock" so we dont have to in servlet
		BigDecimal unitPrice=null;
		BigDecimal totalPrice=null;
		boolean inStock=true;
		
		/**
		 * @return the id
		 */
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

		/**
		 * @return the totalPrice
		 */
		public BigDecimal getTotalPrice() {
			return totalPrice;
		}
		/**
		 * @param product1Price the totalPrice to set
		 */
		public void setTotalPrice(BigDecimal product1Price) {
			this.totalPrice = product1Price;
		}
		
		public BigDecimal getUnitPrice() {
			return unitPrice;
		}
		public void setUnitPrice(BigDecimal unitPrice) {
			this.unitPrice = unitPrice;
		}
		public boolean isInStock() {
			return inStock;
		}
		public void setInStock(boolean inStock) {
			this.inStock = inStock;
		}		
	}
