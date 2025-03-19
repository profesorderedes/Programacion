package ejemplo04Interfaces;

public class Main {

	public static void main(String[] args) {

		// Podemos declarar una variable de tipo interface.
		Mostrable figura;

		// Podemos almacenar dentro de figura cualquier objeto
		// cuya clase implemente Mostrable.
		
		figura = new Cuadrado(5, 5, 10);

		Mostrable figura2 = new Circulo(0, 0, 5);
		
		ensenyar(figura2);
		
	}
	
	public static void ensenyar(Mostrable figura) {
		
		figura.mostrar();
		
	}

}
