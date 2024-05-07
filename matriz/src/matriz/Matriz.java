package matriz;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
			Scanner sc =new Scanner(System.in);
			
			int matriz[][]=new int[4][4];
			
			boolean salir=false;
			int opcion,fila,col;
			
			boolean rellenado=false;
			
			do {
				
				System.out.println("Menu");
				System.out.println("1. Rellenar matriz");
				System.out.println("2. Sumar fila");
				System.out.println("3. Sumar columna");
				System.out.println("4. Sumar diagonal principal");
				System.out.println("5. Sumar diagonal inversa");
				System.out.println("6. Media elementos");
				System.out.println("7. Salir");
				System.out.println("Elije una opcion");
				opcion=sc.nextInt();
				
				switch (opcion) {
				case 1:
					rellenarMatriz(sc, matriz);
					rellenado=true;
					break;
				case 2:
					if(rellenado) {
						do {
							System.out.println("Elige una fila");
							fila=sc.nextInt();
						}while(!(fila>=0 && fila<matriz.length));
						System.out.println("La suma de los valores de la fila "+fila+" es: "+sumaFila(matriz, fila));
					}else {
						System.out.println("Debes rellenar la matriz primero");
					}
					break;
				case 3:
					if(rellenado) {
						do {
							System.out.println("Elige una columna");
							col=sc.nextInt();
						}while(!(col>=0 && col< matriz.length));
						System.out.println("La suma de los valores de la columna "+col+" es: "+sumaColumna(matriz, col));
					}else {
						System.out.println("Debes rellenar la matriz primero");
					}
					break;
				case 4:
					if(rellenado) {
						System.out.println("La suma de la diagonal principal es : "+sumaDiagonalPrincipal(matriz));
					}else {
						System.out.println("Debes rellenar la matriz primero");
					}
					break;
				case 5:
					if(rellenado) {
						System.out.println("La suma de la diagonal inversa es: "+sumaDiagonalInversa(matriz));
					}else {
						System.out.println("Debes rellenar la matriz primero");
					}
					break;
				case 6:
					if(rellenado) {
						System.out.println("La media de los valores de la matriz es: "+media(matriz));
					}else {
						System.out.println("Debes rellenar la matriz primero");
					}
					break;
				case 7:
					salir=true;
					break;
				default:
					System.out.println("Tienes que meter un valor entre 1 y 7");
				}
				
			}while(!salir);
			
			System.out.println("FIN");
	}
	
	
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
		
		public static double media(int[][] matriz) {
			double suma=0;
			double media;
			for(int i=0;i<matriz.length;i++) {
				for(int j=0;j>matriz[0].length;j++) {
					suma+=matriz[i][j];
				}
			}
			media=suma / (matriz.length * matriz.length);
			return media;
		}
	}

