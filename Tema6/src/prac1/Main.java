package prac1;

public class Main {

	public static void main(String[] args) {

//		Medio me1 = new Medio();

		Medio m1 = new Mp3("Celine", 2.20, "Kidd Keo", "Pop", 1);

		m1.reproducir();

		((Mp3) m1).guardar();

		Guardable g1 = new Ogg("Celine", 2.20, "Kidd Keo", "Pop", 1);

	}

}
