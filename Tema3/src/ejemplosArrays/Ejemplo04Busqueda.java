package ejemplosArrays;

public class Ejemplo04Busqueda {

	public static void main(String[] args) {

		String[] mascotas = { "gato", "periquito", "perro", "tortuga", "hamster", "canario", "pez", "serpiente" };

		// Elemento a buscar en el array.
		String buscar = "serpiente";
		boolean encontrado = false;

		// Recorremos el array comparando cada posición con el elemento que buscamos.
		for (int i = 0; i < mascotas.length; i++) {

			if (mascotas[i].equals(buscar)) {
				System.out.println("El elemento " + buscar + " se encuentra en la posición " + i + " del array.");
				encontrado = true;
				break;
			}

		}

		if (!encontrado) {
			System.out.println("No se ha encontrado.");
		}

	}

}
