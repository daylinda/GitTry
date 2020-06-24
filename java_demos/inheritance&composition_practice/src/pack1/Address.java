package pack1;

public class Address {

	private int aid;
	private int zipcode;
	private String cityName;
	private String stateName;
	private String street;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(int aid, int zipcode, String cityName, String stateName, String street) {
		
		this.aid = aid;
		this.zipcode = zipcode;
		this.cityName = cityName;
		this.stateName = stateName;
		this.street = street;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}
	

	@Override
	public String toString() {
		return "Address : aid=" + aid + ", zipcode=" + zipcode + ", cityName=" + cityName + ", stateName=" + stateName
				+ ", street=" + street + " ";
	}
	
	
	
	
}
