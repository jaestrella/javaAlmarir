/*package matriz;

import java.util.Scanner;

public class MetodosMatriz {
	public static void rellenarMatriz(Scanner sc, int[][]matriz) {
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[0].length;j++) {
				System.out.println("Dato de la posicion: "+i+" "+j);
				matriz[i][j]=sc.nextInt();
			}
		}
	}
	
	public static int sumaFila(int[][]matriz, int fila) {
		int suma=0;
		for(int j=0;j<matriz.length;j++) {
			suma+=matriz[fila][j];
		}
		return suma;
	}
	
	public static int sumaColumna(int[][]matriz, int col) {
		int suma=0;
		for(int i=0;i<matriz.length;i++) {
			suma+=matriz[i][col];
		}
		return suma;
	}
	
	public static int sumaDiagonalPrincipal(int[][]matriz) {
		int suma=0;
		for (int i = 0, j = 0; i < matriz.length; i++, j++) {
            suma += matriz[i][j];
        }
		return suma;
	}
	
	public static int sumaDiagonalInversa(int[][]matriz) {
		int suma=0;
		for (int i = 0, j = 3; i < matriz.length; i++, j--) {
            suma += matriz[i][j];
        }
		return suma;
	}
	
	public static double media(int[][]matriz) {
		double suma=0;
		double media;
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j>matriz[0].length;j++) {
				suma+=matriz[i][j];
			}
		}
		media=suma/(matriz.length*matriz.length);
		return media;
	}
}*/
