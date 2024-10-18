package ejercicios;

import java.util.Scanner;

public class Ejer27 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Por favor, inserte su número de usuario");
		int respuestaUsuario = entrada.nextInt();

		int calculo = respuestaUsuario % 2;

		String respuesta = calculo == 0 ? "Es par" : "Es impar";

		System.out.println("El número " + respuesta + ".");
	}
}
