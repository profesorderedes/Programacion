package hoja2;

public class Ejer08 {

	public static void main(String[] args) {

		int[] temp = { 45, 40, 40, 40, 37, 35, 39, 39, 45, 50, 55, 60, 65, 70, 70, 75, 75, 72, 65, 60, 55, 50, 50, 45 };

		int posMin = 0;
		int posMax = 0;

		for (int i = 1; i < temp.length; i++) {

			if (temp[i] < temp[posMin]) {
				posMin = i;
			} else if (temp[i] > temp[posMax]) {
				posMax = i;
			}

		}

		System.out.println("La humedad mínima ha sido de " + temp[posMin] + ".");
		System.out.println("Ocurrió a las " + posMin + " horas.");

		System.out.println("La humedad máxima ha sido de " + temp[posMax] + ".");
		System.out.println("Ocurrió a las " + posMax + " horas.");

	}

}