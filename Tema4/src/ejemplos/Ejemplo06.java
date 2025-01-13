package ejemplos;

// Paso de parámetros por valor.
public class Ejemplo06 {

	public static void main(String[] args) {

		int num = 15;

		System.out.println("El doble de " + num + " es " + doble(num) + ".");
		System.out.println("num = " + num);

	}

	// num se pasa por valor: aunque cambie dentro del método, no cambia fuera.
	// Las variables de tipo primitivo siempre se pasan por valor.
	// Todos los demá tipos (objetos) se pasan por referencia.
	static int doble(int num) {

		int doble = 2 * num;
		num = 1000;
		return doble;

	}

}
