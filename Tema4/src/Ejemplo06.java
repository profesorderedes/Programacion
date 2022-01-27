import java.util.Scanner;

public class Ejemplo06 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("¡Escribe dos números y te " + "los sumaré!");
		System.out.println("Primer número: ");
		float num1 = entrada.nextFloat();

		System.out.println("Segundo número: ");
		float num2 = entrada.nextFloat();

		sumar(num1, num2);

	}

	// Método que recibe dos números decimales
	// y muestra el valor de su suma.
	static void sumar(float numero1, float numero2) {

		System.out.println("La suma vale " + (numero1 + numero2));

	}

}
