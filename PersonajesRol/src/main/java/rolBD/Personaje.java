package rolBD;
import java.time.LocalDate;
import java.util.Map;

public class Personaje {

	private String nick;
	private LocalDate inicio;
	private String rol;
	private String avatar;
	private Map<String, Integer> caracteristicas;

	public Personaje(String nick, LocalDate inicio, String rol, String avatar, Map<String, Integer> caracteristicas) {

		this.nick = nick;
		this.inicio = inicio;
		this.rol = rol;
		this.avatar = avatar;
		this.caracteristicas = caracteristicas;

	}

	@Override
	public String toString() {

		return "Personaje [nick=" + nick + ", inicio=" + inicio + ", rol=" + rol + ", avatar=" + avatar
				+ ", caracteristicas=" + caracteristicas + "]";

	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public LocalDate getInicio() {
		return inicio;
	}

	public void setInicio(LocalDate inicio) {
		this.inicio = inicio;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public Map<String, Integer> getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(Map<String, Integer> caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

}