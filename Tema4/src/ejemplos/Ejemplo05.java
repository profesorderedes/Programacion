package ejemplos;

// Cómo pasar un array como argumento a un método.

public class Ejemplo05 {

	public static void main(String[] args) {
		
		int[] notasPrimeraEval = {10, 8, 9, 6, 7, 9, 10, 9, 5, 8};
		
		int min = minimo(notasPrimeraEval);
		
		System.out.println("El mínimo del array es " + min + ".");
		
	}
	
	static int minimo(int[] notas) {
		
		int posMin = 0;
		
		for (int i = 1; i < notas.length; i++) {
			if(notas[i] < notas[posMin]) {
				posMin = i;
			}
		}
		
		return notas[posMin];
		
	}
}
