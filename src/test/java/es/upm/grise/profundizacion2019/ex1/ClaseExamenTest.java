package es.upm.grise.profundizacion2019.ex1;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClaseExamenTest {
    //recorre el bucle hasta que es igual, se mete en el if y da que result=0
	// Se queda en bucle en el nodo 1 haciendo la resta, luego pasa al nodo 2 y entra por el if al nodo 3
	//despues del if va al return que es el nodo 5
	@Test
	public void test() {
		ClaseExamen clase = new ClaseExamen();
		assertEquals(0, clase.metodoAProbar(9, 6),0);
	}
	//NUNCA se va apoder meter en el else debido a que si A es mayor que B va a restar 1 a A hasta que se igualen,
	// por lo que A siempre va a ser <= que B

}
