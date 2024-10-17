import java.util.Scanner;

public class Ejemplo08b {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// Vamos a pedir un precio y si no es válido, indicaremos
		// que se esperaba un número.

		System.out.println("Escribe el precio del producto:");

		// Al llamar a hasNextFloat, el programa esperará a que el usuario
		// escriba algo en la terminal y pulse ENTER.
		float precio = 0;
		if (entrada.hasNextFloat()) {

			// Leemos el valor escrito por el usuario, que se quita del
			// buffer de entrada y se guarda en la variable precio.
			precio = entrada.nextFloat();

		} else {
			System.out.println("No es un precio correcto.");

			// Con la siguiente instrucción hacemos que el programa termine.
			System.exit(0);
		}

		// Añadimos otro bloque similar que pida el número de unidades
		// del producto. Y haga la comprobación de que dicho número sea un
		// entero.

		System.out.println("¿Cuántas unidades se han comprado?");

		int unidades = 0;
		if (entrada.hasNextInt()) {

			unidades = entrada.nextInt();

		} else {
			System.out.println("No es un número de unidades correcto.");

			// Con la siguiente instrucción hacemos que el programa termine.
			System.exit(0);
		}

		// Le decimos al usuario cuánto tiene que pagar.
		System.out.println("Tienes que pagar " + precio * unidades + " euros.");

	}
}
