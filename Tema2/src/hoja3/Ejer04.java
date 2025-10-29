package hoja3;

import java.util.Scanner;

// 3.- Crea una aplicación para probar la capacidad de cálculo mental de los usuarios. 
// Se calcularán dos números aleatorios entre 1 y 100 y se mostrarán en pantalla. 
// A continuación el usuario deberá escribir el resultado de la suma de ambos números y 
// se le indicará si ha acertado o no. 
// Estas acciones se repetirán indefinidamente mediante un bucle while.

public class Ejer04 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// Bucle infinito que va calculando números aleatorios y preguntando el
		// resultado de sumarlos.
		while (true) {

			int num1 = (int) (Math.random() * 100 + 1);
			int num2 = (int) (Math.random() * 100 + 1);

			System.out.println("Calcula la suma de " + num1 + " y " + num2 + ":");
			int suma = entrada.nextInt();

			if (suma == num1 + num2) {
				System.out.println("Has acertado.");
			} else {
				System.out.println("Has fallado. La respuesta era: " + (num1 + num2));
			}

			// Preguntamos al usuario si quiere continuar. Si no, terminamos el bucle.
			entrada.nextLine();
			System.out.println("¿Quieres seguir jugando?");
			char respuesta = entrada.nextLine().charAt(0);

			if (respuesta != 's') {
				break;
			}

		}

		System.out.println("Gracias por jugar.");

	}

}
