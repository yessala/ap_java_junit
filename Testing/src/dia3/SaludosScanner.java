/**
 * 
 */
package dia3;

import java.util.Scanner;

/**
 * @author yessa
 *
 */
public class SaludosScanner {
	
		
	public static void main(String[] args) {
//		String name = "Alexis";
//		int age = 20;		
		
		System.out.println("Hola mundo");
		presentacion();
		
	}
	
	public static void presentacion() {
		
		Scanner leer = new Scanner(System.in);
		
		String nombre = leer.nextLine();
		int edad = leer.nextInt();
		
		System.out.println("Mi nombre es "+nombre+" y tengo "+edad+" años de edad.");
	
	}
	
	public static void scannercito() {
		
		Scanner leer = new Scanner(System.in);
		String perro = leer.next();
		
		System.out.println(perro);
		
	}
}
