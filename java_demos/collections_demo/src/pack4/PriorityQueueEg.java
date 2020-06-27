package pack4;

import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueEg {
	
	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		pq.add(10);
		pq.add(30);
		pq.add(56);
		pq.add(18);
		pq.add(25);
		pq.add(6);
		
		System.out.println(pq.toString());
		
		System.out.println(pq.peek());
		
		System.out.println(pq.size());
		
		pq.offer(67);
		System.out.println(pq);
		
		System.out.println(pq.comparator());//returns comapartor used
		
				
		
	}
	
	
	
	
	

}
