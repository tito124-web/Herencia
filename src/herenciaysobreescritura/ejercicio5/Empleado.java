package herenciaysobreescritura.ejercicio5;

public class Empleado {
	protected String nombre;
	protected double salario;   // creanuestra clase padre con sus atributos 
	public Empleado(String nombre, double salario) {
		super();
		this.nombre = nombre;
		this.salario = salario;
	}
	
	
	public double getSalario() {
		return salario;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	
	public double calcularsalario() {  // creamos un metodo donde lo vamos a sobre escribir en la clase hija 
		return salario ;
		
		
	}


	public String getNombre() {
		return nombre;
	}

}
