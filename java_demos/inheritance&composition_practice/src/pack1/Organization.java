package pack1;

public class Organization  {

	private int oid;
	private String orgName;
	private String headquarters;
	
	public Organization() {
		// TODO Auto-generated constructor stub
	}

	public Organization(int oid, String orgName, String headquarters) {
		this.oid = oid;
		this.orgName = orgName;
		this.headquarters = headquarters;
	}

	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getHeadquarters() {
		return headquarters;
	}

	public void setHeadquarters(String headquarters) {
		this.headquarters = headquarters;
	}

	@Override
	public String toString() {
		return "Organization: oid=" + oid + ", orgName=" + orgName + ", headquarters=" + headquarters + " ";
	}
	
	
	
}
