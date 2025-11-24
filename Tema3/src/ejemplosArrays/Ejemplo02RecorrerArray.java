package ejemplosArrays;

public class Ejemplo02RecorrerArray {

	public static void main(String[] args) {

		double[] precios = { 12, 102, 20.5, 50, 75 };

		// Recorremos el array mostrando cada precio.

		System.out.println("Tamaño del array: " + precios.length);

		for (int i = 0; i < precios.length; i++) {
			System.out.println(precios[i]);
		}

	}

}
