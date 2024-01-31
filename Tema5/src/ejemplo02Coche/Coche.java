package ejemplo02Coche;

import java.util.Scanner;

public class Coche {

	// Propiedades o atributos.
	String matricula;
	String marca;
	String modelo;
	String averia;
	int quilometros;

	// leeDatos() pregunta al usuario los valores de las propiedades y los lee desde
	// la terminal.
	void leeDatos() {

		Scanner entrada = new Scanner(System.in);

		System.out.println("INTRODUCCIÓN DE DATOS DEL COCHE");

		System.out.print("Matrícula: ");
		matricula = entrada.nextLine();

		System.out.print("Marca: ");
		marca = entrada.nextLine();

		System.out.print("Modelo: ");
		modelo = entrada.nextLine();

		System.out.print("Avería: ");
		averia = entrada.nextLine();

		System.out.print("Quilometraje: ");
		quilometros = entrada.nextInt();

	}

	// Muestra todas las propiedades del objeto.
	void mostrar() {

		System.out.println("DATOS DEL COCHE");
		System.out.println("Matrícula: " + matricula + ".");
		System.out.println("Marca: " + marca + ".");
		System.out.println("Modelo: " + modelo + ".");
		System.out.println("Avería: " + averia + ".");
		System.out.println("Quilometraje: " + quilometros + ".");

	}
}
