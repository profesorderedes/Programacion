package ejercicios;

import java.util.Scanner;

public class Ejer20 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduzca el primer número");
		int n1 = teclado.nextInt();

		System.out.println("Introduzca el segundo número");
		int n2 = teclado.nextInt();

		System.out.println("Introduzca la operación que desea realizar");

		System.out.println("(1) Suma \n(2) Resta \n(3) Multiplicación \n(4) División");
		int calculo = teclado.nextInt();

		switch (calculo) {

		case 1:

			int suma = n1 + n2;
			System.out.println("El resultado es " + suma);

			break;

		case 2:

			int resta = n1 - n2;
			System.out.println("El resultado es " + resta);

			break;

		case 3:

			int multiplicacion = n1 * n2;
			System.out.println("El resultado es " + multiplicacion);

			break;

		case 4:

			if (n2 == 0) {
				System.out.println("No se puede dividir entre 0.");
			} else {
				float division = (float) n1 / n2;
				System.out.println("El resultado es " + division);
			}

			break;

		}

	}

}