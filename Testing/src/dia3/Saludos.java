/**
 * 
 */
package dia3;

/**
 * @author yessa
 *
 */
public class Saludos {
	
	public static void main(String[] args) {
		String name = "Alexis";
		int age = 20;		
		
		System.out.println("Hola mundo");
		presentacion(name,age);
		
	}
	
	public static void presentacion(String nombre, int edad) {
		
		System.out.println("Mi nombre es "+nombre+" y tengo " + edad + " años de edad.");
	
	}
	
}
