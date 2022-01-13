package cadenas;

public class Ejemplos {
	
	public static void main(String[] args) {
		
		// Método length.
		
		String frase = "No hay mal que por bien no venga";
		
		System.out.println("La frase \"" + frase 
				+ "\" tiene " + frase.length()
				+ " caracteres.");
		
		// Método charAt.
		
		System.out.println("La primera letra de la frase "
				+ "anterior es " + frase.charAt(0));
		
		// Método replace(char 'caracter_antiguo', char 'caracter_nuevo')
		
		System.out.println("La frase anterior, cambiando "
				+ "las a por i queda:\n" 
				+ frase.replace('a', 'i'));
		
		// Método replace(CharSequence cadena_antigua, CharSequence cadena_nueva)
		
		System.out.println("\nLa frase anterior cambiando "
				+ "\"hay\" por \"haiga\" queda:\n"
				+frase.replace("hay", "haiga"));
		
		// Método indexOf(String textoABuscar)
		
		System.out.println("El texto \"hay\" aparece en la "
				+ "posición " + frase.indexOf("hay"));
		System.out.println("El texto \"hola\" aparece en la "
				+ "posición " + frase.indexOf("hola"));
		
		
		
		
		
		
		
		
		
		
	}

}
