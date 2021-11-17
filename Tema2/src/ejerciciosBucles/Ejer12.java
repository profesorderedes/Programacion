package ejerciciosBucles;

/*
Escribe una aplicación que haga una pregunta y muestre un menú con cuatro posibles respuestas numeradas. Por ejemplo:

    ¿Quién es el autor de la novela "Ready Player One"?
    1) Douglas Capland
    2) Isaac Asimov
    3) Ernest Cline
    4) Ray Bradbury
 */
import java.util.Scanner;

public class Ejer12 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int respuesta;

		do {
			System.out.println("¿Quien es el autor de la novela Ready Player One?" + "\n1) Douglas Capland"
					+ "\n2) Isaac Asimov" + "\n3) Ernest Cline" + "\n4) Ray Bradbury");
			respuesta = entrada.nextInt();
		} while (respuesta < 1 || respuesta > 4);

		if (respuesta == 3) {
			System.out.println("¡Respuesta correcta!");
		} else {
			System.out.println("Has fallado.");
		}

	}

}