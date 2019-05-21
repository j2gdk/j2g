package dk.exercise_1505_AfzalWeb.servlet;
public class Student {
	private String email = null;
	private String name = null;
	private String age = null;
	private int id;

	
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

	public int getId() {
		return id;
	}

	public void setId(int Id) {
		this.id = Id;
	}
}
