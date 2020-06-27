package pack3;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<AmazonProducts> productList = new LinkedList<>();
		
		productList.add(new AmazonProducts(100,"Botanique Shampoo",179.99,3.2f,"Good"));
		productList.add(new AmazonProducts(101,"Botanique plus Shampoo",299.99,1.2f,"ok"));
		productList.add(new AmazonProducts(107,"Botanique Conditioner",189.99,1.0f,"Bad"));
		productList.add(new AmazonProducts(300,"Dove Shampoo",79.99,1.5f,"Bad"));
		productList.add(new AmazonProducts(300,"Dove Shampoo",79.99,4.5f,"Good"));
		productList.add(new AmazonProducts(207,"Tresseme deep conditioner",899.99,3.2f,"Good"));
		productList.add(new AmazonProducts(105,"Botanique deep Shampoo",179.99,3.2f,"Good"));
		productList.add(new AmazonProducts(100,"Botanique Shampoo",179.99,2.0f,"Good"));
		
		System.out.println("\nPrinting product list\n");
		printProductList(productList);
		
		
		System.out.println("\n Sorted product list\n");
		Collections.sort(productList);
		printProductList(productList);
		
		Collections.sort(productList, (AmazonProducts ap1, AmazonProducts ap2) -> {
			
			Double d1 = ap1.getCost();
			Double d2 = ap2.getCost();
			int x = d1.compareTo(d2);
			if(x==0) {
				Float f1 = ap1.getRating();
				Float f2 = ap2.getRating();
				x = f2.compareTo(f1);
			}
			return x;
						
		});
		
		
		
		
		

	}
	
	public static void printProductList(List<AmazonProducts> productList) {
		
		for (int i = 0; i < productList.size(); i++) {
			
			System.out.println(productList.get(i));
			
		}
		
		
	}

}
