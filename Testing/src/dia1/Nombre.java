package dia1;

public class Nombre {
	
	public static void main(String[] args) {
		String nombre = "Yessalim";
		int edad = 33;
		System.out.println("Hola Mundo!!");
		saludo(nombre,edad);
		
	}
	
	public static void saludo(String name, int age) {
		System.out.println("Mi nombre es " + name + " y tengo " + age + " años de edad.");
	}
}
