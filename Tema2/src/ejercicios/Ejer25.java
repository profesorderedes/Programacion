package ejercicios;

import java.util.Scanner;

public class Ejer25 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("¿Nombre de usuario?");
		String nomUsuario = entrada.next();

		String usuario = nomUsuario.equals("") ? "Desconocido" : nomUsuario;

		System.out.println("El nombre de usuario es: " + nomUsuario);
	}

}
