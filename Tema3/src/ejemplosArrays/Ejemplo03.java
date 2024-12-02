package ejemplosArrays;
import java.util.Scanner;

public class Ejemplo03 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// Array de 5 posiciones.
		String[] apellidos = new String[5];

		// Antes de dar valores, en cada posición del array
		// se encuentra el valor null (debido a que los String son
		// objetos.
		System.out.println(apellidos[0]);

		// Array de 6 posiciones.
		float[] densidades = new float[6];

		// El valor inicial de todas las posiciones de un
		// array de números es 0.
		System.out.println(densidades[0]);

		// Rellenar el array de apellidos a mano.
		apellidos[0] = "Pérez";
		apellidos[1] = "Sánchez";
		apellidos[2] = "López";
		apellidos[3] = "Martínez";
		apellidos[4] = "Rodríguez";

		for (int i = 0; i < apellidos.length; i++) {

			System.out.print(apellidos[i] + " ");

		}

		// Rellenar el array de densidades con datos del usuario.

		System.out.println("Por favor, introduce las densidades de los planetas del sistema solar:");

		for (int i = 0; i < densidades.length; i++) {

			System.out.print("Densidad del planeta " + (i + 1) + ": ");
			densidades[i] = entrada.nextFloat();
		}

		// Mostramos los valores recién leídos.

		for (int i = 0; i < densidades.length; i++) {
			System.out.print(densidades[i] + " ");
		}

	}
}
