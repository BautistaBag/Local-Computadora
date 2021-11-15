
public class Main {
	
	public static void main(String[] args) {
		Monitor monitorHP = new Monitor("HP",27);
		Teclado tecladoHP = new Teclado("bluetooth","HP");
		Raton ratonHP = new Raton("bluetooth","HP");
		Computadora computadoraHP = new Computadora("Computadora HP",monitorHP,tecladoHP,ratonHP);
	
		Monitor monitorGamer = new Monitor("Razer",32);
		Teclado tecladoGamer = new Teclado("bluetooth","MSI");
		Raton ratonGamer = new Raton("bluetooth","Razer");
		Computadora computadoraGamer = new Computadora("Computadora Gamer",monitorGamer,tecladoGamer,ratonGamer);
		
		Orden orden1 = new Orden();
		orden1.agregarComputadora(computadoraHP);
		orden1.agregarComputadora(computadoraGamer);
		
		orden1.mostrarOrden();
	}
	
}
