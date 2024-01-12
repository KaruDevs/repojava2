package cl.inforcap;

public class Cliente extends Persona{

	int edad;

	public Cliente(int rut, String nombre, int edad, int edad2) {
		super(rut, nombre, edad);
		edad = edad2;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Cliente [edad=" + edad + "]";
	}

	
}
