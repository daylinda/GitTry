package pack1;

public class Employee extends Person {

	private String designation;
	private Organization organization;
	private Address address;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String designation, Organization organization, Address address) {
		
		this.designation = designation;
		this.organization = organization;
		this.address = address;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Organization getOrganization() {
		return organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	void printEmployee() {
		System.out.println("/nPrinting Employee Details");
		printPerson();
		System.out.println("Designation = " + designation);

		System.out.println(organization.toString());
		System.out.println(address.toString()); 
	}
}
