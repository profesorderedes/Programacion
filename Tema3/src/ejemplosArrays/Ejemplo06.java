// Variación del ejemplo anterior donde vemos que nos basta con
// la variable posMin para sacar el mínimo.
package ejemplosArrays;

public class Ejemplo06 {

	public static void main(String[] args) {

		double[] precios = { 10.20, 3.15, 25, 1.55, 8 };

		int posMin = 0;

		for (int i = 1; i < precios.length; i++) {

			if (precios[i] < precios[posMin]) {
				posMin = i;
			}

		}

		System.out.println("El precio mínimo en el array es " + precios[posMin] + " euros.");
		System.out.println("Y se encuentra en la posición " + posMin + ".");

	}

}
