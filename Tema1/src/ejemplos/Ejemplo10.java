package ejemplos;

public class Ejemplo10 {

	public static void main(String[] args) {

		// CONVERSIONES IMPLÍCITAS: Cuando guardamos un valor de tipo más pequeño
		// en una variable de tipo más grande.

		byte edad = 60;
		int edadInt = edad; // Conversión implícita byte -> int

		long cantidad = 90_000_000;
		float cantidadFloat = cantidad; // Conversión implícita long -> float
		double cantidadDouble = cantidadFloat; // Conversión implícita float -> double

		// CONVERSIONES EXPLÍCITAS: Cuando guardamos un valor de tipo más grande
		// en una variable de tipo más pequeño.

		short precio = 100;
		// Sabemos que el nº 100 cabe en un byte y hacemos una conversión explícita
		// (cast) indicando que trate a precio como si fuera de tipo byte.
		byte precioByte = (byte) precio;

		System.out.println("precioByte = " + precioByte);

		// Sabemos que el nº 30000 cabe en un short y hacemos una conversión explícita
		// (cast) indicando que trate a numHabitantes como si fuera de tipo short.
		int numHabitantes = 30_000;
		short numHabitantesShort = (short) numHabitantes;

		System.out.println("numHabitantesShort = " + numHabitantesShort);

	}

}
