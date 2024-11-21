package hoja2;

public class Ejer01 {

	public static void main(String[] args) {

		int[] edades = { 20, 25, 30, 28, 31, 42, 30, 29, 28, 21, 60, 55, 20, 19 };
		boolean edadEncontrada = false;

		// Recorremos el array buscando el valor 35.
		for (int i = 0; i < edades.length; i++) {

			if (edades[i] == 35) {
				System.out.println("Localizada persona de 35 años, en la posición " + i + ".");
				edadEncontrada = true;
				break;
			}

		}

		if (!edadEncontrada) {
			System.out.println("No se ha encontrado a nadie con 35 años.");
		}

	}

}
