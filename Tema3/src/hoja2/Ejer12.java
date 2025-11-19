package hoja2;

import java.util.Arrays;

public class Ejer12 {
	public static void main(String[] args) {
		
		int[] nAtomico = { 8, 2, 10, 20, 12, 71, 15, 23 };
		
		int posMin = 0;
		int aux = 0;
		
		for (int i = 0; i < nAtomico.length - 1; i++) {
			
			posMin = i;
			for (int j = i + 1; j < nAtomico.length; j++) {
				if (nAtomico[j] < nAtomico[posMin]) {
					posMin = j;
				}
			}
			
			aux = nAtomico[i];
			nAtomico[i] = nAtomico[posMin];
			nAtomico[posMin] = aux;

		}
		
		System.out
				.println("Números atómicos  de la muestra ordenados de menor a mayor:\n>" 
						+ Arrays.toString(nAtomico));
		System.out.println("Número atómico más pequeño: " + nAtomico[0]);
		System.out.println("Número atómico más grande: " + nAtomico[nAtomico.length-1]);
		
	}
}