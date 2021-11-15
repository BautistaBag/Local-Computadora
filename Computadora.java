
public class Computadora {

	private final int idComputadora;
	private String nombre;
	private Monitor monitor;
	private Teclado teclado;
	private Raton raton;
	private static int contadorComputadora;
	
	private Computadora() {
		this.idComputadora=++Computadora.contadorComputadora;
	}
	
	public Computadora(String nombre,Monitor monitor,Teclado teclado,Raton raton) {
		this();
		this.nombre = nombre;
		this.monitor = monitor;
		this.teclado = teclado;
		this.raton = raton;
	}
	
	 public int getIdComputadora() {return idComputadora;}
	 public Monitor getMonitor() {return monitor;}
	 public String getNombre() {return nombre;}
	 public Raton getRaton() {return raton;}
	 public Teclado getTeclado() {return teclado;}
	 public void setMonitor(Monitor monitor) {this.monitor = monitor;}
	 public void setNombre(String nombre) {this.nombre = nombre;}
	 public void setRaton(Raton raton) {this.raton = raton;}
	 public void setTeclado(Teclado teclado) {this.teclado = teclado;}
	 
	 @Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Computadora{" + "idComputadora= "+ idComputadora + ",nombre= "+nombre+", monitor "+monitor+",teclado= "+teclado+",raton= "+raton+"}";
	}
}
