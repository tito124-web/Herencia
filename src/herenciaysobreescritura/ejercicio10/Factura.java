package herenciaysobreescritura.ejercicio10;

public class Factura {

	protected int numero;
	protected int total;
	protected String cliente;
	public Factura(int numero, int total, String cliente) {
		super();
		this.numero = numero;
		this.total = total;
		this.cliente = cliente;
	}
	
	public int calculartotal() {
		return 0;
		
	}

	public int getTotal() {
		return total;
	}
  // validamos que no sea negativo 
	public void setTotal(int total) {
		if(this.total <= 0) {
			throw new IllegalArgumentException (
			"no se permiten numero negativos ");		
					
		}
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public int calcularTotal() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
