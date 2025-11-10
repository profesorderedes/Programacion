package hoja1;

import java.util.Scanner;

public class Ejer09 {

	public static void main(String[] args) {

//        Escribe un programa que lea desde la consola el enunciado de una pregunta y las cuatro posibles
//        respuestas, guardando los cinco valores en un array llamado test. A continuación los mostrará cómo
//        si fuera una pregunta de tipo test. Por ejemplo:
//            
//        ¿Quién creó el Altair 8800, el primer ordenador personal?
//        a) Bill Gates
//        b) Steve Jobs
//        c) Ed Roberts
//        d) Gary Kildall

		Scanner entrada = new Scanner(System.in);

		int i = 0;
		String[] test = new String[5];

		System.out.println("Introduzca la pregunta: ");
		test[0] = entrada.nextLine();

		for (i = 1; i < 5; i++) {

			System.out.println("Opción " + (i) + ": ");
			test[i] = entrada.nextLine();

		}

		System.out.println("Test: ");

		System.out.println(test[0]);
		for (i = 1; i < test.length; i++) {
			System.out.println("   " + test[i]);
		}
	}

}