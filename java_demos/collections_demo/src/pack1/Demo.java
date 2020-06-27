package pack1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		
		List<Integer> l1 = new LinkedList<>();
		l1.add(0);
		l1.add(5);
		l1.add(null);
		l1.add(25);
		System.out.println(l1);
		l1.set(1, 3);
		System.out.println(l1.size());
		Integer i = 0;
		l1.remove(i);//remove element;
		l1.remove(2);//remove index
		System.out.println(l1);
		System.out.println(l1.contains(null));
		l1.remove(null);
		System.out.println(l1);
		l1.add(4);
		l1.add(5);
		
		
		Collections.reverse(l1);
		System.out.println(l1);
		Collections.shuffle(l1);
		System.out.println(l1);
		Collections.sort(l1,Collections.reverseOrder());
		System.out.println(l1);
		Collections.sort(l1);
		System.out.println(Collections.binarySearch(l1, 4));
		
		
		List <Integer> list1 = new LinkedList<>(Arrays.asList(12,33,55,11,11,29,30));
		System.out.println("list1"+list1);
		
		List<Integer> list2 = new ArrayList<>(Arrays.asList(12,33,55,11));//arraylist
		System.out.println("list2"+list2);
		
		
		list1.retainAll(list2);
		System.out.println(list1);
		
		
		
		list1.removeAll(list2);
		System.out.println("list1"+list1);
		
		list1.addAll(list2);//union all
		System.out.println("union"+list1);
		
		
		
		
		
		
		
		
	}
	

}
