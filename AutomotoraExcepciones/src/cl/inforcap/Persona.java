package cl.inforcap;

public class Persona {

	public Persona(int rut, String nombre, int edad) {
		super();
		Rut = rut;
		this.nombre = nombre;
		this.edad = edad;
	}
	int Rut;
	String nombre;
	int edad;
	
	
	public int getRut() {
		return Rut;
	}
	public void setRut(int rut) {
		Rut = rut;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Persona [Rut=" + Rut + ", nombre=" + nombre + ", edad=" + edad + "]";
	}
	
}
