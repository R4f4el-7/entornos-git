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
	public int apellidoLongitud() {
		return apellido.length();
	}
	public int sumaNomApe() {
		return nombre.length() + apellido.length();
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

	public int edadDuplicado() {
		return edad*2;
	}
	@Override
	public String toString() {
		return "archivo3 [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
	}
	
	public void defuncion() {
		System.out.println("muerto");
	}
	public void volar() {
		System.out.println("vuela");
	}
	public void vivo() {
		System.out.println("vivo");
	}
	public void funcion1(){
		System.out.println("funcion1");
	}
	public void funcion2() {
	    System.out.println("funcion2");
	}
	public void funcion3() {
	    System.out.println("funcion3");
	}
	public void funcion4() {
	    System.out.println("funcion4");
    }
	public void funcion5() {
	    System.out.println("funcion5");
    }
	public void funcion6() {
	    System.out.println("funcion6");
    }
}
