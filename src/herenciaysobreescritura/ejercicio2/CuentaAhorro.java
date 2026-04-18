package herenciaysobreescritura.ejercicio2;

public class CuentaAhorro extends Cuenta{

	private double tasa;

	

public CuentaAhorro(double saldo, double tasa) {
		super(saldo);
		this.tasa = tasa;
	}



public double getTasa() {
	return tasa;
}



public void setTasa(double tasa) {
	this.tasa = tasa;
}



@Override
public void retirar(double monto) {
if (saldo- monto >= 0) {
super.retirar(monto);
} else {
System.out.println("Saldo insuficiente");
}
}




	
}
