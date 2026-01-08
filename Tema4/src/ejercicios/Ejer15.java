package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer15 {

	public static void main(String[] args) {

//		int[] numeros = new int[5];
//
//		leerNumeros(numeros);

		int[] numeros = { 10, 5, 8, 1, 4 };
		ordenarNumeros(numeros);

		System.out.println(Arrays.toString(numeros));

	}

	/**
	 * Rellena el array recibido con los números que escriba el usuario en la
	 * terminal.
	 * 
	 * @param nums Array vacío que tenemos que rellenar.
	 */
	static void leerNumeros(int[] nums) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe cinco números:");

		for (int i = 0; i < nums.length; i++) {

			System.out.print("Número " + (i + 1) + ": ");
			nums[i] = entrada.nextInt();

		}

	}

	/**
	 * Ordena el array recibido como parámetro.
	 * 
	 * @param nums Array que tenemos que ordenar.
	 */
	static void ordenarNumeros(int[] nums) {

	}

	/**
	 * Muestra en la terminal el array recibido como parámetro.
	 * 
	 * @param nums Array que tenemos que mostrar en la terminal.
	 */
	static void mostrarNumeros(int[] nums) {

	}

}
