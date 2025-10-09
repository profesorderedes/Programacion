package hoja1;

import java.util.Scanner;

public class Ejer24 {

	public static void main(String[] args) {

// Escribe un programa que pida la edad del usuario. Si ésta es menor de 18 años, el valor de la
// variable mayorDeEdad será falso. Si no, será verdadero. Al final se mostrará este valor.

		Scanner input = new Scanner(System.in);

		System.out.println("Edad: ");
		int edad = input.nextInt();

		boolean mayorDeEdad;

//		if (edad < 18) {
//			mayorDeEdad = false;
//		} else {
//			mayorDeEdad = true;
//		}

		mayorDeEdad = (edad < 18) ? false : true;

		System.out.println("MAYOR DE EDAD: " + mayorDeEdad);

	}

}