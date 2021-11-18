package ejercicios3;
import java.util.Scanner;

public class Ejer04 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int random1;
        int random2;
        int resultado;
        int respuesta;
        char continuar = 's';

        while (continuar == 's' || continuar == 'S') {
            random1 = (int) (Math.random() * 100 + 1);
            random2 = (int) (Math.random() * 100 + 1);
            resultado = random1 + random2;

            System.out.print("Veamos si sabes sumar:\n" + random1 + " + " + random2 + " = ");
            respuesta = entrada.nextInt();

            if (respuesta == resultado) {
                System.out.println("Felicidades, sabes sumar.");
            } else {
                System.out.println("Veo que las sumas no son tu punto fuerte.");
            }

            entrada.nextLine();
            System.out.println("¿Quieres continuar?");
            continuar = entrada.nextLine().charAt(0);

        }

    }

}
