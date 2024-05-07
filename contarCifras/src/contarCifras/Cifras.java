package contarCifras;

import java.util.Scanner;

public class Cifras {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n;
		
		do {
			System.out.println("Introduce un numero:");
			n=sc.nextInt();
		}while(n<0);
		
		int contador=0;
		for(int i=n;i>0;i=i/10) {
			contador++;
		}
		
		if(contador==1) {
			System.out.println("El numero "+n+" tiene "+contador+" cifra");
		}else
			System.out.println("El numero "+n+" tiene "+contador+" cifras");
		
		
	}

}
