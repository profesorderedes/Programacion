package hoja1;

public class Ejer03 {
	public static void main(String[] args) {
		
		double[] densidades = { 5.427, 5.243, 5.514, 3.933, 1.326, 0.687, 1.270, 1.638, 1.860 };
		
		String[] nombres = { "Mercurio", "Venus", "Tierra", "Marte", "Jupiter", "Saturno", "Urano", "Neptuno",
				"Pluton" };

		for (int i = 0; i < nombres.length; i++) {
			
			System.out.println(nombres[i] + ": " + densidades[i] + "g/cm3");

		}

	}
}
