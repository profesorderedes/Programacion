package ejercicios;

public class Ejer03 {

	public static void main(String[] args) {

		int numero = 200;

		String hexadecimal = transforma(numero);

		System.out.println("El número " + numero + " en hexadecimal es: " + hexadecimal);

	}

	public static String transforma(int dato) {

		if (dato < 16) {
			// Caso base
			return aHex(dato);

		} else {
			// Caso recursivo
			return transforma(dato / 16) + aHex(dato % 16);

		}

	}

	public static String aHex(int n) {

		String[] cifras = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F",};
		
		return cifras[n];

	}

}