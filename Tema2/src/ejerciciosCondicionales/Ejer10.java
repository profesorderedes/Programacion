package ejerciciosCondicionales;

import java.util.Scanner;
public class Ejer10 {
/*
 * 10.- Diseña un programa que pida una nota entera entre 0 y 10 y la convierta a la calificación
 * correspondiente (Insuficiente, Suficiente, Bien, Notable y Sobresaliente).
 */
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qué nota tienes?");
		float nota = entrada.nextFloat();
		
		if(nota >= 0 && nota <= 4) {
			System.out.println("Insuficiente");
		}else if(nota == 5) {
			System.out.println("Suficiente");
		}else if(nota ==6) {
			System.out.println("Bien");
		}else if (nota >= 7 && nota <= 8) {
			System.out.println("Notable");
		}else if (nota ==9) {
			System.out.println("Sobresaliente");
		}else if (nota ==10) {
			System.out.println("Matricula de honor");
		}else {
			System.out.println("La nota introducida debe ser entre 1 y 10.");
		}	
	}
		

}