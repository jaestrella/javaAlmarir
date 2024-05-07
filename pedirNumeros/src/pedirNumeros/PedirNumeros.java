package pedirNumeros;

import java.util.Scanner;

public class PedirNumeros {

	public static void main(String[] args) {
		int numeroUsuario=0;
		int menor=0;
		int mayor=0;
		int suma=0;
		double media;
		int contador=-1;
		int sumaPositivos=0;
		int sumaNegativos=0;
		
		Scanner sc= new Scanner(System.in);
		
		do {
			//cambia el menor por el numero del usuario		
			if(menor>numeroUsuario) {
				menor=numeroUsuario;
			}
			//cambia el mayor por el numero del usuario
			if(mayor<numeroUsuario) {
				mayor=numeroUsuario;
			}
			
			suma+=numeroUsuario;
			
			if(numeroUsuario>=0) {
				sumaPositivos+=numeroUsuario;
			}else
				sumaNegativos+=numeroUsuario;
			
			contador++;
			
			System.out.println("Introduce un numero: ");
			numeroUsuario=sc.nextInt();
			
		}while(numeroUsuario!=-1);
		
		media=(double)suma/contador;
		
		System.out.println("El menor es: "+menor);
		System.out.println("El mayor es: "+mayor);
		System.out.println("La suma es: "+suma);
		System.out.println("La suma de los positivos es: "+sumaPositivos);
		System.out.println("La suma de los negativos es: "+sumaNegativos);
		System.out.println("La media es: "+media);
	}

}
