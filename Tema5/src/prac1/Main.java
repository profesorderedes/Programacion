package prac1;

public class Main {

	public static void main(String[] args) {

//		Medio me1 = new Medio();

		Mp3 mp1 = new Mp3();

		Ogg o1 = new Ogg();

		mp1.reproducir();
		o1.reproducir();

		Medio m1 = new Mp3();
		m1.reproducir();
		m1.guardar();

	}

}
