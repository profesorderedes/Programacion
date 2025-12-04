package repaso;

import java.util.Iterator;

/* Programa que ejecuta las siguientes acciones:
	a) Muestra el array en forma de tabla.
	b) Saca la nota media de las tres evaluaciones de cada alumno.
	c) Indica el alumno con mejor nota en la primera evaluación.
	d) Cuenta cuántos alumnos han suspendido alguna evaluación.
	e) Cuenta cuántas evaluaciones suspendidas hay.
	f) Ordena el array por la nota de la tercera evaluación.
*/
/*
 * Versión haciendo el intercambio de filas en el último apartado celda a celda.
 */
public class Ejer02b {

	public static void main(String[] args) {

		// Estructura del array:
		// id_alumno, nota 1ª eval, nota 2ª eval, nota 3ª eval
		int[][] notas = { 
				{ 1, 9, 7, 8 }, 
				{ 2, 4, 5, 6 }, 
				{ 3, 8, 5, 5 }, 
				{ 4, 10, 9, 10 }, 
				{ 5, 6, 3, 4 },
				{ 6, 6, 5, 9 }, };

		// Muestra el array en forma de tabla.
		System.out.println("ID_ALUMNO\t1ª EVAL\t\t2ª EVAL\t\t3ª EVAL");
		System.out.println("=========\t=======\t\t=======\t\t=======");
		for (int fila = 0; fila < notas.length; fila++) {

			System.out.println(
					notas[fila][0] + "\t\t" + notas[fila][1] + "\t\t" + notas[fila][2] + "\t\t" + notas[fila][3]);

		}

		// Saca la nota media de las tres evaluaciones de cada alumno.
		System.out.println("\nMedia de las tres evaluaciones por alumno:");
		for (int fila = 0; fila < notas.length; fila++) {

			double suma = 0;
			for (int col = 1; col < notas[0].length; col++) {
				suma = suma + notas[fila][col];
			}

			double media = suma / 3;
			media = Math.round(media * 10) / 10.0;

			System.out.println("Alumno " + notas[fila][0] + ": " + media);
		}

		// Indica el alumno con mejor nota en la primera evaluación.
		int posMax = 0;
		for (int fila = 0; fila < notas.length; fila++) {

			if (notas[fila][1] > notas[posMax][1]) {
				posMax = fila;
			}

		}

		System.out.println("\nEl alumno con mejor nota tiene el identificador " + notas[posMax][0] + " (nota = "
				+ notas[posMax][1] + ").");

		// Cuenta cuántos alumnos han suspendido alguna evaluación.
		int alumnosConEvalSuspendida = 0;
		for (int fila = 0; fila < notas.length; fila++) {

			boolean todoAprobado = true;
			for (int col = 1; col < notas[0].length; col++) {
				if (notas[fila][col] < 5) {
					todoAprobado = false;
					System.out.println("Alumno " + notas[fila][0] + " tiene una suspensa.");
					break;
				}
			}

			if (!todoAprobado) {
				alumnosConEvalSuspendida++;
			}

		}

		System.out.println("\nEn total " + alumnosConEvalSuspendida + " alumnos han suspendido alguna evaluación.");

		// Cuenta cuántas evaluaciones suspendidas hay.
		int evalSuspendidas = 0;
		for (int fila = 0; fila < notas.length; fila++) {

			for (int col = 1; col < notas[0].length; col++) {
				if (notas[fila][col] < 5) {
					evalSuspendidas++;
				}
			}

		}

		System.out.println("\nEn total hay " + evalSuspendidas + " evaluaciones suspendidas.");

		// Ordena el array por la nota de la tercera evaluación.
		int posMin;
//		int[] aux;

		for (int i = 0; i < notas.length - 1; i++) {

			// Buscamos en qué fila a partir de la fila i se encuentra la nota de la
			// tercer evaluación más baja.
			posMin = i;
			for (int j = i + 1; j < notas.length; j++) {
				// Si en la fila j hay una nota (de la tercer evaluación) más pequeña que
				// en la fila posMin, actualizamos posMin.
				if (notas[j][3] < notas[posMin][3]) {
					posMin = j;
				}
			}

			// Intercambiamos la fila i con la fila posMin.
			int aux;
			for (int j = 0; j < notas[0].length; j++) {

				aux = notas[i][j];
				notas[i][j] = notas[posMin][j];
				notas[posMin][j] = aux;

			}

//			aux = notas[i];
//			notas[i] = notas[posMin];
//			notas[posMin] = aux;

		}

		System.out.println("ID_ALUMNO\t1ª EVAL\t\t2ª EVAL\t\t3ª EVAL");
		System.out.println("=========\t=======\t\t=======\t\t=======");
		for (int fila = 0; fila < notas.length; fila++) {

			System.out.println(
					notas[fila][0] + "\t\t" + notas[fila][1] + "\t\t" + notas[fila][2] + "\t\t" + notas[fila][3]);

		}

	}

}
