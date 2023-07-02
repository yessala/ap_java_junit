/**
 * 
 */
package dia1;

/**
 * @author yessa
 *
 */
public class Numerico {
	public static void main(String[] args) {
		int numero = 3;

		System.out.println("El doble de " + numero + " es: " + doble(numero));
		System.out.println("El triple de " + numero + " es: " + triple(numero));

	}

	public static int doble(int num) {

		return num * 2;
	}

	public static int triple(int num) {

		return num * 3;
	}
}
