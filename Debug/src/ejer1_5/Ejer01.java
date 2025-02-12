package ejer1_5;

import java.util.Scanner;

public class Ejer01 {
//	Escribe un programa que pida una serie de notas (hasta diez) y las almacene en un array de diez
//	posiciones llamado notas. Si el número de notas es menor de diez, se escribirá -1, para terminar la
//	introducción.
//	A continuación, el programa mostrará la siguiente información:
//	•Notas introducidas (sin mostrar las posiciones vacías del array).
//	•Las notas más baja y más alta.
//	•El número de exámenes aprobados.
//	•La nota media obtenida.

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double notas[] = new double[10];

		System.out.println("Introduce tus notas. Cuando ya no haya mas notas, escribe -1:");

		// Bucle que piede las notas
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Nota " + (i + 1) + ": ");
			notas[i] = sc.nextInt();

			if (notas[i] == -1) {
				break;
			}

		}
		System.out.println();

		int numNotas = 0;
		System.out.println("Notas introducidas:");
		// Bucle que muestra las notas
		for (int i = 0; i < notas.length; i++) {

			if (notas[i] == -1) {
				break;
			}

			numNotas++;
			System.out.print(notas[i] + " ");

		}
		System.out.println();
		int posMin = 0;
		int posMax = 0;
		int numAprobados = 0;
		double notaMedia = 0;

		// bucle que dice cual es la nota mas alta , mas baja y el numero de aprobados.
		for (int i = 0; i < numNotas; i++) {

			// posMin=i;

			notaMedia = notaMedia + notas[i];

			if (notas[i] < notas[posMin]) {
				posMin = i;
			} else if (notas[i] > notas[posMax]) {
				posMax = i;
			}

			if (notas[i] >= 5) {
				numAprobados++;
			}

		}
		notaMedia = notaMedia / numNotas;

		System.out.println(
				"\nLas notas mas baja y mas alta son " + notas[posMin] + " y " + notas[posMax] + " respectivamente.\n");
		System.out.println("Has aprobado " + numAprobados + " examenes.\n");

		System.out.println("Tu nota media ha sido: " + notaMedia);

	}

}
