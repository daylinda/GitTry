package mypack;

public class PrimitivesDemo {
	static void demo(){
		
		System.out.println("Implicit casting::");
		int x = 10;
		System.out.println("int::"+x);
		long l = x;
		System.out.println("long::"+l);		
		float f = l;
		System.out.println("float::"+f);
		double d = f;
		System.out.println("double::"+d);
		
		System.out.println("Explicit casting");
		x = 100	;
		char z = (char) x;
		System.out.println("char::"+z);
		d = 100.0000d;
		System.out.println("double::"+d);
		f = (float) d;
		System.out.println("float::"+f);
		l = (long)f;
		System.out.println("long::"+l);
		x = (int)l;
		System.out.println("int::"+x);
		
		
		
		
	}

}
