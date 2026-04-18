package herenciaysobreescritura.ejercicio1;

public class Estudiante extends Persona {    // creamos nuestra clase hija 
 
	private String carnet;

	public Estudiante(String nombre, int edad, String carnet) {
		super(nombre, edad);
		this.carnet = carnet;
	}

	public String getCarnet() {
		return carnet;
	}

	public void setCarnet(String carnet) {
		this.carnet = carnet;
	}

	@Override
	public void mostrar() {  // sobreescribimos el metodo en nuestra clase hija 
		System.out.println("Nombre: " + nombre + " edad: " + edad + " caenet: " + carnet);
	}

	
	
	
	
}
