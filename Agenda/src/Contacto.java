
public class Contacto {

	private int id;
	private String apellidos;
	private String nombre;
	private String tel;

	public Contacto(String apellidos, String nombre, String tel) {
		this.apellidos = apellidos;
		this.nombre = nombre;
		this.tel = tel;
	}

	@Override
	public String toString() {

		return String.format("%-3s %-25s %-20s %-10s", id, apellidos, nombre, tel);

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

}
