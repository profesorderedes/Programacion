package ejemplos;

public class Ejemplo17Continue {

	public static void main(String[] args) {

		// Programa que muestra los números del 1 al 100, pero
		// saltándose los que son múltiplos de 10.

		for (int i = 1; i <= 100; i++) {

			if (i % 10 == 0) {
				// Si i es múltiplo de 10, ejecutamos continue para saltar al
				// inicio del bucle.
				continue;
			}

			// Esta instrucción no se va a ejecutar si i es múltiplo de 10,
			// ya que se ejecutará antes un continue.
			System.out.println(i);

		}

	}

}
