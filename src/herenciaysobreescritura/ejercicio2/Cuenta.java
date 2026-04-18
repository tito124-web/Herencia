package herenciaysobreescritura.ejercicio2;

public class Cuenta {
	
	protected double saldo;

	public Cuenta(double saldo) {
		super();
		this.saldo = saldo;
	}
	
	
	public void depositar(double monto) {
		saldo += monto;
		}

		public void retirar(double monto) {
		saldo -= monto;
		}


		public double getSaldo() {
			return saldo;
		}
     
		
}
