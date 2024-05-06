package estructuras;

public class Bucles {

	public static void main(String[] args) {
		int num =1;
		
		/*System.out.println("Incrementar usando while");
		while(num!=100) {
			System.out.println(num);
			num++;
		}*/
		
		/*System.out.println("Incrementar usando for");
		for(int i=1;i<=100;i++) {
			System.out.println(num);
			num++;
		}*/
		
		for(int i=1;i<=100;i++) {
			if(num%2==0 || num%3==0) {
				System.out.println(num);
			}
			num++;
		}
	}

}
