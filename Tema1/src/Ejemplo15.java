
public class Ejemplo15 {

	public static void main(String[] args) {

		// Conversiones implícitas: se puede guardar un valor
		// de cierto tipo en una variable que sea de un tipo mayor.

		byte numAlumnos = 13;
		short numAlumnos2 = numAlumnos;

		int habitantesPais = 5000000;
		long habitantesPais2 = habitantesPais;

		long habitantesPlaneta = 8_000_000_000L;
		float habitantesPlaneta2 = habitantesPlaneta;

		// Conversiones explícitas: no se puede guardar automáticamente
		// una valor de una variable en una variable de un tipo más pequeño.

		short numeroPuerta = 23;

		// Para almacenar el valor de numeroPuerta en una variable de tipo
		// byte tenemos que pedirle a Java que considere que numeroPuerta
		// es un valor admisible para un byte.
		byte numeroPuerta2 = (byte) numeroPuerta;
		System.out.println(numeroPuerta2);

		// Ejercicio: Poner dos ejemplos de conversiones explícitas y dos de
		// conversiones implícitas.

		byte numSillas = 31;
		short numSillas2 = numSillas;

		int OvejasEnElMundo = 1200000;
		long OvejasEnElMundo2 = OvejasEnElMundo;

		short melocotones = 125;
		byte melocotones2 = (byte) melocotones;

		long estrellas = 4000000;
		int estrellas2 = (int) estrellas;

	}

}
