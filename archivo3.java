package comando_git;

public class archivo3 {

	private String nombre;
	private String apellido;
	private int edad;
	
	public archivo3() {
		super();
		// TODO Auto-generated constructor stub
	}

	public archivo3(String nombre, String apellido, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	public boolean mayorEdad(int edad) {
		if (edad >= 18) {
			return true;
		}
		return false;
	}
	public int nombreLongitud() {
		return nombre.length();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "archivo3 [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
	}
	
}
