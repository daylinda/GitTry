package pack1;

public class Main {

	public static void main(String[] args) {
		
//		Team team=new Team(9000, "India", "INDIA");
//		Player player=new Player(100, "Sachin R T",  1,team);
//	//	player.printPlayer();
//		printAnyObject(player);
//		Player player1=new Player(101, "Viru Sehawag",  2,team);
//	//	player1.printPlayer();
//		printAnyObject(player1);
//		
//		Person per=new Person(7777, "Ramya");
//		printAnyObject(per);
//		
//		Object o=new Object();
//		printAnyObject(o);
//		
//		printAnyObject(team);
		
		Organization og1 = new Organization(100,"ABC","Mumbai");
		
		Address ad1 = new Address(1,1001,"Mumbai","Maharashtra","Sai nagar");
					
		
		Employee e1 = new Employee("Intern",og1,ad1);
		
		printAnyObject(e1);
		
		
		
		
		
	}
	
	public static void printAnyObject(Object obj) {
		if(obj instanceof Player) {
			Player p=(Player) obj;
			System.out.println("\nPrinting player");
			p.printPlayer();
		}else if(obj instanceof Employee) {
			Employee e=(Employee) obj;
			System.out.println("\nPrinting Employees");
			((Employee) obj).printEmployee();
			
		}else if(obj instanceof Person) {
			Person p=(Person) obj;
			System.out.println("\nPrinting Person");
			p.printPerson();
		}else if(obj instanceof Team) {
			Team t=(Team) obj;
			System.out.println("\nPrinting Team");
			t.printTeam();
		}else if(obj instanceof Organization) {
			Organization org=(Organization) obj;
			System.out.println("\nPrinting Organization");
			System.out.println(obj.toString());
		}else if(obj instanceof Address) {
			Address add=(Address) obj;
			System.out.println("\nPrinting Address");
			System.out.println(obj.toString());
		}else {
			System.out.println("\nYou should be java.lang.Object");
		}
		
	}

}
