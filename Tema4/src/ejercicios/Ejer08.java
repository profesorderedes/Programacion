package ejercicios;

public class Ejer08 {
	public static void main(String[] args) {

		System.out.println("Máximo: " + intMax(10, 5));

		System.out.println("Mínimo: " + intMin(10, 5));

	}

	static int intMax(int num1, int num2) {

		if (num1 > num2) {
			return num1;
		} 
		
		return num2;

	}

	static int intMin(int num1, int num2) {

		if (num1 < num2) {
			return num1;
		} else {
			return num2;
		}

	}

}