package ejerciciosCondicionales;

import java.util.Scanner;

public class Actividad15 {

	public static void main(String[] args) {
		// Crea un programa que pida un número de mes entre 1 y 12. A continuación
		// devolverá el
		// número de días de ese mes. Supón que no existen años bisiestos.

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce un número del 1 al 12 \ny recibirás el número de días del mes correspondiente.");
		int numeroMes = entrada.nextInt();

		switch (numeroMes) {

		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31 días.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30 días.");
			break;
		case 2:
			System.out.println("28 días.");
			break;
		default:
			System.out.println("El número introducido debe estar entre 1 y 12.");
		}
	}

}