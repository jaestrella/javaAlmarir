package arraylist2;

public class Main {

	public static void main(String[] args) {
		Mazo mazo=new Mazo();
		System.out.println("Mazo de cartas ordenado.");
		mazo.imprimir();
		mazo.barajar();
		System.out.println("Mazo despues de barajar.");
		mazo.imprimir();
	}

}
