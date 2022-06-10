package ejemplo09Constantes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Pedir al usuario un número de día de la semana y,
		// si es sábado (6) o domingo (7), indicarle que es
		// festivo.

		Scanner entrada = new Scanner(System.in);

		System.out.print("Escribe un día de la semana: ");
		int dia = entrada.nextInt();

		if (dia == DiasSemana.SABADO || dia == DiasSemana.DOMINGO) {

			System.out.println("Es festivo.");

		} else {

			System.out.println("Día normal.");

		}

	}

}
