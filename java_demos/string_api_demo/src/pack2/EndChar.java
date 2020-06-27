package pack2;

public class EndChar {
	
	public static void main(String[] args) {
		
		String s ="hey guys";
		
		String ar[]= s.split(" ");
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < ar.length; i++) {
			sb.append(ar[i].substring(0, ar[i].length()-1)).append(Character.toUpperCase(ar[i].charAt(ar[i].length()-1))).append(" ");
			
		}
		System.out.println(sb.toString().trim());
	}

}
