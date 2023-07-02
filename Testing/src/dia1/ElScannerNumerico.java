/**
 * 
 */
package dia1;

import java.util.Scanner;

/**
 * @author yessa
 *
 */
public class ElScannerNumerico {

	public static void main(String[] args) {
		int numero = obtenerNumero();

		System.out.println("El doble de " + numero + " es: " + doble(numero));
		System.out.println("El triple de " + numero + " es: " + triple(numero));

	}

	public static int obtenerNumero() {
		Scanner leer = new Scanner(System.in);
		return leer.nextInt();
	}

	public static int doble(int num) {

		return num * 2;
	}

	public static int triple(int num) {

		return num * 3;
	}
}
