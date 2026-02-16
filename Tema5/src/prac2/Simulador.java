package prac2;

public class Simulador {

	public static void main(String[] args) {

//		Componente comp1 = new Componente(50, 10);

		Diodo diodo1 = new Diodo(30, 10, 3);
		Condensador cond1 = new Condensador(200, 5, 200);
		Led led1 = new Led(30, 5, 0, "Rojo");

		diodo1.leeDatos();

		System.out.println("Intensidad máxima: " + diodo1.getIntensidadMaxima());
		System.out.println("Longitud: " + diodo1.getLongitud());
		System.out.println("Tensión inversa: " + diodo1.getTensionInversa());

		Componente comp1 = new Diodo(20, 1, 5);

		Diodo diodo2 = new Led(20, 10, 5, "verde");

	}

}
