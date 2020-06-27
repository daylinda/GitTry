package email_validation;

public class Employee implements Comparable<String>{
	
	
	private int id;
	private String name;	
	private String email;

	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int id, String name, String email) {
		
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee id=" + id + ", name=" + name + ", email=" + email + "";
	}

	@Override
	public int compareTo(String email) {
		// TODO Auto-generated method stub
		
		return 0;
	}
	
	
	
	
	
	
	
}
