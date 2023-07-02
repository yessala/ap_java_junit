/**
 * 
 */
package dia1;

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
class NumericoTest {
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
	}

	@Test
	void testMain() {
		Numerico.main(new String[1]);
		String out = testOut.toString();
		String[] outs = out.split("\r\n");

		assertEquals("El doble de 3 es: 6", outs[0]);
		assertEquals("El triple de 3 es: 9", outs[1]);
	}
	
	@Test
	void testDoble() {
		int result = Numerico.doble(3);
		assertEquals(6, result);

	}
	
	@Test
	void testTriple() {
		int result = Numerico.triple(3);
		assertEquals(9, result);
	}
}
