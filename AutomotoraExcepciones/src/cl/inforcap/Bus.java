package cl.inforcap;

public class Bus extends Vehiculo{

	public int cantidadDeAsientos;
	public int asientosOcupados;
	public int a;

	public Bus(String color, int patente, int cantidadDeAsientos, int asientosOcupados) {
		super(color, patente);
		this.cantidadDeAsientos = cantidadDeAsientos;
		this.asientosOcupados = asientosOcupados;
	}

	public int getCantidadDeAsientos() {
		return cantidadDeAsientos;
	}

	public void setCantidadDeAsientos(int cantidadDeAsientos) {
		this.cantidadDeAsientos = cantidadDeAsientos;
	}
	

	public int getAsientosOcupados() {
		return asientosOcupados;
	}

	public void setAsientosOcupados(int asientosOcupados) {
		this.asientosOcupados = asientosOcupados;
	}
	
	public int asientosDisponibles() {
		
		int a =cantidadDeAsientos-asientosOcupados;
		
		return a;
	}
	
}
