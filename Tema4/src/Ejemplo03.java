import java.util.Scanner;

public class Ejemplo03 {

	public static void main(String[] args) {
		
		// Pedir un número por consola y mostrar su tabla.
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escribe un número y te mostraré su "
				+ "tabla de multiplicar:");
		int numero = entrada.nextInt();
		
		// Al llamar al método, le pasamos el valor que 
		// hay guardado en numero.
		tabla(numero);
		
		// Mostramos si numero ha cambiado.
		System.out.println("numero = " + numero);
		
	}
	
	static void tabla(int num) {
		
		System.out.println("Tabla del " + num);
		System.out.println("-------------------");
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " x " + i + " = " 
					+ num*i);
		}
		
		// Probamos a cambiar el valor de num.
		num = 20;
		
	}
	
}
