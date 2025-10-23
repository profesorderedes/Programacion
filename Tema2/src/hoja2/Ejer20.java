package hoja2;

// 20.- Crea un programa que muestre las diez primeras potencias 
// del número 2 (o sea, 2, 4, 8, 16, etc.).

public class Ejer20 {

	public static void main(String[] args) {

		System.out.println("Las diez primeras potencias de 2 son :");
		for (int i = 1; i <= 10; i++) {

			System.out.println(i + ") " + Math.pow(2, i));

		}

	}

}
