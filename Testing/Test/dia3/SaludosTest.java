/**
 * 
 */
package dia3;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author yessa
 *
 */
class SaludosTest {
	
	private final PrintStream starOut = System.out;
	private final ByteArrayOutputStream testOut = new ByteArrayOutputStream();
//	private final ByteArrayOutputStream outputStreamCapture = new ByteArrayOutputStream();
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		System.setOut(new PrintStream(testOut));
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		System.setOut(starOut);
	}

	@Test
	void testMain(){
		Saludos.main(new String[1]);
		
		String salida = testOut.toString();
		
		String[] salidas = salida.split("\r\n");
		
		assertEquals("Hola mundo", salidas[0]);
		assertEquals("Mi nombre es Alexis y tengo 20 años de edad.", salidas[1]);
		
//		System.out.println("Hola mundo\r\n");
//		System.out.println("Mi nombre es Alexis y tengo 20 años de edad.\r\n");
		
	}
	
	
	
	@Test
	void testPresentacion() {
		Saludos.presentacion("Alexis", 20);
	 
		String salida = testOut.toString();
		
		assertEquals("Mi nombre es Alexis y tengo 20 años de edad.\r\n", salida);
	}

}
