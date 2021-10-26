package ejerciciosCondicionales;
import java.util.Scanner;
public class Ejer07 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Dime un numero del 1 al 10: ");
		int numero = entrada.nextInt();
		if(numero == 10) {
			System.out.println("¡Enhorabuena acertaste el numero!");	
		}else {
		System.out.println("Oh nooo... ¡Fallaste!");
		
		
	}

}
}