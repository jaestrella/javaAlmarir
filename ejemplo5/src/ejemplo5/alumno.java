package ejemplo5;

public class alumno {
	private String nombre;
	private String asignatura;
	private int nota;
	
	public alumno(String nombre, String asignatura, int nota) {
		super();
		this.nombre = nombre;
		this.asignatura = asignatura;
		this.nota=nota;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota=nota;
	}
	

	@Override
	public String toString() {
		if(nota<=4) {
			return "El alumno "+ nombre +" ha obtenido un Insuficiente en la asignatura de "+ asignatura;
		}else if(nota==5) {
			return "El alumno "+ nombre +" ha obtenido un Suficiente en la asignatura de "+ asignatura;
		}else if(nota==6) {
			return "El alumno "+ nombre +" ha obtenido un Bien en la asignatura de "+ asignatura;
		}else if(nota==7 || nota==8) {
			return "El alumno "+ nombre +" ha obtenido un Notable en la asignatura de "+ asignatura;
		}else {
			return "El alumno "+ nombre +" ha obtenido un Sobresaliente en la asignatura de "+ asignatura;
		}
		
	}
	
	
	
}
