
public class Ejemplo13 {
	
	public static void main(String[] args) {
		
		// Prioridad en las operaciones.
		
		boolean operacionRara1 = 3 * 7 < 9 * 8;
		System.out.println(operacionRara1);
		
		boolean operacionRara2 = 7 > 3 && 4 < 10 * 0.2;
		// 7 > 3 && 4 < 2
		// true && false
		// false
		System.out.println(operacionRara2);
		
		// Ante la duda, no hay problema en que pongamos paréntesis
		// para dejar claro el orden de ejecución. Aunque estos
		// no sean necesarios.
		boolean operacionRara3 = (7 > 3) && (4 < (10 * 0.2));
		
	}

}






