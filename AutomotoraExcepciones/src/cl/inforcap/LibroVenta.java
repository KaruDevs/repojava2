package cl.inforcap;

import java.io.*;
import java.util.*;

public class LibroVenta {
	
	
	
	String nombreVenta;
	String fechaVenta="01102023";
	
	Cliente clienteUno = new Cliente(12315, "Tracy", 85, 0);
	Vehiculo vehiculoVenta = new Vehiculo ("verde", 4531);
	

	
	
	public LibroVenta(String nombreVenta, String fechaVenta) {
		super();
		this.nombreVenta = nombreVenta;
		this.fechaVenta = fechaVenta;
	}
	public String getNombreVenta() {
		return nombreVenta;
	}
	public void setNombreVenta(String nombreVenta) {
		this.nombreVenta = nombreVenta;
	}
	public String getFechaVenta() {
		return fechaVenta;
	}
	public void setFechaVenta(String fechaVenta) {
		this.fechaVenta = fechaVenta;
	}
	@Override
	public String toString() {
		return "LibroVenta [nombreVenta=" + nombreVenta + ", fechaVenta=" + fechaVenta + "]";
	}
	
	
	
	
	public void crearArchivo(String nombreArchivo){
		File archivo = new File(nombreArchivo);
		
		try {
			PrintWriter salida = new PrintWriter(new FileWriter(archivo));
			salida.close();
			System.out.println("Creacion de archivo");
			
		}catch(IOException ex) {
			ex.printStackTrace(System.out);
		}
	}
	public void escribirArchivo(String nombreArchivo, ArrayList<String> venta) throws IOException{
		File archivo = new File(nombreArchivo);
		
		try {
			PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
			salida.println(venta);
			salida.close();
			System.out.println("Se escribió el archivo");
			
		}catch(FileNotFoundException ex) {
			ex.printStackTrace(System.out);
		}
		
		
	}
}
