package herenciaysobreescritura.ejercicio8;

public class Rectangulo extends Figura {
	private double base;                           // creamos los atrivutos 
	private double altura;
	public Rectangulo(double base, double altura) {
		super();
		this.base = base;                             // creamos el contructor y getter and setter
		this.altura = altura;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	@Override
	public double calcular() { // sobreescribimos el metodo para el rectangulo para alcular su area
		
		return base * altura;
	}
	
	
	
	
	

}
