package ejemplos;

public class Ejemplo14ConvertirANumero {

	public static void main(String[] args) {

		String[][] cuentas = { { "Rodríguez Pérez, Ana", "15000" }, { "Mas López, Luisa", "22000" },
				{ "Martínez Gallardo, Roberto", "18000" }, { "Ramírez Hernández, Manuel", "30000" } };

		// ORDENAR LA TABLA POR SALDOS.

		// aux es una variable donde guardaremos una fila de la tabla.
		String[] aux = new String[2];

		int posMin;

		for (int i = 0; i < cuentas.length - 1; i++) {

			// Fase de búsqueda (buscamos la fila posMin donde esté el menor saldo.

			posMin = i;
			for (int j = i + 1; j < cuentas.length; j++) {

				if (Integer.parseInt(cuentas[j][1]) < Integer.parseInt(cuentas[posMin][1])) {
					posMin = j;
				}
			}

			// Fase de intercambio (intercambiamos la fila posMin y la fila i).
			// cuentas[posMin] <--> cuentas[i]

			aux = cuentas[posMin];
			cuentas[posMin] = cuentas[i];
			cuentas[i] = aux;

		}

		System.out.println("Tabla ordenada:");
		for (int i = 0; i < cuentas.length; i++) {
			System.out.println(cuentas[i][0] + "\t" + cuentas[i][1]);
		}

	}
}
