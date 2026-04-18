package herenciaysobreescritura.ejercico6;

public class Perro extends Animal  {     // aplicamos el comcepto de herencia ya que esta clase es la clase hija
	private String raza;

	public Perro(String name, String raza) {
		super(name);
		this.raza = raza;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	@Override
	public String hacersonido() {  //sobre escribimos el metodo de hacer sonido de la clase padre 
		
		return "el perro no ladra";
	}

}
