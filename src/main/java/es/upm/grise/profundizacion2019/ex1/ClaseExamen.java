package es.upm.grise.profundizacion2019.ex1;

public class ClaseExamen {
	
	public float metodoAProbar(int a, int b) {
		
		float result = 0;
		//mientras a > b le resta uno hasta que sea igual
		//Nodo 1
		while( a > b) {
			a--;
		}
		//si a <=b entonces result =0
		//Nodo 2
		if (a <= b) {
			//Nodo 3
			result = 0;
		}
		//si no devuelve b, no se va a meter nunca aqui
		else {
			//Nodo 4
			result = b;
		}
		//Nodo 5
		return result;
	}

}
