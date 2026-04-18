package herenciaysobreescritura.ejercicio10;

public class FacturaContado extends Factura {

	private int descuento;

	public FacturaContado(int numero, int total, String cliente, int descuento) {
		super(numero, total, cliente);
		this.descuento = descuento;
	}

	public int getDescuento() {
		return descuento;
	}

	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}
	
	 @Override
	    public int calcularTotal() {
	        int totalConDescuento = super.calculartotal() - (super.calculartotal() * descuento);

	        // Validar que no sea negativo
	        if (totalConDescuento < 0) {
	            System.out.println("El total no puede ser negativo");
	            return 0;
	        }
	        return totalConDescuento;
	    }

	 @Override
	 public String toString() { // creamos un to string para mostrar informacion
		return "FacturaContado [descuento=" + descuento + "]";
	 }

	 
	
	
}
