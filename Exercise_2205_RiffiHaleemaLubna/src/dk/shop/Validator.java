package dk.shop;

public class Validator {
	
	//Validating Quantity of items
		private String quantityError = null;

		public boolean isQuantityValid(Integer quantity) {
			
			int min = 1;
			int max = 10;
			
			boolean valid = true;
			
			if(quantity < min || quantity > max){
				quantityError = "You can not add more than 10 products.";
				valid = false;
			}
			
			return valid;
			
		}
		
		public String getQuantityError() {
			return quantityError;
		}
		

}
