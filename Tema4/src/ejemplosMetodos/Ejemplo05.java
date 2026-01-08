package ejemplosMetodos;

public class Ejemplo05 {

	public static void main(String[] args) {

		int num = 5;

		System.out.println("Valor original: " + num);

		// La variable num se pasará por valor, ya que es de tipo primitivo.
		// Nada de lo que pase en el método doblar() cambiará su valor, que
		// seguirá siendo 5.
		int resultado = doblar(num);

		System.out.println("Valor tras la llamada al método: " + num);

	}

	public static int doblar(int a) {

		a = a * 2;
		return a;

	}

}
