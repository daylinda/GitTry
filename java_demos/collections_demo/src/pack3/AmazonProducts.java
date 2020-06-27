package pack3;

public class AmazonProducts implements Comparable<AmazonProducts>{
	
	private int pid;
	private String name;
	private double cost;
	private float rating;
	private String review;
	
	public AmazonProducts() {
		// TODO Auto-generated constructor stub
	}

	public AmazonProducts(int pid, String name, double cost, float rating, String review) {
		super();
		this.pid = pid;
		this.name = name;
		this.cost = cost;
		this.rating = rating;
		this.review = review;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	@Override
	public String toString() {
		return "AmazonPoduct :pid=" + pid + ", name=" + name + ", cost=" + cost + ", rating=" + rating + ", review="
				+ review + "";
	}

	@Override
	public int compareTo(AmazonProducts ap) {
		Integer p1 = this.pid;
		Integer p2 = ap.pid;
		return p1.compareTo(p2);
	}
	
	
	
	

}
