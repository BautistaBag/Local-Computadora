
public class Raton extends DispositivoEntrada{

	//Le asignamos "final" a idRaton para que una vez asignado un valor, no se le pueda cambiar
	private final int idRaton;
	private static int contadorRatones;
	public Raton(String tipoEntrada,String marca) {
	// TODO Auto-generated constructor stub
	super(tipoEntrada,marca);
	this.idRaton=++Raton.contadorRatones;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Raton{ "+ "idRaton= "+ idRaton + ", " +super.toString()  + "}";
	}
	
}
