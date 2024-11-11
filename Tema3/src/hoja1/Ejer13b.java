package hoja1;

public class Ejer13b {

	public static void main(String[] args) {

		int[] potencias = new int[20];

		int i = 0;
		while (i < potencias.length) {
			potencias[i] = ((int) Math.pow(2, i));
			i++;
		}

		i = 0;
		while (i < potencias.length) {
			System.out.println(potencias[i]);
			i++;
		}

	}

}