/**
 * 
 */
package dia1;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author yessa
 * 
 * 
 * Aplicando JUnit al método Scanner
 * Cabe destacar que para probar un método que use Scanner, el Scanner debe ser
 * inicializado en ese metodo y en cada método que lo utilice.
 * 
 * no se puede inicializar como un static fuera del main.
 * 
 */
class ElScannerNumericoTest {
	//Para testear la entrada de texto se hace casi lo mismo que el out.. a continuacion
	private InputStream startIn = System.in;
	
	private final PrintStream startOut = System.out;
	private final ByteArrayOutputStream testOut = new ByteArrayOutputStream();

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		//No se trabaja en el BeforeEach cuando es un input porque se trabaja 
		//directamente en el método que se a testear
		System.setOut(new PrintStream(testOut));
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		System.setOut(startOut);
		System.setIn(startIn); //Aqui si guardamos el valor original del Input con setIn
	}

	@Test
	void testObtenerNumero() {
		//Lo se se haria en BeforeEach, se hace en el metodo.
		//Al objeto creado se le pasa por parametro el 
		//"numero y se simula el enter con \n".getBytes() ... get.Bytes para obtener el numero.
				//destaco que el scanner con el System.in fue inicializado dentro del metodo
		ByteArrayInputStream in = new ByteArrayInputStream("1\n".getBytes());
		System.setIn(in);								//ese 1 el número que simula leer el scanner 
		int result = ElScannerNumerico.obtenerNumero(); //que es lo que se guarda en la variable result.
		assertEquals(1, result);
//		assertEquals(Resultado esperado, resultado obtenido)
	}
	

	@Test
	void testMain() { //haciendo uso de la triple A, definida en la teoria
		//variable para el valor leido por el in en el main
		int num = 10;		
		//Para trabajar la funcion del scanner del metodo Obtener numero, llamado en el main
		//para testear input siempre se usa lo siguiente para simular la asignacion de valor
		ByteArrayInputStream in = new ByteArrayInputStream((num+"\n").getBytes());
		System.setIn(in);
		//para poder trabajar de manera automatica en el assertEquals, tmbien se puede
		//Colocar variales definidas localmente
		int doble = num*2;
		int triple = num*3;
		
		ElScannerNumerico.main(new String[1]);
		
		String out = testOut.toString();
		String[] outs = out.split("\r\n");
		assertEquals("El doble de "+num+" es: "+doble, outs[0]);
		assertEquals("El triple de "+num+" es: "+triple, outs[1]);
	}
	
	@Test
	void testDoble() {
		int result = ElScannerNumerico.doble(3);
		assertEquals(6, result);

	}
	
	@Test
	void testTriple() {
		int result = ElScannerNumerico.triple(3);
		assertEquals(9, result);
	}

}
