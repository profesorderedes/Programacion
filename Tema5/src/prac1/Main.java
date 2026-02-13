package prac1;

public class Main {

	public static void main(String[] args) {

//		Medio me1 = new Medio();

		Mp3 mp1 = new Mp3("Highway to hell", 240, "AC/DC", "Rock", 2);

		Ogg o1 = new Ogg("Highway to hell", 240, "AC/DC", "Rock", 2);

		mp1.reproducir();
		o1.reproducir();

		Medio m1 = new Mp3("Highway to hell", 240, "AC/DC", "Rock", 2);
		m1.reproducir();
//		m1.guardar();

		((Guardable) m1).guardar();

		Guardable g1 = new Ogg("Highway to hell", 240, "AC/DC", "Rock", 2);

	}

}
