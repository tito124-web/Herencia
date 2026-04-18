package herenciaysobreescritura.ejercicio2;

public class Sobreescribir extends Cuenta{

	private double sobregiro;
	
	

	public Sobreescribir(double saldo, double sobregiro) {
		super(saldo);
		this.sobregiro = sobregiro;
	}



	@Override
	public void retirar(double monto) {
		if(this.sobregiro + saldo >= monto ) {
			super.retirar(monto);
		}
		else {
			
			 System.out.println(" Límite de sobregiro superado");
		}
	}
	
	public double getLimiteSobregiro() {
        return sobregiro;
    }
	

}
