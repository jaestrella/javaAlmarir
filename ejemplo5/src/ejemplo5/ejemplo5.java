package ejemplo5;

import java.util.Scanner;

public class ejemplo5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce nombre del alumno: ");
		String nombre=sc.nextLine();
		System.out.println("Introduce asignatura: ");
		String asignatura=sc.nextLine();
		System.out.println("Introduce la nota: ");
		int nota=sc.nextInt();
		
		alumno a1=new alumno(nombre,asignatura,nota);
			
		System.out.println(a1.toString());
	}

}
