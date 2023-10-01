package vehiculos;

import java.util.ArrayList;
import java.util.List;

public class Automovil extends Vehiculo{
	private int puestos;
	private static List<Automovil> listado = new ArrayList<Automovil>();
	
	public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puesto) {
		super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
		this.puestos = puesto;
		Automovil.listado.add(this);
	}
	
	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
	public int getPuestos() {
		return puestos;
	}
	
	public static int cantAutomovil() {
		return Automovil.listado.size();
	}

}
