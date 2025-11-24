package hoja2;

//Tomar la tabla del ejercicio 13 y ordenarla usado el método de selección.
//Ordenaremos por temperaturas de menor a mayor.

public class Ejer23 {

	public static void main(String[] args) {

		double[][] medidas = { 
				{ 8.5, 1020, 40 }, 
				{ 14.2, 1021, 35 }, 
				{ 11, 1022, 45 }, 
				{ 7, 1023, 50 } 
				};

		for (int i = 0; i < medidas.length - 1; i++) {

			int posMin = i;
			for (int j = i + 1; j < medidas.length; j++) {

				if (medidas[j][0] < medidas[posMin][0]) {
					posMin = j;
				}

			}

			double[] temp = medidas[i];
			medidas[i] = medidas[posMin];
			medidas[posMin] = temp;

		}

		System.out.println("Registros meteorológicos\n========================");

		for (int fila = 0; fila < medidas.length; fila++) {

			for (int col = 0; col < medidas[fila].length; col++) {
				System.out.print(medidas[fila][col] + "\t");
			}

			System.out.println();

		}

	}

}