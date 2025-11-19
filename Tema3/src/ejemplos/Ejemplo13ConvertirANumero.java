package ejemplos;

public class Ejemplo13ConvertirANumero {

	public static void main(String[] args) {

		String[][] cuentas = { { "Rodríguez Pérez, Ana", "15000" }, { "Mas López, Luisa", "22000" },
				{ "Martínez Gallardo, Roberto", "18000" }, { "Ramírez Hernández, Manuel", "30000" } };

		// SALDO MÍNIMO DE LA TABLA

		int posMin = 0, posMax = 0;

		for (int fila = 1; fila < cuentas.length; fila++) {

			if (Integer.parseInt(cuentas[fila][1]) < Integer.parseInt(cuentas[posMin][1])) {
				posMin = fila;
			} else if (Integer.parseInt(cuentas[fila][1]) > Integer.parseInt(cuentas[posMax][1])) {
				posMax = fila;
			}

		}

		System.out.println("Mínimo: " + cuentas[posMin][1]);
		System.out.println("Máximo: " + cuentas[posMax][1]);

	}
}
