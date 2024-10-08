
public class Ejemplo09 {

	public static void main(String[] args) {

		int num1 = 10, num2 = 15;

		// Operaciones aritméticas

		System.out.println("Suma: " + (num1 + num2));
		System.out.println("Resta: " + (num1 - num2));
		System.out.println("Multiplicación: " + (num1 * num2));

		// La operación de dividir dos números enteros es
		// una división entera (desaparecen los decimales).
		System.out.println("División: " + (num1 / num2));

		// Para hacer una división normal (con decimales) hay que
		// convertir uno de los números a float o double:
		System.out.println("División: " + ((float) num1 / num2));

		// La operación módulo (%) nos devuelve el resto de
		// dividir dos números.
		System.out.println("Resto de la división: " + (num1 % num2));

		// Potencias con Math.pow(base, exponente)
		System.out.println("2 elevado a 8: " + Math.pow(2, 8));

	}

}
