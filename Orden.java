
public class Orden {

	private final int idOrden;
	private Computadora computadoras[];
	private static int contadorOrdenes;
	private static final int MAX_COMPUTADORAS = 10;
	private int contadorComputadoras;
	
	public Orden() {
	//Inicializamos el contador de idOrden
	this.idOrden = ++Orden.contadorOrdenes;
	//Inicializamos el arreglo de computadoras con su cantidad maxima
	computadoras = new Computadora[Orden.MAX_COMPUTADORAS];
	}
	
	public void agregarComputadora(Computadora computadora) {
		if(this.contadorComputadoras < Orden.MAX_COMPUTADORAS) {
			//Primero  guardo la nueva computadora en el arreglo y luego incremento el indice del arreglo
			this.computadoras[this.contadorComputadoras++] = computadora;  
		}else {
			System.out.println("Has superado el limite: "+ Orden.MAX_COMPUTADORAS);
		}
	}
	
	public void mostrarOrden() {
		System.out.println("Orden #:" + this.idOrden);
		System.out.println("Computadoras de la orden #:"+ this.idOrden);
		//Dentro del for coloco el numero real que tiene hasta el momento mi arreglo
		for(int i = 0; i <	this.contadorComputadoras; i++) {
			System.out.println(this.computadoras[i]);	
		}
	}
}
