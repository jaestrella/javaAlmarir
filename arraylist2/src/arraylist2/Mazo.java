package arraylist2;

import java.util.ArrayList;
import java.util.Collections;

public class Mazo {
	ArrayList<Carta> cartas= new ArrayList<Carta>(8);
	
	Mazo(){
		cartas.add(new Carta(1, Carta.Palo.TREBOL));
		cartas.add(new Carta(2, Carta.Palo.TREBOL));
	    cartas.add(new Carta(1, Carta.Palo.DIAMANTE));
	    cartas.add(new Carta(2, Carta.Palo.DIAMANTE));
	    cartas.add(new Carta(1, Carta.Palo.PICA));
	    cartas.add(new Carta(2, Carta.Palo.PICA));
	    cartas.add(new Carta(1, Carta.Palo.CORAZON));
	    cartas.add(new Carta(2, Carta.Palo.CORAZON));
	}
	
	public void imprimir() {
		for(Carta carta : cartas) {
			carta.imprimir();
		}
	}
	
	public void barajar() {
		Collections.shuffle(cartas);
	}
}
