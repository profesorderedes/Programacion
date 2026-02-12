package prac1;

public class Mp3 extends Musica implements Guardable {

	private int modo;

	@Override
	public boolean guardar() {
		System.out.println("Guardando...");
		return true;
	}

}
