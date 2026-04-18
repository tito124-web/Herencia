package herenciaysobreescritura.ejercicio10;

public class FacturaCredito extends Factura {

	private int recargo;
	private int cuotas;
	public FacturaCredito(int numero, int total, String cliente, int recargo, int cuotas) {
		super(numero, total, cliente);
		this.recargo = recargo;
		this.cuotas = cuotas;
	}
	public int getRecargo() {
		return recargo;
	}
	public void setRecargo(int recargo) {
		this.recargo = recargo;
	}
	public int getCuotas() {
		return cuotas;
	}
	public void setCuotas(int cuotas) {
		this.cuotas = cuotas;
	}
	
	@Override
    public int calcularTotal() {  // sobreesribimos el metodo
        int totalConRecargo = super.calcularTotal() + (super.calcularTotal() * recargo);

        // Validar que no sea negativo
        if (totalConRecargo < 0) {
            System.out.println(" El total no puede ser negativo");
            return 0;
        }
        return totalConRecargo;
    }
	@Override
	public String toString() { // creamos un to string para mostrar informacion
		return "FacturaCredito [recargo=" + recargo + ", cuotas=" + cuotas + ", numero=" + numero + ", total=" + total
				+ ", cliente=" + cliente + "]";
	}
	
	
	
	
	
	
}
