
// Programa que te pregunta el nombre y 
// si te llamas Pablo te dice que puedes pasar,
// y si no, te lo prohíbe.

import java.util.Scanner;

public class Ejemplo07 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Nombre: ");
		String nombre = entrada.nextLine();

		if (nombre.equals("Pablo")) {
			System.out.println("Puedes pasar.");
		} else {
			System.out.println("No puedes pasar.");
		}

	}

}
