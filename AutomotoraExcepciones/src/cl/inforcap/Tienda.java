package cl.inforcap;

import java.util.*;

public class Tienda {
	
  static Scanner sc = new Scanner (System.in);
  
	Vendedor vendedor;
	Vehiculo vehiculo;
	public int stock=0;
	
	public Tienda(Vendedor vendedor, Vehiculo vehiculo, int stock) {
		super();
		this.vendedor = vendedor;
		this.vehiculo = vehiculo;
		this.stock = stock;
	}
	
	public Vendedor getVendedor() {
		return vendedor;
	}
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	@Override
	public String toString() {
		return "Tienda [vendedor=" + vendedor + ", vehiculo=" + vehiculo + "]";
	}


		
	public void existeStock() {
		
		Vendedor vendedor = new Vendedor (12354,"Pluton",96, "los aguilejos");
	
		Vendedor vendedorDos = new Vendedor (12512,"Neptuno",36,"las aguilillas");
		
		Bus busRojo = new Bus("rojo", 12356,20,10);
		
		Minibus miniRosa = new Minibus ("Rosadito",12354,7,5,"Playita viaje largo");
		miniRosa.asientosDisponibles();
	
	
		
		int op = 0;
		int cuantoPaga;
		
		
		do { 
			System.out.println("❀❀❀ Elija vehículo ❀❀❀");
			
		
			
			System.out.println("1. Bus");
			System.out.println("2. Minibus");
			System.out.println("3. Taxi, tarifa 1000 para su tramo");
			System.out.println("4. Salir"+"\n ");
			
			op = sc.nextInt();
			
			switch(op) {
			case 1:
				stock=4;
				System.out.println("Vehiculo: Bus"+"\n La cantidad de stock es:  "
						+ stock +"\n "
						+"Nombre del Vendedor: "+ vendedor.nombre+"\n "
						+"Rut:" + vendedor.Rut+"\n "
						+"Direccion:" + vendedor.direccion+"\n "
						+"Caracteristicas del vehículo:" +"\n "
						+"Color:"+busRojo.color+"\n "
						+"Patente:"+busRojo.patente+"\n "
						+"Disponibilidad de asientos:"+busRojo.asientosDisponibles()
				+"\n ");
				break;
			case 2:
			stock=10;
			System.out.println("Vehiculo: Minibus"+"\n La cantidad de stock es:  "
					+ stock +"\n "
					+"Nombre del Vendedor: "+ vendedorDos.nombre+"\n "
					+"Rut:" + vendedorDos.Rut+"\n "
					+"Direccion:" + vendedorDos.direccion+"\n "
					+"Caracteristicas del vehículo:" +"\n "
					+"Color:"+miniRosa.color+"\n "
					+"Patente:"+miniRosa.patente+"\n "
					+"Disponibilidad de asientos:"+miniRosa.asientosDisponibles()
			+"\n ");
				break;
			case 3:
			System.out.println("Vehiculo: Elegir un taxi, tarifa 1000 para su tramo");
			System.out.println("¿Con cuánto dinero pagará?");
				Taxi otraOpcion = new Taxi (0);
				cuantoPaga = sc.nextInt();
				otraOpcion.setPasajePagado(cuantoPaga);
			otraOpcion.pagarPasaje();
				break;
			case 4:
				salir();
				break;
			default:
				System.out.println("Elija Bus o Minibus, no otra cosa, o salga");
				
			}
		} while (op != 5);
	}
	public static void salir() {
		System.out.println("Usted ha salido bajo su propia responsabilidad"+"\n ");
	
	}
}