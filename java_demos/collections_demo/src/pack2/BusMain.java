package pack2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import pack2.Bus;

public class BusMain {
	
	public static void main(String[] args) {
		
		List <Bus> busList = new ArrayList<>();
		busList.add(new Bus(121,"abc",123.33,2.3f,"Ac"));
		busList.add(new Bus(122,"abc",23.33,2.3f,"Ac"));
		busList.add(new Bus(123,"abc",123.33,0.3f,"non"));
		busList.add(new Bus(124,"abc",3.33,2.3f,"Ac"));
		busList.add(new Bus(125,"abc",123.33,4.3f,"Anon"));
		busList.add(new Bus(126,"abc",23.33,2.3f,"Ac"));
		
		printBusList(busList);
		
		Collections.sort(busList);
		
		System.out.println("\n");
		
		printBusList(busList);
		
		
		
				
		
	}
	
	
	public static void printBusList(List<Bus> busList) {
		for (int i = 0; i < busList.size(); i++) {
			System.out.println(busList.get(i));
		}
	}

}
