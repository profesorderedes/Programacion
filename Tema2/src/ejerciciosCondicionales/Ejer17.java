package ejerciciosCondicionales;

import java.util.Scanner;

public class Ejer17 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		float num1;
		float num2;
		int operacion;

		System.out.print("Dime el primer número: ");
		num1 = entrada.nextFloat();

		System.out.print("Dime el segundo número: ");
		num2 = entrada.nextFloat();

		System.out.println("\nCALCULADORA \n========================");
		System.out.println("Número 1 \tNúmero 2 \n" + num1 + "\t\t" + num2);
		System.out.println("A continuación elige el número de la operación que desees hacer:");
		System.out.print("1) Suma \n2) Resta \n3) Multiplicación \n4) División \nOpción seleccionado: ");
		operacion = entrada.nextInt();

		switch (operacion) {
		case 1:
			System.out.println("La solución es " + (num1 + num2));
			break;
		case 2:
			System.out.println("La solución es " + (num1 - num2));
			break;
		case 3:
			System.out.println("La solución es " + num1 * num2);
			break;
		case 4:
			System.out.println("La solución es " + num1 / num2 + " y " + num1 % num2 + " de resto");
			break;

		default:
			System.out.println("Opción no valida.");
			break;
		}

	}

}