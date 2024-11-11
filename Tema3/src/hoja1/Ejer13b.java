package hoja1;

// Versión hecha sin usar Math.pow().

public class Ejer13b {

	public static void main(String[] args) {

		int[] potencias = new int[20];
		int potencia = 1;

		int i = 0;
		while (i < potencias.length) {
			potencias[i] = potencia;
			potencia = potencia * 2;
			i++;
		}

		i = 0;
		while (i < potencias.length) {
			System.out.println(potencias[i]);
			i++;
		}

	}

}