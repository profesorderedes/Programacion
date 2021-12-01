package ejercicios1;

public class Ejer13 {

	public static void main(String[] args) {

		int potencias[] = new int[20];
		int potencia = 2;

		System.out.println("Calculando potencias de 2...");
		for (int i = 0; i < potencias.length; i++) {

			System.out.println(potencia);
			potencias[i] = potencia;
			potencia = potencia * 2;

		}

		System.out.println("Potencias de 2 guardadas:");

		int i = 0;

		while (i < potencias.length) {
			System.out.println(i + " " + potencias[i]);
			i++;
		}

	}

}
