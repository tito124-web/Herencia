package herenciaysobreescritura.ejercicio4;

public class Bus extends Trasporte {
	
	private String ruta;  // creamos nuestra clase hija con sus atrivutos 

	public Bus(int cantidad, String ruta) {
		super(cantidad);
		this.ruta = ruta;
	}

	public String getRuta() {
		return ruta;
	}

	public void descripcion() {  // y creamos un metodo para mostrar la discripcion del bus 
		
		System.out.println("la ruta es " + ruta + " la capacidad es de " + cantidad);
		
	}
	

}
