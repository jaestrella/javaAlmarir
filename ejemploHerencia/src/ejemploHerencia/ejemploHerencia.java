package ejemploHerencia;

public class ejemploHerencia {

	public static void main(String[] args) {
		comercial c1=new comercial("DDR", 37, 1000, 300);
		repartidor r1=new repartidor("fer", 28, 900, "zona 3");
		
		c1.plus();
		r1.plus();
		
		System.out.println(c1);
		System.out.println(r1);

	}

}
