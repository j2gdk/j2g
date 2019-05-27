package dk.delete.data;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;


public class Customer {

	private String name = null;
	private String email = null;
	private String age = null;
	private String error_name = null;
	private String error_email= null;
	private String error_age = null;
	private Integer id = null;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}	
	

	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	public boolean isNameValid(String name) {
    	
		int min = 5;
		boolean valid = true;

		if( name == null || name.isEmpty()){
			
			valid=false;
		}else if(name.length()< min ){

		    error_name = "Name can not be less then 5 characters";	


		    valid=false;
	}
		    return valid;

}
	public String getNameError(){

			return error_name;

	}
	
	public boolean isEmailValid(String email) {
		  
		        Matcher matcher = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE).matcher(email);
		        boolean valid = true;
		        
		        if( email == null || email.isEmpty()){
			
		        	error_email = "Enter a valid email address";
		        	
		        	valid=false;
		        	
		        }else if(matcher.find())

		        	valid =true;
		        else{
		       
		        }
				return valid;

			
	}
	
		public String getEmailError(){
			return error_email;
	  
	}
	
	public boolean isAgeValid(String age) {

		int min = 18;
		
	boolean valid = true;


		//Wrapper Classes, converting string value into integer value
	if( age == null || age.isEmpty()){
		
		valid=false;
	}else if(Integer.parseInt(age) < min ){
		
		error_age = "Age should be minimum 18 yrs";


		valid=false;
	}
		return valid;

	}
	public String getAgeError(){

		return error_age;
	


    	
	
	
	}

	
}
