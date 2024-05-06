package ventas;

import java.util.Scanner;

public class Ventas {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce el numero de ventas:");
		int ventas=sc.nextInt();
		
		int contador=0;
		for(int i=0;i<ventas;i++) {
			System.out.println("Introduce el precio de venta "+(i+1));
			int precio=sc.nextInt();
			contador=contador+precio;
		}
		
		System.out.println(contador);
	}

}
