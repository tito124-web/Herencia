package herenciaysobreescritura.ejercico6;

public abstract class  Animal {
	protected String name;  // esta el nuetra clase padre que comparte commo atrivuto el nombre a la clase hija

	public Animal(String name) {  // implementamos un contructor 
		super();
		this.name = name;     // como nota al iniciar la clase le agregammos abstract es decir que el metodo se va a sobre escribir en la classe hija
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	

	public abstract String hacersonido(); // y creamos un metodo de hacer sonido 
		
		
		
		
	
	
	
	
	
	
	
}
