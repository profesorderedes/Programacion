package actividad1;

public class Main {

	public static void main(String[] args) {

//		Medio me1 = new Medio();
		
		Medio m1 = new Mp3("Cruz de navajas", 200, "Mecano",
				"Pop", 3);
		m1.reproducir();
		((Mp3)m1).guardar();
		
		Guardable g1 = new Ogg("Hijo de la Luna",180,
				"Mecano","Pop", 2);

	}

}
