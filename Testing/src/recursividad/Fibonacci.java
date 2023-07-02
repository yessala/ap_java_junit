package recursividad;

public class Fibonacci {

    // Método recursivo para calcular el número de Fibonacci
    public static int fibonacci(int n) {
        // Caso base: si n es 0 o 1, el resultado es n
        if (n == 0 || n == 1) {
            return n;
        } else {
            // Caso recursivo: llamamos al método fibonacci() con n-1 y n-2, y sumamos los resultados
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int numero = 8;
        int resultado = fibonacci(numero);
        System.out.println("El número de Fibonacci en la posición " + numero + " es: " + resultado);
    }
}
