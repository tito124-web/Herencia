package herenciaysobreescritura;


import java.util.Scanner;

import herenciaysobreescritura.ejercicio1.Docente;
import herenciaysobreescritura.ejercicio1.Estudiante;
import herenciaysobreescritura.ejercicio10.Cliente;
import herenciaysobreescritura.ejercicio10.FacturaContado;
import herenciaysobreescritura.ejercicio10.FacturaCredito;
import herenciaysobreescritura.ejercicio2.CuentaAhorro;
import herenciaysobreescritura.ejercicio2.Sobreescribir;
import herenciaysobreescritura.ejercicio3.Fechadevencimiento;
import herenciaysobreescritura.ejercicio4.Bus;
import herenciaysobreescritura.ejercicio5.Gerente;
import herenciaysobreescritura.ejercicio7.Moto;
import herenciaysobreescritura.ejercicio8.Circulo;
import herenciaysobreescritura.ejercicio8.Rectangulo;
import herenciaysobreescritura.ejercico6.Perro;
import herenciaysobreescritura.ejercico9.LibroDigital;


public class Main {

	public static void main(String[] args) {
		
		   Scanner sc = new Scanner(System.in);
	        int opcion;

	        do {
	            System.out.println("\n========== MENU ==========");
	            System.out.println("1.  Docente y Estudiante");
	            System.out.println("2.  Cuentas Bancarias");
	            System.out.println("3.  Fecha de Vencimiento");
	            System.out.println("4.  Bus");
	            System.out.println("5.  Gerente");
	            System.out.println("6.  Perro");
	            System.out.println("7.  Moto");
	            System.out.println("8.  Figuras Geometricas");
	            System.out.println("9.  Libro Digital");
	            System.out.println("10. Factura");
	            System.out.println("0.  Salir");
	            System.out.println("==========================");
	            System.out.print("Seleccione una opcion: ");
	            opcion = sc.nextInt();

	            switch (opcion) {
	                case 1:
	                    ejercicio1();
	                    break;
	                case 2:
	                    ejercicio2();
	                    break;
	                case 3:
	                    ejercicio3();
	                    break;
	                case 4:
	                    ejercicio4();
	                    break;
	                case 5:
	                    ejercicio5();
	                    break;
	                case 6:
	                    ejercicio6();
	                    break;
	                case 7:
	                    ejercicio7();
	                    break;
	                case 8:
	                    ejercicio8();
	                    break;
	                case 9:
	                    ejercicio9();
	                    break;
	                case 10:
	                    ejercicio10();
	                    break;
	                case 0:
	                    System.out.println("Saliendo del programa...");
	                    break;
	                default:
	                    System.out.println("Opcion invalida. Intente de nuevo.");
	            }

	        } while (opcion != 0);

	        sc.close();
	    }
		
	
	

	public static void ejercicio1() {
		Docente per = new Docente("William", 21, "Calculo");
		Estudiante per1 = new Estudiante("tito", 18 , "0905-25-21930");
		
		per1.mostrar();
		per.mostrar();
	}
	
	
	public static void ejercicio2() {
		
		CuentaAhorro c1 = new CuentaAhorro(66.0,25.0);
		Sobreescribir c2 = new Sobreescribir(6.0,10.0);
		
		
		c1.retirar(20.0);
		c2.retirar(100.0);
		
		System.out.println("el saldo es " + c1.getSaldo());
		System.out.println("el saldo es " + c2.getSaldo());
		
	}
	
	
	public static void ejercicio3() {
		
		Fechadevencimiento produc1 = new Fechadevencimiento("Playstation", "1",0,50,10,20);
		Fechadevencimiento produc2 = new Fechadevencimiento("play2","2",900,50,20,13);
       produc1.fecha(30);
       produc2.fecha(11);
   
        System.out.println("Descuento del producto 1  es de " + produc1.carDescuento(18) + " fecha es " + produc1.getFecha());
        System.out.println("Descuento del producto 2   es de " + produc2.carDescuento(20) + " fecha es " + produc2.getFecha());
		
	}
	
	public static void ejercicio4() {
		Bus b1 = new Bus(20, " hacia jutiapa");
		b1.descripcion();
		
		
	}
	
	
	public static void ejercicio5() {
		Gerente ge1 = new Gerente("tito",50,60);
		System.out.println("Nombre " + ge1.getNombre() + " el salario es de " + ge1.getSalario() + " el bono total es de " + ge1.calcularsalario());
		
		
		
		
	}
	
	
	public static void ejercicio6() {
		Perro per = new Perro ("rocky", "pastoraleman");
		
		System.out.println(per.hacersonido());
		
		
	}
	
	
	
	
	public static void ejercicio7() {
		Moto mot1 = new  Moto("Suzuki", 120, "125cc");
		
		mot1.mostrarinformacion();
		
		
	}
	
	
	
	public static void ejercicio8() {
		
		Rectangulo rec = new Rectangulo(5.0,6.0);
		Circulo cir = new Circulo(5.0);
		
		System.out.println(rec.calcular());
		System.out.println(cir.calcular());
		
		
	}
	
	
	public static void ejercicio9() {
		
		LibroDigital lib = new LibroDigital("memorias del sudsuelo", "Fiodor tostogesqui" , "23MB");
		
		lib.mostrarinfo();
		
		
		
	}
	
	public static void ejercicio10() {
		
		Cliente cl1 = new Cliente(25, 30, "tito", "090525219630", null);
			FacturaContado con1 = new FacturaContado(0, 0, null, 0);
			FacturaCredito cre1 = new FacturaCredito(0, 0, null, 0, 0);
	
			System.out.println(cl1.calculartotal());
			System.out.println(con1.calcularTotal());
			System.out.println(cre1.calcularTotal());
	
	System.out.println(cl1.toString());
	System.out.println(con1.toString());
	System.out.println(cre1.toString());
	
	
	
}
}
