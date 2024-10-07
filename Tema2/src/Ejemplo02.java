import java.util.Scanner;

public class Ejemplo02 {

	public static void main(String[] args) {

// Programa que pregunta cuántos alumnos hay matriculados en una clase.
// Si son 30 o más, dice que no hay plazas libres.

		Scanner entrada = new Scanner(System.in);

		System.out.println("¿Cuántos alumnos hay matriculados?");

		int alumnosMatriculados = entrada.nextInt();

		if (alumnosMatriculados >= 30) {
			System.out.println("No hay plazas disponibles");
		}

	}

}