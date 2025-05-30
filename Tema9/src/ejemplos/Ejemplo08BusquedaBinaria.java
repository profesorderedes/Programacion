package ejemplos;

public class Ejemplo08BusquedaBinaria {

	public static void main(String[] args) {

		int[] valores = { 5, 7, 10, 20, 35, 37, 40, 42 };
		int numABuscar = 13;

		System.out.println("El número " + numABuscar + " está en la posición " + busquedaBinaria(valores, numABuscar));

	}

	/**
	 * Ejecuta una búsqueda binaria iterativa del valor n sobre el array valores.
	 * 
	 * @param valores Array donde hay que buscar el número.
	 * @param n       Número que hay que buscar dentro del array.
	 * @return La posición de n en el array valores, ó -1 si no se encuentra.
	 */
	private static int busquedaBinaria(int[] valores, int n) {

		int ini = 0;
		int fin = valores.length - 1;

		while (ini <= fin) {
			System.out.println("ini = " + ini + ", fin = " + fin);
			int medio = (ini + fin) / 2;

			if (n == valores[medio]) {
				return medio;
			} else if (n < valores[medio]) {
				fin = medio - 1;
			} else {
				ini = medio + 1;
			}
		}

		// Si la ejecución del método llega hasta aquí, significa que
		// ini > fin y, por tanto, no se ha encontrado el elemento n
		// en el array.
		return -1;

	}

}
