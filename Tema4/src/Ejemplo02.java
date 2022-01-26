import java.util.Scanner;

public class Ejemplo02 {

	// Variable global.
	static float precios[] = new float[5];

	public static void main(String[] args) {

		leerPrecios();

		ordenarPrecios();

		mostrarPrecios();

	}

	static void leerPrecios() {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe 5 precios:");

		for (int i = 0; i < precios.length; i++) {

			System.out.print("Precio " + (i + 1) + ": ");
			precios[i] = entrada.nextFloat();

		}

	}

	static void ordenarPrecios() {

		int posMin;
		float aux;

		for (int i = 0; i < precios.length - 1; i++) {

			posMin = i;

			for (int j = i + 1; j < precios.length; j++) {
				if (precios[j] < precios[posMin]) {
					posMin = j;
				}
			}

			aux = precios[i];
			precios[i] = precios[posMin];
			precios[posMin] = aux;

		}

	}

	static void mostrarPrecios() {
		
		System.out.println("Precios almacenados:");
		for (int i = 0; i < precios.length; i++) {
			System.out.print(precios[i] + "  ");
		}

	}

}
