package hoja1;

import java.util.Scanner;

public class Ejer04 {

	public static void main(String[] args) {

// 4.- Crea un array llamado companyeros con 4 posiciones y ve asignando a cada una de ellas el
// nombre de uno de los cuatro compañeros más cercanos a tu sitio. Haz que después se muestren
// todos los valores mediante un bucle for.

		Scanner input = new Scanner(System.in);

		String[] companyeros = new String[4];

		companyeros[0] = "Uriel";
		companyeros[1] = "Rafa";
		companyeros[2] = "Jose Manuel";
		companyeros[3] = "Miguel";

		System.out.println("\nNombres guardados en el array: ");

		for (int i = 0; i < companyeros.length; i++) {

			System.out.println("- " + companyeros[i]);

		}

	}

}