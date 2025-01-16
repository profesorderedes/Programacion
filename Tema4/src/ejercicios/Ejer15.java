package ejercicios;

import java.util.Scanner;

public class Ejer15 {

	public static void main(String[] args) {

		int[] nums = new int[10];

		leer(nums);

		ordenar(nums);

		mostrar(nums);

	}

	static void leer(int[] nums) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime numeros enteros y te lo ordenare:");
		for (int i = 0; i < nums.length; i++) {

			System.out.print("Número " + i + ": ");
			nums[i] = entrada.nextInt();

		}

	}

	static void ordenar(int[] array) {

		int posMin = 0;
		int aux = 0;

		for (int i = 0; i < array.length; i++) {

			posMin = i;

			for (int j = i + 1; j < array.length; j++) {

				if (array[j] < array[posMin]) {
					posMin = j;
				}

			}

			aux = array[i];
			array[i] = array[posMin];
			array[posMin] = aux;

		}

	}

	static void mostrar(int[] array) {

		for (int j = 0; j < array.length; j++) {
			System.out.print(array[j] + " ");
		}

	}

}