package hoja1;

import java.util.Scanner;

public class Ejer25 {

	public static void main(String[] args) {

// Crea un programa que pregunte el nombre del usuario y luego lo escriba. Ahora bien, si el
// usuario no introduce nada, el nombre deberá quedar con el valor "Desconocido".

		Scanner input = new Scanner(System.in);

		System.out.println("Nombre: ");
		String respuesta = input.nextLine();

		// Para indicar que respuesta es distinta de "", usamos el símbolo de negación
		// (!).
		String nombre = (!respuesta.equals("")) ? respuesta : "Desconocido";

		System.out.println("Nombre: " + nombre);

	}

}