package dk.delete.data;

public class Customer {
	private String firstname = null;
	private String lastname = null;
	private String gender = null;
	
	private int id;
	private static int count = 0;
	public int getId(){
		return id;
	}
	public void setId(int id){
		count++;
		id = count;
		this.id = id;
	}
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}

