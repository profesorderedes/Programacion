package hoja2;

import java.util.Arrays;

// Actividad: ordenar alfabéticamente la tabla por nombre de producto.

public class Ejer26 {

	public static void main(String[] args) {

		String[][] articulos = { { "Tablet Samsung", "120" }, { "Móvil Sony", "115" }, { "Ipad Mini", "290" },
				{ "Móvil HTC", "95" } };

		int posMin;
		String[] aux;

		for (int i = 0; i < articulos.length - 1; i++) {

			// Buscamos el "menor" nombre entre i y el final del array.
			posMin = i;
			for (int j = i + 1; j < articulos.length; j++) {
				if (articulos[j][0].compareTo(articulos[posMin][0]) < 0) {
					posMin = j;
				}
			}

			// Intercambiamos las filas i y posMin.
			aux = articulos[i];
			articulos[i] = articulos[posMin];
			articulos[posMin] = aux;

		}

		System.out.println("La tabla, ordenada por nombre de producto, queda:\n");
		
//		System.out.println(Arrays.deepToString(articulos));
		
		for (int fila = 0; fila < articulos.length; fila++) {
			System.out.println(articulos[fila][0] + "\t" + articulos[fila][1]);
		}

	}

}
