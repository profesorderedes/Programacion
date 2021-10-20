
public class Ejemplo02 {

	public static void main(String[] args) {

		// Ejemplo de desbordamiento.

		byte edad = 126;
		System.out.println(edad);

		edad = (byte) (edad + 1);
		System.out.println(edad);

		edad = (byte) (edad + 1);
		System.out.println(edad);

		edad = (byte) (edad + 1);
		System.out.println(edad);

	}

}
