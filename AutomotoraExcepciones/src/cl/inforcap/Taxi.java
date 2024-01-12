package cl.inforcap;

public class Taxi {
	
	int valorPasaje=1000;
	int pasajePagado;
	


	public Taxi(int valorPasaje) {
		super();
		this.valorPasaje = valorPasaje;
	}

	public int getValorPasaje() {
		return valorPasaje;
	}

	public void setValorPasaje(int valorPasaje) {
		this.valorPasaje = valorPasaje;
	}
	
	
	public int getPasajePagado() {
		return pasajePagado;
	}

	public void setPasajePagado(int pasajePagado) {
		this.pasajePagado = pasajePagado;
	}

	@Override
	public String toString() {
		return "Taxi [valorPasaje=" + valorPasaje + ", pasajePagado=" + pasajePagado + "]";
	}
	
	public void pagarPasaje() {
		
		if (pasajePagado >= 1000) {
			System.out.println("Devolver vuelto: "+(pasajePagado-1000));
			}else{
				System.out.println("Devolver el monto: " +pasajePagado);
				System.out.println("Elija otra opción o ponga más dinero");
			}
		
	}
}
