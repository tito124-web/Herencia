package herenciaysobreescritura.ejercicio10;

public class Cliente extends Factura {

	private String nombre;
	private String nit;
	public Cliente(int numero, int total, String cliente, String nombre, String nit) {
		super(numero, total, cliente);
		this.nombre = nombre;
		this.nit = nit;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNit() {
		return nit;
	}
	public void setNit(String nit) {
		this.nit = nit;
	}
	@Override
	public String toString() { // creamos un to string para mostrar informacion
		return "Cliente [nombre=" + nombre + ", nit=" + nit + "]";
	}
	
	

	
	
}
