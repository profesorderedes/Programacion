package ejerciciosCondicionales;

import java.util.Scanner;

public class Ejer06 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Dime el precio:");
		float precio = entrada.nextFloat();
		System.out.println("Dime las unidades:");
		int num = entrada.nextInt();
		float total = precio * num;
		if (total > 75) {
			total = total - total *15/100;
			System.out.println("Tiene un descuento del 15% " + total);
		} else  {
			total = total - total*5/100;
			System.out.println("Tiene un descuento del 5% " + total);
		
		}
	}
}

