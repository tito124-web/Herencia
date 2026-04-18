package herenciaysobreescritura.ejercicio1;

public class Docente extends Persona{
	 // creamos nuestra clase hija 
	private String especialidad;

	public Docente(String nombre, int edad, String especialidad) {
		super(nombre, edad);
		this.especialidad = especialidad;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	@Override
	public void mostrar() {  // sobreescribimos el metodo en nuestra clase hija 
		System.out.println("Nombre: " + nombre + " edad: " + edad + " espesialisacion: " + especialidad);
	}
	
	
	

}
