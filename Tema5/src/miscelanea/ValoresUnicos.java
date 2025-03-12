package miscelanea;

// A partir de un array de números que pueden repetirse,
// obtener los valores únicos (sin repeticiones).
public class ValoresUnicos {

	public static void main(String[] args) {

		// Array con elementos que pueden repetirse.
		int[] edades = { 32, 29, 32, 30, 29, 5, 32, 40, 80, 35, 29 };

		// Array con el mismo número de posiciones donde iremos
		// guardando los valores únicos.
		int[] unicos = new int[edades.length];

		// Variable que indica la posición donde se colocará el
		// próximo número dentro del array unicos.
		int limite = 0;

		// Esta variable nos permite indicar si un elemento está en el array
		// unicos o no.
		boolean existe;

		// Recorremos el array de edades.
		for (int i = 0; i < edades.length; i++) {

			// Miramos si edades[i] está ya en el array unicos.
			// Si no está, lo añadimos en la posición limite.
			// Si está, no hacemos nada.
			existe = false;
			for (int j = 0; j < limite; j++) {
				if (unicos[j] == edades[i]) {
					// Hemos encontrado que edades[i] está en
					// el array unicos. Luego lo indicamos
					// con la variable existe y paramos de buscar.
					existe = true;
					break;
				}
			}

			// Si no hemos encontrado con el for anterior que
			// edades[i] esté en unicos, lo añadimos a unicos.
			if (!existe) {
				unicos[limite] = edades[i];
				limite++;
			}
		}

		// Mostramos el array con valores únicos, sin repeticiones.
		for (int i = 0; i < limite; i++) {
			System.out.print(unicos[i] + "  ");
		}
	}

}
