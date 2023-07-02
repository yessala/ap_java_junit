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
 */
class ElScannerNombreTest {
	// Input
	private final InputStream startIn = System.in;
	// Output
	private final PrintStream startOut = System.out;
	private final ByteArrayOutputStream testOut = new ByteArrayOutputStream();

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
		System.setOut(startOut);
		System.setIn(startIn);
	}
	
//	@Test
//	void testMain() {
//		String name = "Laura";
//		int age = 19;
//		ByteArrayInputStream in = new ByteArrayInputStream((name+"\n").getBytes());
//		System.setIn(in);
//		ByteArrayInputStream in2 = new ByteArrayInputStream((age+"\n").getBytes());
//		System.setIn(in2);
//		
//		ElScannerNombre.main(new String[1]);
//		
//		String out = testOut.toString();
//		System.setOut(startOut);
//		String[] outs = out.split("\r\n");
//		
//		assertEquals("Hola Mudo!!", outs[0]);
//		assertEquals("Mi nombre es "+name+" y tengo "+age+" de edad.", outs[2]);
//			
//	}

	@Test
	void testObtenerNombre() {
		ByteArrayInputStream in = new ByteArrayInputStream("Laura\n".getBytes());
		System.setIn(in);

		String result = ElScannerNombre.obtenerNombre();

		assertEquals("Laura", result);

	}

	@Test
	void testObtenerEdad() {
		ByteArrayInputStream in = new ByteArrayInputStream("19\n".getBytes());
		System.setIn(in);

		int result = ElScannerNombre.obtenerEdad();
		assertEquals(19, result);
	}

	@Test
	void testSaludo() {
		ElScannerNombre.saludo("Laura", 19);

		String out = testOut.toString();
		assertEquals("Mi nombre es Laura y tengo 19 años de edad.\r\n", out);
	}

}
