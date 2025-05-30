package ejemplos;

public class Ejemplo09BusquedaBinaria {

	public static void main(String[] args) {

		int[] valores = { 5, 7, 10, 20, 35, 37, 40, 42 };
		int numABuscar = 42;

		System.out.println("El número " + numABuscar + " está en la posición "
				+ busquedaBinaria(valores, numABuscar, 0, valores.length - 1));

	}

	/**
	 * Ejecuta una búsqueda binaria recursiva del valor n sobre el array valores.
	 * 
	 * @param valores Array donde hay que buscar el número.
	 * @param n       Número que hay que buscar dentro del array.
	 * @param ini     Posición inicial donde buscaremos el valor n
	 * @param fin     Posición final donde buscaremos el valor n
	 * @return La posición de n en el array valores, ó -1 si no se encuentra.
	 */
	private static int busquedaBinaria(int[] valores, int n, int ini, int fin) {

		System.out.println("ini = " + ini + ", fin = " + fin);

		// Caso base: si fin es mayor que inicio, significa que no se
		// ha encontrado el valor buscado.
		if (ini > fin) {
			return -1;
		}

		int medio = (ini + fin) / 2;

		if (n == valores[medio]) {
			return medio;
		} else if (n < valores[medio]) {
//			fin = medio - 1;
			return busquedaBinaria(valores, n, ini, medio - 1);
		} else {
//			ini = medio + 1;
			return busquedaBinaria(valores, n, medio + 1, fin);
		}

	}

}
