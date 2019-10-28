package es.upm.grise.profundizacion2019.ex1;

public class ClaseExamen {
	
	public float metodoAProbar(int a, int b) {
		
		float result = 0;
		
		while( a > b) {
			a--;
		}
		
		if (a <= b) {
			result = 0;
		}
		else {
			result = b;
		}
		
		return result;
	}

}
