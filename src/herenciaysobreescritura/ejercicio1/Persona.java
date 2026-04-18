package herenciaysobreescritura.ejercicio1;

public class Persona {
 // creamos nuestra clase padre con sus repectivos atributos 
	protected String nombre;
	protected int edad;
	
	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	
	
	public void mostrar() { // y creamos el metodo mostrar
		System.out.println("nombre es " + nombre + " edad " + edad);
		
		
		
	}
	
}
