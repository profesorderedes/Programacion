package hoja1;

public class Ejer05 {

	public static void main(String[] args) {

		System.out.println("NOTAS 1º DAW\n ");

		double notas[] = new double[5];

		notas[0] = 9.5;
		notas[1] = 8.6;
		notas[2] = 5;
		notas[3] = 2.5;
		notas[4] = 7;

		int i = 0;
		while (i < notas.length) {

			System.out.println("Nota " + (i + 1) + ": " + notas[i]);
			i++;
			
		}

	}

}