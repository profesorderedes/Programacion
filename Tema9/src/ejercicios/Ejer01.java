package ejercicios;

/*
Crea una clase con un método:
	String transforma(int dato)
que transforme un número entero en base diez a binario. 
Utiliza un procedimiento recursivo.
 */
public class Ejer01 {

	public static void main(String[] args) {

		int num = 11;
		System.out.println("El número " + num + " en binario es " + transforma(num));

	}

	public static String transforma(int dato) {

		if (dato < 2) {
			// Caso base
			return "" + dato;

		} else {
			// Caso recursivo
			return transforma(dato / 2) + (dato % 2);
		}
	}
}
