package ejerciciosMetodos;

import java.util.Scanner;

public class Ejer10 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce el número del mes: ");
		int mes = entrada.nextInt();

		String nombreMes = devolverMes(mes);
		if (nombreMes == null) {
			System.out.println("El número de mes tiene que estar entre 1 y 12.");
		} else {
			System.out.println(nombreMes);
		}

	}

	static String devolverMes(int mes) {

		String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre" };

		if (mes < 1 || mes > 12) {

			return null;

		}

		return meses[mes - 1];

	}

}