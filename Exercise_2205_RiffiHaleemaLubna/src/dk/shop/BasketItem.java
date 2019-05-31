package dk.shop;

import java.math.BigDecimal;

public class BasketItem {

		Integer id=null;
		String name=null;
		String description=null;
		Integer quantity=null;
		BigDecimal unitPrice=null;
		BigDecimal totalPrice=null;
		/**
		 * @return the id
		 */
		public Integer getId() {
			return id;
		}
		/**
		 * @param id the id to set
		 */
		public void setId(Integer id) {
			this.id = id;
		}
		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}
		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}
		/**
		 * @return the description
		 */
		public String getDescription() {
			return description;
		}
		/**
		 * @param description the description to set
		 */
		public void setDescription(String description) {
			this.description = description;
		}
		/**
		 * @return the quantity
		 */
		public Integer getQuantity() {
			return quantity;
		}
		/**
		 * @param quantity the quantity to set
		 */
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
		
	}
