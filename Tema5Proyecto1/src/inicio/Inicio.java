package inicio;

import geometria.Cilindro;

public class Inicio {

	public static void main(String[] args) {

		Cilindro cilindro1 = new Cilindro(15, 5);

		System.out.println("Área: " + cilindro1.area());
		System.out.println("Volumen: " + cilindro1.volumen());

		System.out.println("Datos del cilindro:\n" 
				+ cilindro1.toString());

		// Cambiar altura y radio
		System.out.println("=============");
		cilindro1.setAltura(30);
		cilindro1.setRadio(40);

		// Mostrar los nuevos valores de área y volumen.
		System.out.println("Area: " + cilindro1.area());
		System.out.println("Volumen " + cilindro1.volumen());
		
		System.out.println("Datos del cilindro:\n" 
				+ cilindro1.toString());

	}
}
