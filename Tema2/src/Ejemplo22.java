import java.util.Scanner;

// Programa que pida 10 notas. Si el usuario escribe una nota que
// no esté entre 0 y 10, mostrará un mensaje de error y terminará.
public class Ejemplo22 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int nota;

		System.out.println("¡Escribe 10 notas!\n");
		boolean preguntar = true;
		int i = 1;

		while (i <= 10 && preguntar == true) {

			System.out.print("Nota " + i + ": ");
			nota = entrada.nextInt();

			if (nota < 0 || nota > 10) {
				System.out.println("Error en los datos. El programa" + " terminará.");
				preguntar = false;
			}

			i++;

		}

	}

}
