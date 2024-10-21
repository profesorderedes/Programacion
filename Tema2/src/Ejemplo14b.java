import java.util.Scanner;

public class Ejemplo14b {

	public static void main(String[] args) {

		// Programa que va pidiendo contraseñas hasta que el usuario
		// acierte.

		final String CONTRASENYA_BUENA = "java";

		Scanner entrada = new Scanner(System.in);

		// Variable semáforo. Mientras valga true, se ejecutará el bucle.
		// Cuando cambie a false, el bucle terminará.
		boolean incorrecta = true;

		// Nunca se utiliza la condición "incorrecta == true". Se usa
		// "incorrecta", ya que es un valor booleano.
		while (incorrecta) {

			System.out.print("Password: ");
			String password = entrada.nextLine();

			// Comprobamos si la contraseña es correcta. Si lo es, cambiamos
			// el valor del semáforo para que termine el bucle.
			if (password.equals(CONTRASENYA_BUENA)) {
				incorrecta = false;
			}

		}

		System.out.println("Adelante.");

	}
}
