package miscelanea;

public class RedondearNumeros {
	
	public static void main(String[] args) {
		
		double edadMedia = 40.78286182;
		
		// Podemos elegir el número de decimales con que se muestra 
		// usando printf.
		System.out.printf("Edad media: %.1f\n", edadMedia);
		
		// Podemos redondearlo usando Math.round().
		System.out.println(Math.round(edadMedia));
		
	}

}
