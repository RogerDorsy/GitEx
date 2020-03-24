package base;

import avanzato.Ex2;

public class Ex1 {

	public static void main(String[] args) {
		
		System.out.println(metodo1());
		Ex2 e2 = new Ex2();
		System.out.println(e2.metodo1("Ciao da", "Me"));

	}
	public static String metodo1() {
		return "Hello Word!";
	}

}
