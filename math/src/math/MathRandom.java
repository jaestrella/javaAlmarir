package math;

import java.util.Scanner;

public class MathRandom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce primer numero: ");
		int n1=sc.nextInt();
		System.out.println("Introduce segundo numero: ");
		int n2=sc.nextInt();
		
		for(int i=1;i<=10;i++) {
			int aleatorios = (int)Math.floor(Math.random()*(n1-n2)+n2);
			System.out.println("Numero "+i+":"+aleatorios);
		}
	}

}
