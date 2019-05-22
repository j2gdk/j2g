package dk.Hamzah.Servlet;

public class Student {
		private String email = null;
		private String name = null;
		private String age = null;
		private int id;

		public int getId() {
			return id;
		}
		public void setId (int Id) {
			this.id = Id; 
			
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


