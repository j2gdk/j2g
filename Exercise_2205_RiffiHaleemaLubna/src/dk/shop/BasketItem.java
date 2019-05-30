package dk.shop;

import java.math.BigDecimal;

public class BasketItem {

		Integer id=null;
		String name=null;
		String description=null;
		Integer quantity=null;
		BigDecimal price=null;
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
		 * @return the price
		 */
		public BigDecimal getPrice() {
			return price;
		}
		/**
		 * @param product1Price the price to set
		 */
		public void setPrice(BigDecimal product1Price) {
			this.price = product1Price;
		}
		
		
	}
