package actividad1;

public class Ogg extends Musica implements Guardable {

	private int version;
	
	public Ogg() {
		
	}

	@Override
	public boolean guardar() {
		System.out.println("Guardando...");
		return true;
	}

}
