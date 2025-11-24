package ejemplosArrays;

public class Ejemplo11ConvertirANumero {

	public static void main(String[] args) {

		// Disponemos de métodos que toman como argumento un string y lo devuelve en
		// formato numérico.
		// Integer.parseInt(cadena) --> Nos devuelve la cadena como entero.
		// Float.parseFloat(cadena) --> Nos devuelve la cadena como float.
		// Double.parseDouble(cadena) --> Nos devuelve la cadena como double.

		String num1 = "5", num2 = "20";

		int suma = Integer.parseInt(num1) + Integer.parseInt(num2);
		System.out.println("Suma = " + suma);

		String num3 = "20.5", num4 = "37.2";

		double producto = Double.parseDouble(num3) * Double.parseDouble(num4);
		System.out.println("Producto = " + producto);

	}

}
