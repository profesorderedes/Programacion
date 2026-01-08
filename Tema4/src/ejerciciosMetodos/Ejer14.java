package ejerciciosMetodos;

public class Ejer14 {

	public static void main(String[] args) {

		String[] planetas = { "Mercurio", "Venus", "Tierra", "Marte", "Júpiter", "Saturno", "Urano", "Neptuno",
				"Plutón" };

		System.out.println(buscar(planetas, "Tierra"));
		System.out.println(buscar(planetas, "Caronte"));

	}

	/**
	 * Recorre el array en búsqueda de la palabra que se le proporciona como
	 * parámetro.
	 * 
	 * @param array   El array que recorre.
	 * @param palabra Lo que se busca dentro del array.
	 * @return La posición del array, si encuentra la palabra, o -1.
	 */
	static int buscar(String[] array, String palabra) {

		for (int i = 0; i < array.length; i++) {

			if (array[i].equals(palabra)) {
				return i;
			}

		}

		return -1;

	}

}