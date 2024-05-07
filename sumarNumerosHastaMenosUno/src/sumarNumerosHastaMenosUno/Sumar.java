package sumarNumerosHastaMenosUno;

import java.util.Scanner;

public class Sumar {

	public static void main(String[] args) {
		//Mostrar el numero de numeros introducidos 
		Scanner sc = new Scanner (System.in);
		int n;
		int contador=0;
		
		do {
			
			System.out.println("Introduce numeros:");
			contador++;
			n=sc.nextInt();
			
		}while(n!=-1);
		
		System.out.println("Total de numeros introducidos: "+(contador-1));

	}

}
