package repaso;

public class Ejer14 {

	public static void main(String[] args) {

		String precios[][] = { 
				{ "Tablet Samsung", "120" }, 
				{ "Móvil Sony", "115" }, 
				{ "Ipad Mini", "290" },
				{ "Móvil HTC", "95" } };

		float total = 0;

		System.out.println("Artículos\n=====================================");

		for (int i = 0; i < precios.length; i++) {

			for (int j = 0; j < precios[i].length; j++) {

				System.out.print(precios[i][j] + "\t");

			}

			System.out.println();

		}

		for (int i = 0; i < precios.length; i++) {

			total = total + Float.parseFloat(precios[i][1]);

		}

		System.out.println("\nTotal: " + total + " €");

	}

}