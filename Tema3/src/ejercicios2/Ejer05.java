package ejercicios2;

public class Ejer05 {

	public static void main(String[] args) {

		double temperaturas[] = { 15, 16.1, 16, 15.4, 15, 14, 
				10.2, 11, 11.5, 10, 10.1, 9.8, 9, 6 };

		// Variables que guardarán la posición del mínimo
		// y el máximo.
		int posMin = 0;
		int posMax = 0;

		for (int i = 1; i < temperaturas.length; i++) {

			if (temperaturas[i] < temperaturas[posMin]) {
				posMin = i;
			}

			if (temperaturas[i] > temperaturas[posMax]) {
				posMax = i;
			}

		}
		
		System.out.println("La temperatura más baja está en "
				+ "la posición " + posMin);
		System.out.println("La temperatura más alta está en"
				+ " la posición " + posMax);

		System.out.println("La temperatura más baja es " 
				+ temperaturas[posMin] + "ºC");
		System.out.println("La temperatura más alta es " 
				+ temperaturas[posMax] + "ºC");

		
		
	}

}
