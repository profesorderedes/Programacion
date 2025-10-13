package ejemplos;

public class Ejemplo10While {

	public static void main(String[] args) throws InterruptedException {

		// Programa que escribe una cuenta atrás desde 10 hasta 1.

		int contador = 10;
		while (contador >= 1) {
			System.out.println(contador);
			contador--;

			// Si queremos darle un retardo...
			Thread.sleep(1000);

		}

	}

}
