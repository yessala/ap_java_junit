/**
 * 
 */
package dia1;

import java.util.Scanner;

/**
 * @author yessa
 *
 */
public class ElScannerNombre {
	public static void main(String[] args) {
		String nombre = obtenerNombre();
		int edad = obtenerEdad();
		System.out.println("Hola Mundo!!");
		saludo(nombre, edad);

	}

	public static int obtenerEdad() {
		Scanner leer = new Scanner (System.in);
		return leer.nextInt();
	}

	public static String obtenerNombre() {
		Scanner leer = new Scanner (System.in);
		return leer.nextLine();
	}

	public static void saludo(String name, int age) {
		System.out.println("Mi nombre es " + name + " y tengo " + age + " años de edad.");
	}
}
