import java.util.Scanner;

public class Substr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce frase: ");
		String frase=sc.nextLine();
		String buscar=frase.substring(3,5);
		
		System.out.println(buscar);
		
		

	}

}
