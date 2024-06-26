package arraylist2;

public class Carta {
	public enum Palo{TREBOL,DIAMANTE,CORAZON,PICA};
	
	private int numero;
	private Palo palo;
	public Carta(int numero, Palo palo) {
		super();
		this.numero = numero;
		this.palo = palo;
	}
	
	public void imprimir() {
		System.out.println(numero+" - "+palo.toString().toLowerCase());
	}
	
	public Palo palo() {
		return palo;
	}
}
