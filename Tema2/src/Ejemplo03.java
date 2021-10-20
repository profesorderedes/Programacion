
// Programa que pregunta una temperatura, 
// y si es menor de 20ºC muestra un mensaje de "Hace fresquito".

import java.util.Scanner;

public class Ejemplo03 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("¿Que temperatura hace?");
		float temperatura = entrada.nextFloat();

		if (temperatura < 20) {
			System.out.println("Hace fresquito");
		}

	}

}