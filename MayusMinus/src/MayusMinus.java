import java.util.Scanner;

public class MayusMinus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce frase:");
		String frase=sc.nextLine();
		String fraseMayus=frase.toUpperCase();
		String fraseMinus=frase.toLowerCase();
		//System.out.println(fraseMayus);
		//System.out.println(fraseMinus);
		System.out.println("1.Mostrar frase en MAYUSCULA");
		System.out.println("2.Mostrar frase en minuscula");
		
		int opcion=sc.nextInt(); 
				
		switch (opcion) {
			case 1:
				System.out.println(fraseMayus);
				break;
			case 2:
				System.out.println(fraseMinus);
				break;
			default:
				System.out.println("Introduce una frase");
		}
		
		
		

	}

}
