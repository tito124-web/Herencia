package herenciaysobreescritura.ejercico9;

public class LibroDigital extends Libro{

	private String tamañodigital;

	public LibroDigital(String nombre, String autor, String tamañodigital) {
		super(nombre, autor);
		this.tamañodigital = tamañodigital;
	}

	public String getTamañodigital() {
		return tamañodigital;
	}

	public void setTamañodigital(String tamañodigital) {
		this.tamañodigital = tamañodigital;
	}
	
	public void mostrarinfo() { // creamos un metodo para mpstrar 
		System.out.println("Nombre del libro es " + super.nombre + " Autor " + super.autor  + " el tamaño del libro es " + tamañodigital);
		
		
	}
}
