package vehiculos;

import java.util.ArrayList;
import java.util.List;

public class Pais {
	private String nombre;
	private static List<Pais> paisesCreados = new ArrayList<Pais>();
	
	public Pais(String nombre) {
		this.nombre = nombre;
		Pais.paisesCreados.add(this);
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public static Pais paisMasVendedor() {
		//cuenta las ventas de los paises, puede ser con una lista y hacer un for para elegir el que sea mayor
		Pais masVentasPais = null;
		int mayorVentas = 0;
		for (Pais pais: paisesCreados) {
			int cantRepetido = 0;
			for (Pais paisVenta: Vehiculo.getListaVentasP()) {
				if (pais == paisVenta) {
					cantRepetido++;
				}
			}
			if (cantRepetido > mayorVentas) {
				mayorVentas = cantRepetido;
				masVentasPais = pais;
			}
			
		}
		return masVentasPais;
	}

}
