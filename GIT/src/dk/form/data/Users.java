package dk.form.data;

public class Users {
	private static int count = 0;
	private String email = null;
	private String name = null;
	private String age = null;
	private int id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		count++;
		id = count;
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
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
	
}
