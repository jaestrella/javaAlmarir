package arraylist;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> lista1=new ArrayList<String>();
		
		lista1.add("juan");
		lista1.add("luis");
		lista1.add("carlos");
		
		PruebaArrayList.imprimir(lista1);
		lista1.add(1,"ana");
		PruebaArrayList.imprimir(lista1);
		lista1.remove(0);
		PruebaArrayList.imprimir(lista1);
		lista1.remove("carlos");
		PruebaArrayList.imprimir(lista1);
		System.out.println("Numero de elementos de la lista: "+lista1.size());
		if(lista1.contains("ana")) {
			System.out.println("El nombre ana esta contenido en la lista.");
		}else {
			System.out.println("El nombre ana no esta contenido en la lista.");
		}
		System.out.println("El segundo elemento de la lista es: "+lista1.get(1));
		lista1.clear();
		if(lista1.isEmpty()) {
			System.out.println("La lista esta vacia.");
		}
	}

}
