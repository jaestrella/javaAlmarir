
public class Serie implements Entregable {
	
	private final static int NUM_TEMPORADAS_DEF=3;
	public final static int MAYOR=1;
	public final static int MENOR=-1;
	public final static int IGUAL=0;
	
	private String titulo;
	private int numeroTemporadas;
	private boolean entregado;
	private String genero;
	private String creador;
	
	public Serie(){
	       this("",NUM_TEMPORADAS_DEF, "", "");
	}
	
	public Serie(String titulo, String creador){
	       this(titulo,NUM_TEMPORADAS_DEF, "", creador);
	}
	
	public Serie(String titulo, int numeroTemporadas, String genero, String creador){
     this.titulo=titulo;
     this.numeroTemporadas=numeroTemporadas;
     this.genero=genero;
     this.creador=creador;
     this.entregado=false;
 }

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumeroTemporadas() {
		return numeroTemporadas;
	}

	public int setNumeroTemporadas(int numeroTemporadas) {
		return numeroTemporadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	@Override
	public void entregar() {
		entregado=true;
		
	}

	@Override
	public void devolver() {
		entregado=false;
		
	}

	@Override
	public boolean isEntregado() {
		if(entregado) {
			return true;
		}
		return false;
	}

	@Override
	public int compareTo(Object a) {
		int estado=MENOR;
		
		Serie ref=(Serie)a;
		if(numeroTemporadas>ref.getNumeroTemporadas()) {
			estado=MAYOR;
		}else if(numeroTemporadas==ref.getNumeroTemporadas()) {
			estado=IGUAL;
		}
		return estado;
	}

	@Override
	public String toString() {
		return "Informacion de la Serie: \n" +
                "\tTitulo: "+titulo+"\n" +
                "\tNumero de temporadas: "+numeroTemporadas+"\n" +
                "\tGenero: "+genero+"\n" +
                "\tCreador: "+creador;
	}
	
	public boolean equals(Serie a) {
		if(titulo.equalsIgnoreCase(a.getTitulo())&&creador.equalsIgnoreCase(a.getCreador())) {
			return true;
		}
		return false;
	}
	
	
}
