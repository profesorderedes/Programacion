package ejercicios;

import java.util.Scanner;

public class Ejer10 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime un número y te digo que mes es");
		int numero = entrada.nextInt();

		nombreMes(numero);

	}

	static void nombreMes(int mes) {

		if (mes < 1 || mes > 12) {
			return;
		}

		String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre" };

		System.out.println("El mes " + mes + " es " + meses[mes - 1]);

	}

}
