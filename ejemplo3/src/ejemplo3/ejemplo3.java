package ejemplo3;


public class ejemplo3 {

	public static void main(String[] args) {
		
		cuenta c1= new cuenta("Pepe");
		cuenta c2= new cuenta("Juan", 300);
		
		c1.ingresar(500);
		c2.ingresar(300);
		
		c1.retirar(100);
		c2.retirar(400);
		
		System.out.println(c1);
		System.out.println(c2);
		

	}

}
