package hoja2;

public class Ejer13 {

	public static void main(String[] args) {

		double registros[][] = { { 8.5, 1020, 40 }, { 14.2, 1021, 35 }, { 11, 1022, 45 }, { 7, 1023, 50 } };

		System.out.println("Registros meteorológicos");
		System.out.println("=========================\n");

		for (int fila = 0; fila < registros.length; fila++) {

			for (int col = 0; col < registros[0].length; col++) {
				System.out.print(registros[fila][col] + "\t");
			}

			System.out.println();

		}

		// También sería correcto:
//		for (int fila = 0; fila < registros.length; fila++) {
//
//			System.out.println(registros[fila][0] + "\t" + registros[fila][1] 
//					+ "\t" + registros[fila][2]);
//
//		}

	}

}