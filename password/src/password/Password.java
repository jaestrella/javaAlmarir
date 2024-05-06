package password;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca contraseña:");
		String pass=sc.nextLine();
		int intentos=3;
		
		for(int i=0;i<=intentos;i++) {
			System.out.println("Confirmar contraseña:");
			String confirmar=sc.nextLine();
			if(pass.equals(confirmar)) {
				System.out.println("Enhorabuena");
				break;
			}else {
				System.out.println("Le quedan "+(3-i)+" intentos");
			}
		}
		
		
	}

}
