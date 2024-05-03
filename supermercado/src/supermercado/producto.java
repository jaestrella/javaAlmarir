package supermercado;

public class producto {
	private String nombre;
	private double precio;
	public producto(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "nombre="+nombre+", precio="+precio;
	}
	
	public double calcular(int cantidad) {
		return precio*cantidad;
	}
	
	
}
