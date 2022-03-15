package actividad2;

public class Simulador {

	public static void main(String[] args) {

//		Componente componente1 = new Componente(0.1,10);
		Condensador condensador1 = new Condensador(0.5, 12, 0.001);
		Diodo diodo1 = new Diodo(0.15, 3, 2);
		Led led1 = new Led(0.2, 5, 2, "Rojo");
	}

}
