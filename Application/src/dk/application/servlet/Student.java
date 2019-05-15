package dk.application.servlet;

import java.util.UUID;

public class Student {
	private String uniqueID = UUID.randomUUID().toString();
	private String firstname = null;
	private String lastname = null;
	private String gender = null;
	
	public String getFirstName() {
		return firstname;
	}

	public void setFirstName(String FirstName) {
		this.firstname = FirstName;
		
	}
	public String getLastName() {
		return lastname;
		
	}
	
	public void setLastName(String LastName) {
		this.lastname = LastName;
		
	}
	public String getGender() {
		return gender;
		
	}
	
	public void setGender(String Gender) {
		this.gender = Gender;
		
	}

	public String getUniqueID() {
		return uniqueID;
	}

	public void setUniqueID(String UniqueID) {
		this.uniqueID = UniqueID;
	}
}
