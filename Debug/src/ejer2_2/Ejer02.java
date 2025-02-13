package ejer2_2;

public class Ejer02 {
	public static void main(String[] args) {
		
		String[][] moviles = { { "Apple iPhone 13", "529", "Apple" }, { "Xiaomi Note 13", "113.50", "Qualcomm" },
				{ "Galaxy S24", "939", "Qualcomm" }, { "Apple iPhone 15", "789", "Apple" },
				{ "Motorola g24", "99.20", "Mediatek" } };

		System.out.println("Oferta de móviles");
		System.out.println("=============================================");
		for (int fila = 0; fila < moviles.length; fila++) {

			for (int col = 0; col < moviles[0].length; col++) {
				System.out.print(moviles[fila][col] + "\t");
			}
			System.out.println();
		}
		
		int posMax = 0;
	
		for (int fila = 0; fila < moviles.length; fila++) {
			if (Double.parseDouble(moviles[fila][1]) > Double.parseDouble(moviles[posMax][1])) {
				posMax = fila;
			}
		}

		System.out.println(
				"\nEl móvil más caro es el " + moviles[posMax][0] + ", que vale " + moviles[posMax][1] + " euros.");

		System.out.println("\nLos móviles con procesador Qualcomm son:");
		for (int fila = 0; fila < moviles.length; fila++) {
			if(moviles[fila][2].equals("Qualcomm")) {
				System.out.println("\t* " + moviles[fila][0]);
			}
			
		}
		
		System.out.println("\nTras aumentar 5€ los precios de los móviles, quedan así:");

		for (int fila = 0; fila < moviles.length; fila++) {

			double nuevoPrecio = Double.parseDouble(moviles[fila][1]) + 5;
			moviles[fila][1] = String.valueOf(nuevoPrecio);
			
			for (int col = 0; col < moviles[0].length; col++) {
				System.out.print(moviles[fila][col] + "\t");
			}
			System.out.println();
			
		}
		
		

	}
}
