package herenciaysobreescritura.ejercicio3;

public class Producto {
// esta clase esw nuestra clase padre 
	protected String codigo;    //aqui se reutilizo codigo de un ejercico anterior que es producto con sus repectivos atrivutos 
	protected String nombre;
	protected int precio;
	protected int stock;
	protected int cantidad;
	

public Producto(String codigo, String nombre, int precio, int stock, int cantidad) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
		this.cantidad = cantidad;
	}




public void vender(int cantidad) { // creamos un metodo de vernder
    if (cantidad <= 0) {
        System.out.println("La cantidad debe ser mayor a 0.");
    } else if (cantidad <= stock) {
        stock = stock - cantidad; // 
        System.out.println("Venta exitosa. Stock restante: " + stock);
    } else {
        System.out.println("Stock insuficiente. Stock disponible: " + stock);
    }
}
		
		


	public int getStock() {
		return stock;
	}


	public void setStock(int stock) {
		if (stock >= 0)
		this.stock = stock;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {   // validamos que el precio no sea menor a 0
		if (precio <= 0) {
			System.out.println("el precio no puede ser 0");
		this.precio = 0;}
		else {
			this.precio = precio;
		}
	}


	public double carDescuento(int porcentaje) {
		 return precio = precio - (precio * porcentaje / 100);
		
	}
	

	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
}
