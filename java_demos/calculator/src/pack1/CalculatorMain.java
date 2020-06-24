package pack1;

import java.util.Scanner;

public class CalculatorMain {
	
	public static void main(String[] args) {
		int a,b;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter values:");
		a = s.nextInt();
		b = s.nextInt();
		Calculator c = new Calculator(a,b);
		c.add();
		c.sub();
		c.mul();
		c.div();
	}

}
