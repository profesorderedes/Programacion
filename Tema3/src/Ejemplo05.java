/*
 * Encontrar el mínimo y el máximo en un array
 */
public class Ejemplo05 {

	public static void main(String[] args) {
		
		int edades[] = {30, 32, 27, 40, 25, 28, 21, 50, 56, 19};
		
		// La variable min siempre toma como valor inicial el 
		// primer valor del array.
		int min = edades[0];
		int max = edades[0];
		
		// Recorremos el array desde la posición 1. No hace falta
		// empezar por la posición 0 porque ahí está justamente
		// el valor inicial de min.
		for (int i = 1; i < edades.length; i++) {
			
			// Si en una posición hay un valor menor que min, 
			// guardamos ese valor como nuevo mínimo.
			if(edades[i] < min) {
				min = edades[i];
			}
			if(edades[i] > max) {
				max = edades[i];
			}
			
		}
	
		System.out.println("La persona más joven tiene " + min + 
				" años.");
		System.out.println("La persona más mayor tiene " + max + 
				" años.");
		
		
	}
	
}






