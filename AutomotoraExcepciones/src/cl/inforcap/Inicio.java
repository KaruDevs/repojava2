package cl.inforcap;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import cl.inforcap.*;

public class Inicio {
	
	static Scanner sc = new Scanner (System.in);
		
	public static void main(String[] args) throws IOException {
	
		ArrayList<String> venta = new ArrayList();		
	
		venta.add("uno");
		venta.add("dos");
		venta.add("tres");
		
		for (int i=0; i <venta.size();i++) {
			if (venta.get(i) != null) {
				System.out.println();
			}
		}
		
	LibroVenta uno = new LibroVenta(null,null);
	uno.crearArchivo("nombreventa.txt");
	uno.escribirArchivo("nombreventa.txt",venta);
	
	Tienda productoUno = new Tienda (null, null,0);
	productoUno.existeStock();	
	
	
	
	
	
		//Y_Y
		/*		
	Vehiculo nuevo = new Vehiculo(null, 0);
		
		System.out.println("Auto creado");
		nuevo.setColor("azul");
		nuevo.setPatente(100);
		System.out.println(nuevo.toString());
		
		
		
	Bus busRojo = new Bus("azul", 0,0,0);
	busRojo.setColor("rojo");
	busRojo.setPatente(12354);
	busRojo.setAsientosOcupados(10);
	busRojo.setCantidadDeAsientos(20);
	
	System.out.println(busRojo.toString()+"\n Asientos disponibles: " 
	+busRojo.asientosDisponibles());
	
	Minibus miniRosa = new Minibus (null,0,0,0,null);
	
	miniRosa.setColor("Rosadito");
	miniRosa.setPatente(145);
	miniRosa.setCantidadDeAsientos(7);
	miniRosa.setAsientosOcupados(5);
	miniRosa.setTipodeViaje("Playita viaje largo");
	miniRosa.asientosDisponibles();
				
	System.out.println(miniRosa.toString()
			+ "\n Color: " +miniRosa.color
			+ "\n Patente: " +miniRosa.patente
			+ "\n Total Asientos: " +miniRosa.cantidadDeAsientos
			+ "\n Asientos Ocupados: " +miniRosa.asientosOcupados
			+ "\n Tipo de Viaje: " +miniRosa.tipodeViaje
			+"\n Asientos disponibles: " +miniRosa.asientosDisponibles()+"\n");

	
	
		//productoUno.getStock();
		
		
	Tienda productoDos = new Tienda (null, null,0);
	Persona personaUno = new Persona (0,null,0);
	
	personaUno.Rut=12457845;
	personaUno.nombre="Pluton";
	
	
	Persona personaDos = new Persona (0,null,0);
	
	
	/*Vendedor vendedor = new Vendedor (0,null,0,null);
	
	vendedor.setRut(12564);
	vendedor.setNombre("Pluton");
	vendedor.setEdad(96);
	vendedor.setDireccion("los aguilejos");*/
	
			
}
}