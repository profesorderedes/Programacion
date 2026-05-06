package ejemplos;

public class Ejemplo12 {

	public static void main(String[] args) {

		ImpresoraEnteros imp = new ImpresoraEnteros(100);
		imp.imprimir();

		ImpresoraBooleanos imp2 = new ImpresoraBooleanos(true);
		imp2.imprimir();

//		Impresora<String> imp3 = new Impresora<>("DAW");
//		imp3.imprimir();

//		Impresora<Double> imp4 = new Impresora<>(20.0);
//		imp4.imprimir();

		// Esto da error porque 10 no es un String.
		// Impresora<String> imp5 = new Impresora<>(10);

		Impresora<TipoValido> imp6 = new Impresora<>(new TipoValido());

	}

}
