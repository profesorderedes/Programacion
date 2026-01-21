package inicio;

import geometria.Cilindro;
import utilidades.Consola;

public class Inicio {

	public static void main(String[] args) {
		
		System.out.println("Escribe un número del 1 al 5:");
		int num = Consola.leerInt("Tienes que escribir un número entero entre 1 y 5", 1, 5);
		
		Cilindro cil1 = new Cilindro();
		
		cil1.setAltura(5);
		cil1.setRadio(10);
		
		System.out.println("Área: " + cil1.getArea());
		System.out.println("Volumen: " + cil1.getVolumen());
		
		Cilindro cil2 = new Cilindro(2, 5);
		System.out.println("\nArea: " + cil2.getArea());
		System.out.println("Volumen: " + cil2.getVolumen());
	
		System.out.println("\nAtributos de cil2\n" + cil2.toString());

	}

}
