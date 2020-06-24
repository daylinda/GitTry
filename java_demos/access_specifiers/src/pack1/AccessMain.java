package pack1;

import pack2.AccessTwo;

public class AccessMain {
	
	public static void main(String[] args) {
		AccessOne ao = new AccessOne();
		ao.publicDisplay();
		ao.defautDisplay();
		ao.protectedDisplay();
		ao.privateDisplay();
		
		AccessTwo at = new AccessTwo();
		at.publicDisplay();
	}

}
