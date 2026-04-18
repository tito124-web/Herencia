package herenciaysobreescritura.ejercicio5;

public class Gerente extends Empleado{  // creamos nuetsra classe hija 
private double bonoadicional;

public Gerente(String nombre, double salario, double bonoadicional) {
	super(nombre, salario);
	this.bonoadicional = bonoadicional;
}

public double getBonoadicional() {
	return bonoadicional;
}

@Override
public double calcularsalario() { // y sobe escribimos el metodo 
	
	return salario + bonoadicional;
}




}
