import java.util.Scanner;

public class Ejemplo05 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Color del semáforo: ");
		String color = entrada.nextLine();

		if (color.equals("verde")) {
			
			System.out.println("Pasa.");
			
		} else if (color.equals("naranja")) {
			
			System.out.println("Para si te da tiempo.");
			
		} else if (color.equals("rojo")){
			
			System.out.println("Para.");
			
		} else {
			System.out.println("No has introducido un color correcto.");
		}
		
		System.out.println("Gracias.");

	}

}
