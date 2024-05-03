package supermercado;

public class perecedero extends producto {
	private int diasCaducar;

	public perecedero(String nombre, double precio, int diasCaducar) {
		super(nombre, precio);
		this.diasCaducar = diasCaducar;
	}

	public int getDiasCaducar() {
		return diasCaducar;
	}

	public void setDiasCaducar(int diasCaducar) {
		this.diasCaducar = diasCaducar;
	}

	@Override
	public String toString() {
		return super.toString()+" dias a caducar="+diasCaducar;
	}
	
	public double calcular(int cantidad) {
		double precioFinal=super.calcular(cantidad);
		if(diasCaducar==1) {
			return precioFinal /=4;
		}else if(diasCaducar==2) {
			return precioFinal /=3;
		}else {
			return precioFinal /=2;
		}
		
	}
}
