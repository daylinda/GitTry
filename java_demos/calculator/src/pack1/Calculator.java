package pack1;

public class Calculator {
	
	private int a,b;
	private float z;
	private double d;
	
	public Calculator() {
		// TODO Auto-generated constructor stub
	}

	public Calculator(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
	public void add() {
		
		z = a+b;
		System.out.println("Addition result:"+z);
					
		
	}
	
	public void sub() {
		if(a>=b) {
			z = a-b;
			System.out.println("Subtraction:"+z);
		}else {
			z= b-a;
			System.out.println("Subtraction: -"+z);
		}		
	}
	
	public void mul() {
		
		d = a*b;
		System.out.println("Multiplication:"+d);
		
	}
	
	public void div() {
		
		if(b!=0) {
			
			z = (a*1.0f)/b;
			System.out.println("Division:"+z);
		}
	
		
		
	}
	

}
