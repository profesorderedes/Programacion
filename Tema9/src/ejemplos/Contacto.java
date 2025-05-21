package ejemplos;

import java.util.Objects;

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

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;

		// A partir de aquí ya podemos dar por supuesto que obj y este
		// objeto son de la misma clase.
		Contacto other = (Contacto) obj;

//		return Objects.equals(apellidos, other.apellidos) && id == other.id && Objects.equals(nombre, other.nombre)
//				&& Objects.equals(tel, other.tel);

		if (apellidos.equals(other.apellidos) && id == other.id && nombre.equals(other.nombre)
				&& tel.equals(other.tel)) {
			return true;
		}

		return false;
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
