
import java.util.Scanner;

public class Ejemplo13 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe un mes del año: ");
		int mes = entrada.nextInt();

		String mensaje;

//		if (mes >= 1 && mes <= 12) {
//			mensaje = "Mes correcto";
//		} else {
//			mensaje = "Mes no válido";	
//		}

		// Operador ternario equivalente al if de arriba.
		mensaje = (mes >= 1 && mes <= 12) ? "Mes correcto" : "Mes no válido";

		System.out.println(mensaje);

	}

}