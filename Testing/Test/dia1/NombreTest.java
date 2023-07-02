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

class NombreTest {
	
	/**
	 * lo que se hace en la primera declaracion es crear una variable del tipo
	 * "PrintStream" llamada en este test "standardOut" que guarda el valor del System.Out original
	 * 
	 * en la segunda declaracion se crea una objeto del tipo "ByteArrayOutputStream" que tiene por nombre
	 * en este test "outputStreamCaptor" y se inicializa el objeto. éste objeto lo que hace capturar el
	 * contenido del sout para testearlo.
	 *
	 */	
	private final PrintStream standardOut = System.out;
	private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
	
	/**
	 * el "BeforeEach" se ejecuta Antes del test
	 *  la funcion de éste es trasformar los sout en un formato utilizable para testear con los Assertions
	 *  como el nombre del mismo metodo dice "SetUp" lo seteamos en un SetOut para ser utilizado.
	 *  
	 */
	@BeforeEach
	public void setUp() {
		//creamos dentro de System.setOut un objeto del tipo PrintStream y le pasamos
		//como parametro el objeto tipo ByteArrayOutputStram para q tenga el formato correcto
		//para los Assertions
		System.setOut(new PrintStream(outputStreamCaptor));
	}
	
	
	
	/**
	 * El "AfterEach" se ejecuta despues del test
	 * este metodo "tearDown" devuelve al formato original al sout de la clase
	 * 
	 */
	@AfterEach
	public void tearDown(){
		//Setemos con el System.setOut la variable que tiene guardado el formato original
		//del sout de la clase.
		System.setOut(standardOut);
	}
	
	@Test
	void tesMain() {
		//llamamos al metodo main de la siguiente forma y le pasamos por parametro
		//un new String[1]
		Nombre.main(new String[1]);
		//creamos una variable del tipo String para asignarle el toString del formato del
		//sout para el test
		String out = outputStreamCaptor.toString();
		
		//Hay 3 maneras de testear un sout, aca dond usamos un array con assertsEquals
		//dond asignamos los valores a la array con un variable.split(objeto de division)
		String[] outs = out.split("\r\n");
		
		//comparamos con un assertEquals el texto a comparar seguido de la posicion
		assertEquals("Hola Mundo!!", outs[0]);
		assertEquals("Mi nombre es Laura y tengo 19 años de edad.", outs[1]);
		
			//este es otro metodo usando boolean assertTrue y contains en formato variable.contains(contenido.\r\n)
			//uno para cada sout
		//assertTrue con contains para compara los contenidos, retorna true y false OBVIO
//		assertTrue(out.contains("Hola Mundo!!\r\n"));
//		assertTrue(out.contains("Mi nombre es Yessalim y tengo 33 años de edad.\r\n"));

				//este metodo es funcional para un solo sout
			// \r\n para igualar el println(salto de linea) se "llaman caracteres de escape"	
		// esto funciona si es un solo system.out (creo) con uno me va bien, con dos NO
//		 assertEquals("Hola Mundo!!\r\n", out);
//		 assertEquals("Mi nombre es Yessalim y tengo 33 años de edad.\r\n", out);
						//me da error con los dos assertEquals
		
	}
	
	@Test
	void testSaludo() {
		Nombre.saludo("Laura", 19);
		String out = outputStreamCaptor.toString();
		assertEquals("Mi nombre es Laura y tengo 19 años de edad.\r\n", out);		
	}

}
