package ejercicios;

import java.util.Scanner;

public class Ejer26 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("¿Día entre semana?");
		String dia = entrada.nextLine();

		dia = dia.toLowerCase();

		String horaCierre = dia.equals("entre semana") ? "20:00" : "14:00";

		System.out.println("El mercado cierra a las " + horaCierre);

	}

}