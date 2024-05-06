package almacen;

public class Main {

	public static void main(String[] args) {
		Almacen a= new Almacen();
		
		Bebida b;
		/*Bebida b1=new AguaMineral("manantial1", 1, 5, 1.5, "bezoya");
		a.agregarBebida(b1);
		Bebida b2=new BebidaAzucarada(0.2, true, 1, 6, 3, "Coca cola");
		a.agregarBebida(b2);*/
		for(int i=0;i<10;i++){
            switch(i%2){
                case 0:
                    b=new AguaMineral("manantial1", 5, 1.5, "bezoya");
                    a.agregarBebida(b);
                    break;
                case 1:
                    b=new BebidaAzucarada(0.2, true, 6, 3, "Coca cola");
                    a.agregarBebida(b);
                    break;
            }
        }
		
		a.mostrarBebidas();
		
		System.out.println("Precio de todas las bebidas "+a.calcularPrecioBebidas());
		
		a.eliminarBebida(4);
		
		a.mostrarBebidas();
		
		System.out.println("Precio de todas las bebidas "+a.calcularPrecioBebidas());
		System.out.println("Precio de todas las bebidas de la marca bezoya "+a.calcularPrecioMarcas("bezoya"));
		System.out.println("Calcular el precio de la columna 0: "+a.calcularPrecioColumna(0));
	}

}
