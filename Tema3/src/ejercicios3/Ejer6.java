package ejercicios3;

import java.util.Scanner;

public class Ejer6 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		float salarios[] = new float[10];

		System.out.println("\t\tControl y media de salarios\t\t");
		System.out.println("\t\t===========================\t\t\n");
		System.out.println("Introduce tu salario en €: ");
		for (int i = 0; i < salarios.length; i++) {
			System.out.println("Salario " + (i + 1) + " :");
			salarios[i] = entrada.nextFloat();
		}

		int posMin = 0;
		int posMax = 0;
		float total = 0;
		int salariosAltos = 0;
		for (int i = 0; i < salarios.length; i++) {
			if (salarios[i] < salarios[posMin]) {
				posMin = i;
			}
			if (salarios[i] > salarios[posMax]) {
				posMax = i;
			}
			if (salarios[i] > 1500) {
				salariosAltos++;
			}

			total = total + salarios[i];

		}

		System.out.println("El salario más alto ha sido " + salarios[posMax] + " €. Y el salario más bajo ha sido "
				+ salarios[posMin] + " €.");
		System.out.println("\nLa media es: " + total / salarios.length);
		System.out.println("Hay " + salariosAltos + " empleados cobrando más de 1500 euros.");

	}

}