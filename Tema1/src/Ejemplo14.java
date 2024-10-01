
public class Ejemplo14 {
	
	public static void main(String[] args) {
		
		final float PI = 3.1416F;
		final float DENSIDAD_MERCURIO = 13.598F;
		final int VELOCIDAD_LUZ = 300_000_000;
		
		final int LONGITUD_TIERRA = 40000;
		
		// .....................................
		
		// PI = 4; Error si intentamos modificar una constante.
		// VELOCIDAD_LUZ = 500; Error
		
		// Podemos hacer operaciones con las constantes igual 
		// que si fueran variables normales.
		
		System.out.println("El doble de pi: " + PI * 2);
		System.out.println("La mitad de la longitud de la tierra son " + 
				LONGITUD_TIERRA / 2 + " km.");
		
	}

}






