package prac2;

public class Simulador {

	public static void main(String[] args) {

//		Componente comp1 = new Componente(50, 10);

		Diodo diodo1 = new Diodo(30, 10, 3);
		Condensador cond1 = new Condensador(200, 5, 200);
		Led led1 = new Led(30, 5, 0, "Rojo");

	}

}
