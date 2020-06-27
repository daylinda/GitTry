package email_validation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		
		List <Employee> empList = new ArrayList<>();
		
		empList.add(new Employee(100,"Samantha","sam@gmail.com"));
		empList.add(new Employee(101,"Sam","sa@gmail.com"));
		empList.add(new Employee(102,"Ryan","ry@gmail.com"));
		empList.add(new Employee(103,"pathy","pat@gmail.com"));
		empList.add(new Employee(104,"Matty","mtty@gmail.com"));
		empList.add(new Employee(105,"randy","rm@gmail.com"));
		empList.add(new Employee(106,"sandy","sand@gmail.com"));
		empList.add(new Employee(107,"pandy","pyt@gmail.com"));
		empList.add(new Employee(108,"Olaf","olaf@gmail.com"));
		empList.add(new Employee(109,"Siyyaaa","siy@gmail.com"));
		
		
		//printEmpList(empList);
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter EmailID:");
		
		String email = sc.next();
		
		StringBuffer sb = new StringBuffer(email);
		
		
		if (email.matches("[a-z0-9]{1,}@[a-z]{1,}\\.com")) {
			
			for (int i = 0; i < empList.size(); i++) {
				
				if(empList.get(i).getEmail().matches(email)) {
					
					System.out.println("Found email ID");
					System.out.println("Employee Details:");
					System.out.println(empList.get(i));
					break;
				}
				
				
				
			}
			System.out.println("EmailID doesn't exist in list");
		
			
			
			
		} else {
			
			System.out.println("Invalid Email ID");

		}
		
		
		
		
		
		
		
	}
	
	private static void printEmpList(List<Employee> empList) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < empList.size(); i++) {
			
			System.out.println(empList.get(i));
			
		}
		
	}

	

}
