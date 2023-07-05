/**
 * 
 */
package dia3;

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
class SaludosScannerTest {
	
	private final InputStream startIn = System.in;
	
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

	@Test
	public void testMain() {
		
	}
	
	
//	@Test
//	public void testPresentacion() {
//		
//		String nombre = "Alexis";
//		int edad = 20;
//		
//		ByteArrayInputStream testIn = new ByteArrayInputStream((nombre+"\n").getBytes());		
//		System.setIn(testIn);
//		
//		
//		ByteArrayInputStream testIn2 = new ByteArrayInputStream((edad+"\n").getBytes());
//		System.setIn(testIn2);
//
//		SaludosScanner.presentacion();
//		
//		String salida = testOut.toString();
//		
//		assertEquals("Mi nombre es Alexis y tengo 20 años de edad.\r\n", salida);
//		
//	
//	}
	
	@Test
	public void testPresentacion() {
		
		String entrada = "Alexis\n20\n";
		
		ByteArrayInputStream testIn = new ByteArrayInputStream(entrada.getBytes());		
		System.setIn(testIn);
		
		SaludosScanner.presentacion();
		
		String salida = testOut.toString();
		
		assertEquals("Mi nombre es Alexis y tengo 20 años de edad.\r\n", salida);
		
	
	}	

	@Test
	public void testScannercito(){
		
		ByteArrayInputStream testIn = new ByteArrayInputStream(("Loki\n").getBytes());		
		System.setIn(testIn);
		
		SaludosScanner.scannercito();
		
		String salida = testOut.toString();
		
		assertEquals("Loki\r\n", salida);
		
	}
}
