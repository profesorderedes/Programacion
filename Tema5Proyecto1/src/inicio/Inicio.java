package inicio;

import java.util.Scanner;

import geometria.Cilindro;

public class Inicio {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Cilindro c1 = new Cilindro();

		System.out.println("Qué altura tiene el cilindro?");
		c1.setAltura(sc.nextInt());
		System.out.println("\nQué radio tiene el cilindro?");
		c1.setRadio(sc.nextInt());

		System.out.println(
				"\nEl área del primer cilindro es " + c1.getArea() + " \ny el volumen es " + c1.getVolumen() + ".");

		System.out.println("Qué altura tiene el cilintro?");
		int altura = sc.nextInt();
		System.out.println("\nQué radio tiene el cilindro?");
		int radio = sc.nextInt();

		Cilindro c2 = new Cilindro(altura, radio);

		System.out.println(
				"\nEl área del segundo cilintro es " + c2.getArea() + " \ny el volumen es " + c2.getVolumen() + ".");

		System.out.println("\nDatos del segundo cilindro:");
		System.out.println(c2.toString());

	}

}