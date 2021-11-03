package ejerciciosCondicionales;

import java.util.Scanner;

public class Ejer22 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("¿Qué día de la semana es?");
		String dia = entrada.nextLine();

		String cierre;

		cierre = dia.equals("entre semana") ? "20:00" : "14:00";

		System.out.println("La hora de cierre es: " + cierre);

	}

}
