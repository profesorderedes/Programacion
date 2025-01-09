package ejemplos;

import java.util.Scanner;

public class Ejemplo03 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Nombre: ");
		String tuNombre = entrada.nextLine();

		System.out.println("Apellidos:");
		String apellidos = entrada.nextLine();

		mostrarNombreCompleto(tuNombre, apellidos);
		
		System.out.println("¿Cuántos años tienes?");
		int edad = entrada.nextInt();

		mostrarInformacionCompleta(tuNombre, apellidos, edad);
		
	}

	static void mostrarNombreCompleto(String nombre, String apellidos) {

		System.out.println("Tu nombre completo es " + nombre + " " + apellidos + ".");

	}

	static void mostrarInformacionCompleta(String nombre, String apellidos, int edad) {

		System.out.println("Te llamas " + nombre + " " + apellidos + ", y tienes " + edad + " años.");

	}

}
