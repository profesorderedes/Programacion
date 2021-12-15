
/*
 * Método de selección para ordenar un array.
 */
public class Ejemplo07 {

	public static void main(String[] args) {

		int valores[] = { 51, 40, 42, 38, 23, 29 };
		int posMin;
		int aux;

		for (int i = 0; i < valores.length - 1; i++) {

			// El array sin ordenar empieza en la posición i.

			// Fase de búsqueda
			// Buscamos el mínimo desde la posición i hasta el
			// final del array.
			posMin = i;
			for (int j = i + 1; j < valores.length; j++) {

				// Si encontramos un valor más pequeño que
				// el de posMin, actualizamos posMin a esa
				// posición.
				if (valores[j] < valores[posMin]) {
					posMin = j;
				}

			}

			// Ahora la posición posMin contiene el valor más
			// pequeño desde i hasta el final del array.

			// Fase de intercambio
			// Intercambiamos el valor en posMin por el
			// valor en i.
			aux = valores[posMin];
			valores[posMin] = valores[i];
			valores[i] = aux;

		}
		
		for (int i = 0; i < valores.length; i++) {
			System.out.print(valores[i] + " ");
		}

	}

}
