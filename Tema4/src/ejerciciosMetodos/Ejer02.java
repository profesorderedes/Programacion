package ejerciciosMetodos;

import java.util.Scanner;

public class Ejer02 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("¿Cómo te llamas?");
		String nombre = entrada.nextLine();

		System.out.println("¿Cuántos años tienes?");
		int edad = entrada.nextInt();

		System.out.println(hablar(nombre, edad));

	}

	static String hablar(String nombre, int edad) {

		return "Hola " + nombre + ", no parece que tengas " + edad + " años.";

	}

}