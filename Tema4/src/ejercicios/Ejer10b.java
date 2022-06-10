package ejercicios;

import java.util.Scanner;

public class Ejer10b {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe en números un mes: ");
		int mes = entrada.nextInt();

		meses(mes);

		System.out.println("Gracias.");

	}

	static void meses(int mes) {

		if (mes < 1 || mes > 12) {
			return;
		}

		String nombresMes[] = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre" };

		System.out.println(nombresMes[mes - 1]);

	}

}
