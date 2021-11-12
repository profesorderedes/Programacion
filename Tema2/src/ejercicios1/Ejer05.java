package ejercicios1;

import java.util.Scanner;

public class Ejer05 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("\n1) Francés \n2) Inglés \n3) Alemán \n4) Italiano \nOpcion seleccionada: ");

		int idioma = entrada.nextInt();

		switch (idioma) {
		case 1:
			System.out.println("Bonjour");
			break;
		case 2:
			System.out.println("Good morning");
			break;
		case 3:
			System.out.println("Guten Morgen");
			break;
		case 4:
			System.out.println("Ciao");
			break;

		default:
			System.out.println("Buenos días");
			break;
		}

	}

}