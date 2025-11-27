package ejemplosCadenas;

public class Ejemplo05Substring {
	
	public static void main(String[] args) {
		
		String frase = "Matar dos pájaros de un tiro";
		
		System.out.println("Los caracteres desde el 3 hasta el 10 (ambos inclusive) son: " 
				+ frase.substring(0, 5));
		
		System.out.println("Los caracteres desde la posición 5 hasta el final son: " 
				+ frase.substring(5));
		
		
		
		
	}

}
