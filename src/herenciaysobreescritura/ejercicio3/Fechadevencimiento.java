package herenciaysobreescritura.ejercicio3;

public class Fechadevencimiento extends Producto{
	
	private Integer fecha;
	// creamos nuestra clase vencimiento que nuestra clase hija 

	public Fechadevencimiento(String codigo, String nombre, int precio, int stock, int cantidad, Integer fecha) {
		super(codigo, nombre, precio, stock, cantidad);
		this.fecha = fecha;
	}

	public Integer getFecha() {
		return fecha;
	}

	
	public void fecha(Integer fecha) {    // validamos la fecha
		if(fecha > this.fecha) {
			System.out.println("el producta ha vencido " + fecha);
			
		}
		
		
	}

	

	
	

	

	
	
	

}
