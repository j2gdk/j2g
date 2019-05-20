package dk.ID.data;

public class Validator {
	private String email = null;
	private String name = null;
	private String age = null;
	
	public boolean isEmailValid(String email){
		boolean valid = true;
		
		if(email.equals("@") && email.equals(".")){
			valid = true;
		}
		return valid;
	}
	
	public boolean isNameValid(String name){
		boolean valid = true;
		int min = 5;
		
		if(min < name.length()){
			valid = true;
		}
		return valid;
	}
	
	public boolean isAgeValid(String age){
		boolean valid = true;
		int min = 18;
		
		if(min < Integer.parseInt(age)){
			valid = true;
		}
		return valid;
		
	}
	
}
