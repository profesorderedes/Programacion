package ejercicios;

import java.util.Scanner;

public class Ejer24 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("¿Cuál es tu edad?");
		int edad = entrada.nextInt();

		boolean mayorDeEdad = edad >= 18 ? true : false;

		if(mayorDeEdad == true) {
			System.out.println("Eres mayor de edad.");
		}else {
			System.out.println("Eres menor de edad.");
		}

	}

}