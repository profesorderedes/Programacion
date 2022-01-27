import java.util.Scanner;

public class Ejemplo07 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("¡Escribe dos números y te " + "los sumaré!");
		System.out.println("Primer número: ");
		float num1 = entrada.nextFloat();

		System.out.println("Segundo número: ");
		float num2 = entrada.nextFloat();

		float suma = sumar(num1, num2);
		System.out.println("suma = " + suma);

	}

	// Método que recibe dos números decimales
	// y devuelve el valor de su suma.
	static float sumar(float numero1, float numero2) {

		float resultado = numero1 + numero2;

		return resultado;

	}

}
