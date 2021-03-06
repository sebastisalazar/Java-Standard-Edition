package app.perrera;

public class Perro {

	// un peroo inicialmente
	// id 0
	// nombre ""
	// raza "cruce"

	int id = 0;
	String nombre = "";
	String raza = "Cruce";

	// Constructor
	public Perro() {
		super();

	}

	public Perro(String nombre) {
		super();
		this.nombre = nombre;
	}

	public Perro(String nombre, int id) {
		this(nombre);
		this.id = id;

	}

	public Perro(String nombre, int id, String raza) {
		this(nombre, id);
		this.raza = raza;
	}

	// GETERS seTTERS

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	// TOSTRING
	@Override
	public String toString() {
		return "ID: " + id + ", Nombre: " + nombre + ", Raza: " + raza;
	}

}
