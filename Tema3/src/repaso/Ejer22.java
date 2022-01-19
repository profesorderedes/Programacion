package repaso;

import java.util.Scanner;

public class Ejer22 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String alumnos[][] = new String[3][4];
		System.out.println("Introducción de notas");
		System.out.println("===========================");
		
		for (int i = 0; i < alumnos.length; i++) {
			System.out.println("Nombre:");
			alumnos[i][0] = entrada.nextLine();
			System.out.println("Exámenes:");
			alumnos[i][1] = entrada.nextLine();
			System.out.println("Trabajos:");
			alumnos[i][2] = entrada.nextLine();
			System.out.println("Actitud:");
			alumnos[i][3] = entrada.nextLine();

		}
		System.out.println("Notas de evaluación");
		System.out.println("=============================");

		for (int i = 0; i < alumnos.length; i++) {
			System.out.println(alumnos[i][0] 
					+ ": " 
					+ (50 * Float.parseFloat(alumnos[i][1])
					+ 40 * Float.parseFloat(alumnos[i][2]) 
					+ 10 * Float.parseFloat(alumnos[i][3])) 
					/ 100);
		}

	}

}