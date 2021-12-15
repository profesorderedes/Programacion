
/*
 * Método de selección para ordenar un array.
 */
public class Ejemplo07 {

	public static void main(String[] args) {

		int valores[] = { 51, 40, 42, 38, 23, 29 };
		int posMin;
		int aux;
		
		// Fase de búsqueda
		
		// Fase de intercambio
		
		for (int i = 0; i < valores.length; i++) {
			
			// El array sin ordenar empieza en la posición i.
			
			// Buscamos el mínimo desde la posición i hasta el
			// final del array.
			posMin = i;
			for(int j = i; j < valores.length; j++) {
				
				// Si encontramos un valor más pequeño que
				// el de posMin, actualizamos posMin a esa
				// posición.
				if(valores[i] < valores[posMin]) {
					posMin = i;
				}
				
			}
			
			// Ahora la posición posMin contiene el valor más
			// pequeño desde i hasta el final del array.
			
			
			
		}
		
		
	}

}
