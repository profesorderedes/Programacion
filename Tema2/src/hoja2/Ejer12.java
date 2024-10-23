package hoja2;

public class Ejer12 {

	public static void main(String[] args) {

		int i = 0;
		int suma = 0;

		while (i < 1001) {

			System.out.println(i);

			suma += i;
			i += 5;

		}

		System.out.println("La suma de los múltiplo de 5 hasta el 1000 es " + suma);

	}

}