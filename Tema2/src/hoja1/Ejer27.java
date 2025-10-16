package hoja1;

import java.util.Scanner;

public class Ejer27 {

	public static void main(String[] args) {

//        27.- Queremos diseñar un programa que solicite un número al usuario y le responda "Es impar" o
//        "No es impar". Utiliza para ello la notación ? en lugar de if asignando a una variable de tipo String
//        el resultado y mostrando después esta variable.

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduzca un número: ");
		int numero = entrada.nextInt();

		String resultado = numero % 2 == 0 ? "Es par" : "Es impar";

		System.out.println(resultado);
	}

}