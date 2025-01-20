package ejemplo07Circulo;

import java.util.Scanner;

public class Circulo {

	int x;
	int y;
	int radio;
	
	Circulo(...){
		
	}

	void mostrar() {

		System.out.println("Atributo x: " + x);
		System.out.println("Atributo y: " + y);
		System.out.println("Atributo radio: " + radio);

	}

	double area() {
		double area;
		area = Math.PI * radio * radio;

		return area;
	}

	double perimetro() {

		double perimetro = 2 * Math.PI * radio;

		return perimetro;

	}

	void leerPropiedades() {
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduzca las propiedades del círculo:");
		System.out.print("Coordenada x del centro: ");
		x = entrada.nextInt();

		System.out.print("Coordenada y del centro: ");
		y = entrada.nextInt();

		System.out.print("Radio del círculo: ");
		radio = entrada.nextInt();

	}

}
