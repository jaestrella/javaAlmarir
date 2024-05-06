package dowhile;

import java.util.Scanner;

public class Dowhile {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int num;
		
		do {
			
			System.out.println("Introduce un numero: ");
			num=sc.nextInt();
			
			
		}while(num<=0);
		
		System.out.println(num);

	}

}
