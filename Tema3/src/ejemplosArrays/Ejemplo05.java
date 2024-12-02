// Algoritmo para obtener el mínimo de un array y la posición donde se encuentra.
package ejemplosArrays;


public class Ejemplo05 {

	public static void main(String[] args) {

		double[] precios = { 10.20, 3.15, 25, 1.55, 8 };

		double min = precios[0];
		int posMin = 0;

		for (int i = 1; i < precios.length; i++) {

			if (precios[i] < min) {
				min = precios[i];
				posMin = i;
			}

		}

		System.out.println("El precio mínimo en el array es " + min + " euros.");
		System.out.println("Y se encuentra en la posición " + posMin + ".");

	}

}
