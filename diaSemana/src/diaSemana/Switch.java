package diaSemana;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce dia de la semana:");
		String dia=sc.nextLine();
		
		switch(dia) {
			case "lunes","martes","miercoles","jueves","viernes":System.out.println("Es un dia laborable.");break;
			case "sabado","domingo":System.out.println("Es un dia festivo.");break;
			default:System.out.println("Introduce un dia de la semana");
		
		}
	}

}
