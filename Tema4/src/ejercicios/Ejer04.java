package ejercicios;

import java.util.Arrays;

public class Ejer04 {

	public static void main(String[] args) {

		int array[] = { 10, 20, 5, 12, 3, 2, 1 };

		colocarArray(array);
		
		System.out.println("De nada.");

	}

	static void colocarArray(int array[]) {

		for (int i = 0; i < array.length; i++) {
			int posMin = i;

			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[posMin])
					posMin = j;
			}
			int aux = array[i];
			array[i] = array[posMin];
			array[posMin] = aux;

		}

		System.out.println("Array ordenado:");
		System.out.println(Arrays.toString(array));

	}
}