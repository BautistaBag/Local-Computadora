
public class DispositivoEntrada {

	private String tipoEntrada;
	private String marca;
	
	public  DispositivoEntrada(String tipoEntrada,String marca) {
		this.tipoEntrada=tipoEntrada;
		this.marca=marca;
	}
	
	public String getMarca() {return marca;}
	public String getTipoEntrada() {return tipoEntrada;}
	public void setMarca(String marca) {this.marca = marca;}
	public void setTipoEntrada(String tipoEntrada) {this.tipoEntrada = tipoEntrada;}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "DispositivoEntrada{ "+ "tipoEntrada= " +tipoEntrada+", marca="+marca+"}" ;
	}
	
}
