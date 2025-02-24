package miscelanea;

import java.util.Arrays;

public class OrdenarAlfabeticamente {

	public static void main(String[] args) {

		String[] nombres = { "Brayan", "Martin", "Lucas", "Jose Luis", "Oliver" };

//		String palabra1 = "delfín";
//		String palabra2 = "foca";
//		
//		System.out.println(palabra2.compareTo(palabra1));

		// COMPARETO()
		// palabra1 < palabra2 -> negativo
		// palabra1 = palabra2 -> cero
		// en caso contrario -> positivo

		int posMin;
		String aux;

		for (int i = 0; i < nombres.length - 1; i++) {

			posMin = i;
			for (int j = i + 1; j < nombres.length; j++) {
				if (nombres[j].compareTo(nombres[posMin]) < 0) {
					posMin = j;
				}
			}

			aux = nombres[i];
			nombres[i] = nombres[posMin];
			nombres[posMin] = aux;

		}

		System.out.println(Arrays.toString(nombres));

	}

}
