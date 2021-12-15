package ejercicios2;

public class Ejer09 {

	public static void main(String[] args) {

		float precios[] = { 43, 58, 44, 62, 80, 15, 15, 10, 90, 56 };
		int posMin;
		float aux;

		for (int i = 0; i < precios.length - 1; i++) {

			// Buscamos el mínimo entre i y el final del array.
			posMin = i;
			for (int j = i + 1; j < precios.length; j++) {
				
				if(precios[j] < precios[posMin]) {
					posMin = j;
				}
				
			}
			
			// Intercambios las posiciones i y posMin.
			aux = precios[posMin];
			precios[posMin] = precios[i];
			precios[i] = aux;

		}

		for (int i = 0; i < precios.length; i++) {
			
			System.out.print(precios[i] + " ");
			
		}
	}

}
