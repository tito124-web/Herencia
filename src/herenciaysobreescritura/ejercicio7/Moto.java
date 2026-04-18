package herenciaysobreescritura.ejercicio7;

public class Moto extends Vehiculo {
private String cilidrada; // declaramos nuestra atributo

public Moto(String marca, int velocidad, String cilidrada) {
	super(marca, velocidad);
	this.cilidrada = cilidrada;
}

public String getCilidrada() {
	return cilidrada;
}

public void setCilidrada(String cilidrada) {
	this.cilidrada = cilidrada;
}

public void mostrarinformacion() { // y mostramos la informacion 
	System.out.println("Marca: " + super.marca + " Cilindrada: " + cilidrada + " Velocidad top:" + super.velocidad);
	
	
}



}
