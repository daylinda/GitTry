package mypack;

public class MyClass {
	
	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		PrimitivesDemo.demo();
		
		Integer i = 9999;
		String s = i.toString();
		System.out.println(s);
		
		Float f = i.floatValue();
		System.out.println(f);
		f = 99.6767f;
		i = f.intValue();
		System.out.println(i);
		
		Double d = f.doubleValue();
		System.out.println(d);
		Long l = d.longValue();
		System.out.println(l);
		
		
		
		
	}

}
