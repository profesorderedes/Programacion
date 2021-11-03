package ejerciciosCondicionales;

import java.util.Scanner;

public class Ejer22b {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("¿Que dia de la semana es?");
		String dia = entrada.nextLine();

		String cierre;

		cierre = dia.equals("lunes") || dia.equals("martes") 
				|| dia.equals("miercoles") || dia.equals("jueves")
				|| dia.equals("viernes") ? "20:00" : "14:00";

		System.out.println(cierre);

	}

}
