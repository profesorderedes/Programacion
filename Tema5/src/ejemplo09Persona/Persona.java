package ejemplo09Persona;

public class Persona {

	// Atributos

	private String nombre;
	private String apellidos;
	private String dni;
	private int edad;
	private double altura;

	// Constructores

	// Constructor implícito (éste existe por defecto, pero se destruye cuando
	// creamos un constructor a mano).
	public Persona() {

	}

	// Constructor explícito.
	public Persona(String nombre, String apellidos, String dni, int edad, double altura) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.edad = edad;
		this.altura = altura;
	}

	public Persona(String nombre, String apellidos, String dni) {
		// Si usamos this como un método, estamos llamando
		// a un constructor.
		this(nombre, apellidos, dni, 0, 0);
	}

	// nombre, edad, altura
	public Persona(String nombre, int edad, double altura) {
		this(nombre, null, null, edad, altura);
	}

	public Persona(String nombre, String apellidos) {
		this(nombre, apellidos, null, 0, 0);
	}

	// Métodos

	public void mostrar() {

		System.out.println("\nNombre: " + nombre);
		System.out.println("Apellidos: " + apellidos);
		System.out.println("DNI: " + dni);
		System.out.println("Edad: " + edad);
		System.out.println("Altura: " + altura);

	}

	// Métodos de acceso

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
}
