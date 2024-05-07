package contarPalabras;

import java.util.Scanner;

public class ContarPalabras {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce frase: ");
		String frase=sc.nextLine();
		
		String[] contar=frase.split(" ");
		
		int contador=0;
		for(int i=0; i<contar.length;i++) {
			System.out.println(contar[i]);
			contador++;		
		}
		System.out.println("Numero de palabras: "+contador);
		
	}

}
