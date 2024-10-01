
public class Ejemplo08 {

	public static void main(String[] args) {

		// Desbordamiento en variables

		byte edad = 126;
		System.out.println(edad);

		edad = (byte) (edad + 1);
		System.out.println(edad);

		// Al aumentar edad en 1 otra vez, el valor resultante,
		// 128, no cabe en el byte y se produce un desbordamiento,
		// pasando la variable edad a valer -128.
		edad = (byte) (edad + 1);
		System.out.println(edad);

	}

}
