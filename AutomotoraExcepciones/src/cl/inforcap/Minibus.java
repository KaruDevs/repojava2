package cl.inforcap;

public class Minibus extends Bus {

	String tipodeViaje;

	
	
	public Minibus(String color, int patente, int cantidadDeAsientos, int asientosOcupados, String tipodeViaje) {
		super(color, patente, cantidadDeAsientos, asientosOcupados);
		this.tipodeViaje = tipodeViaje;
	}

	public String getTipodeViaje() {
		return tipodeViaje;
	}

	public void setTipodeViaje(String tipodeViaje) {
		this.tipodeViaje = tipodeViaje;
	}

	@Override
	public String toString() {
		return "Minibus [tipodeViaje=" + tipodeViaje + "]";
	}
	
	
	public Object imprimeBus() {
		
		System.out.println("Minibus: /n");
		
		Minibus minibusRosado = new Minibus("rosa",0,0,0,null);

		minibusRosado.setColor(color);
		minibusRosado.setPatente(patente);
		minibusRosado.setCantidadDeAsientos(cantidadDeAsientos);
		minibusRosado.setAsientosOcupados(asientosOcupados);
		minibusRosado.setTipodeViaje(tipodeViaje);
		minibusRosado.asientosDisponibles();
		System.out.println(minibusRosado.toString());
		return minibusRosado;
	}
}
