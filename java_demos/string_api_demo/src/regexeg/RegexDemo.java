package regexeg;

public class RegexDemo {
	
	public static void main(String[] args) {
		
		String s = "AWSED7856A";
		
		if(s.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}")) {
			System.out.println("valid");
		}
		
		String s1 = "abc@gmail.com";
		
		if(s1.matches("[a-z0-9]{1,}@[a-z]{1,}\\.com")) {
			System.out.println("valid");
		}else {
			System.out.println("invalid");
		}
	
	}
	
	

}
