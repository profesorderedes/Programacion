package hoja2;

public class Ejer01 {

	public static void main(String[] args) {

		int[] edades = { 20, 25, 30, 28, 39, 42, 30, 29, 28, 21, 60, 55, 20, 19 };

		int buscar = 35;
		boolean encontrado = false;

		for (int i = 0; i < edades.length; i++) {

			if (edades[i] == buscar) {
				System.out.println("Se ha encontrado a una persona con 35 años en la posición: " + buscar);
				encontrado = true;
				break;
			}

		}

		if (!encontrado) {
			System.out.println("No se ha encontrado.");
		}

	}

}