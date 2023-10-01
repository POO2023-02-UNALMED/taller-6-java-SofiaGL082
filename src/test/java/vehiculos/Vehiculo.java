package vehiculos;

import java.util.ArrayList;
import java.util.List;

public class Vehiculo {
	private String placa;
	private int puertas;
	private int velocidadMaxima;
	private String nombre;
	private int precio;
	private int peso;
	private String traccion;
	private Fabricante fabricante;
	private static int CantidadVehiculos = 0;
	private static List<Fabricante> listadoVentasF = new ArrayList<Fabricante>();
	private static List<Pais> listadoVentasP = new ArrayList<Pais>();
	
	public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante) {
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.traccion = traccion;
		this.fabricante = fabricante;
		Vehiculo.CantidadVehiculos++;
		Vehiculo.listadoVentasF.add(fabricante);
		Vehiculo.listadoVentasP.add(fabricante.getPais());
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getPlaca() {
		return this.placa;
	}
	
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	public int getPuertas() {
		return this.puertas;
	}
	
	public void setVelocidadMaxima(int veloMaxima) {
		this.velocidadMaxima = veloMaxima;
	}
	public int getVelocidadMaxima() {
		return this.velocidadMaxima;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return this.nombre;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getPrecio() {
		return this.precio;
	}
	
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public int getPeso() {
		return this.peso;
	}
	
	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}
	public String getTraccion() {
		return this.traccion;
	}
	
	public void setFabricante(Fabricante fabric) {
		this.fabricante = fabric;
	}
	public Fabricante getFabricante() {
		return this.fabricante;
	}
	
	public static void setCantidadVehiculos(int cantVehi) {
		Vehiculo.CantidadVehiculos = cantVehi;
	}
	public static int getCantidadVehiculos() {
		return Vehiculo.CantidadVehiculos;
	}
	
	public static List<Fabricante> getListaVentasF() {
		return Vehiculo.listadoVentasF;
	}
	
	public static List<Pais> getListaVentasP() {
		return Vehiculo.listadoVentasP;
	}
	
	public String vehiculosPortTipo() {
		String mensaje = "Automoviles: " + Automovil.cantAutomovil() + "Camionetas: " + Camioneta.cantCamioneta() + "Camiones: " + Camion.cantCamion();
		return mensaje;
	}

}
