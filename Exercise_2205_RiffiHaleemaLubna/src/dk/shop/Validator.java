package dk.shop;

public class Validator {
	
	//Validating Quantity of items
		public boolean isQuantityValid(Integer quantity) {
			
			int min = 1;
			int max = 10;
			
			boolean valid = true;
			
			if(quantity < min || quantity > max){
				valid = false;
			}
			
			return valid;
			
		}
}
