package ejercicios;

import java.util.Scanner;

public class Ejer04 {

	public static void main(String[] args) {

		final int CONTRASENYA = 1234;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe tu contraseña");
		int entradaContrasenya = entrada.nextInt();

		if (CONTRASENYA == entradaContrasenya) {
			System.out.println("Acceso concedido");
		}

	}

}