package ejercicios;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("¿Qué producto quieres?");
		String producto = entrada.nextLine();

		System.out.println("¿Cuánto cuesta?");
		float precio = entrada.nextFloat();

		System.out.println("¿Cuántos quieres?");
		float cantidad = entrada.nextFloat();

		float calculo = precio * cantidad;

		System.out.println("El coste total es: " + calculo + "€.");

	}

}