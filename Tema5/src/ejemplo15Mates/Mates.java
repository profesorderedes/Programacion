package ejemplo15Mates;

public class Mates {

	// Los atributos PI y E son estáticos, lo que significa
	// que se podrán usar poniendo delante el nombre de
	// la clase (por ejemplo, Mates.PI).
	static final double PI = 3.141592;
	static final double E = 2.71828;

	static int num;

	// El método pow() es estático, lo que significa que
	// se podrá usar poniendo delante el nombre de la
	// clase (por ejemplo, Mates.pow(2,5)).
	static int pow(int base, int exponente) {

		int potencia = 1;

		for (int i = 1; i <= exponente; i++) {
			potencia = potencia * base;
		}

		return potencia;

	}

}