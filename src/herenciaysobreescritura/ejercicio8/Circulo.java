package herenciaysobreescritura.ejercicio8;

public class Circulo extends Figura{
	private double radio;
	
	
	public Circulo(double radio) {
		super();
		this.radio = radio;
		
	}
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	@Override
	public double calcular() {           // de igual manera sobreescribimos el metodo para el circulo 
		
		return radio = Math.PI * Math.pow(radio, 2); // con MATH.PI hacemos o abtenesmo el numero pi y con MATH.pow lo que hacemos es que el radio lo elevamos al cuadrado
	}
	
	
	
	

}
