package cl.inforcap;

public class Vehiculo {

	
		public String color = "Rojo";
		public int patente=1215;
		
		public Vehiculo (String color, int patente) {
		this.color = color;
		this.patente = patente;
		
		
	}

		public String getColor() {
			return color;
		}



		public void setColor(String color) {
			this.color = color;
		}



		public int getPatente() {
			return patente;
		}



		public void setPatente(int patente) {
			this.patente = patente;
		}

		@Override
		public String toString() {
			return "Vehiculo [color=" + color + ", patente=" + patente + "]";
		}
}

