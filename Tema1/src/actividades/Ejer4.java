package actividades;

import java.util.Scanner;

public class Ejer4 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("¿Escribe tu nombre completo?");
		String nombre = entrada.nextLine();

		System.out.println("Nombre: " + nombre);
		System.out.println("Escribe tus tres notas de cada evaluación");

		int n1 = entrada.nextInt();
		int n2 = entrada.nextInt();
		int n3 = entrada.nextInt();

		float sumaNotas = n1 + n2 + n3;

		System.out.println("La media del curso de " + nombre + " es: " + sumaNotas / 3);

	}

}