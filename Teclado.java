
public class Teclado extends DispositivoEntrada{
	//Le asignamos "final" a idTeclado para que una vez asignado un valor, no se le pueda cambiar
		private final int idTeclado;
		private static int contadorTeclados;
		public Teclado(String tipoEntrada,String marca) {
		// TODO Auto-generated constructor stub
		super(tipoEntrada,marca);
		this.idTeclado=++Teclado.contadorTeclados;
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Teclado{ "+ "idTeclado= "+ idTeclado + ", " +super.toString()  + "}";
		}
}
