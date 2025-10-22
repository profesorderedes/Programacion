package hoja2;

public class Ejer15 {

	public static void main(String[] args) {

// Crea una aplicación que calcule una lista con las potencias de 3 menores que 12000. Haz que
// en cada pasada del bucle se muestre el exponente y el valor de la potencia. Utiliza un bucle do-
// while.

		int i = 0;
		int resultado;

		do {

			resultado = (int) Math.pow(3, i);

			// Deberes: pensar cómo modificar el código para que la condición "resultado <
			// 12000" sólo aparezca una vez, en el while.
			if (resultado < 12000) {
				System.out.println("3^" + i + ": " + resultado);
			}

			i++;

		} while (resultado < 12000);

	}

}
