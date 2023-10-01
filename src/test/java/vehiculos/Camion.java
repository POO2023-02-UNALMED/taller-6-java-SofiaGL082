package vehiculos;

import java.util.ArrayList;
import java.util.List;

public class Camion extends Vehiculo{
	private int ejes;
	private static List<Camion> listado = new ArrayList<Camion>();
	
	public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante, int ejes) {
		super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
		this.ejes = ejes;
		Camion.listado.add(this);
	}
	
	public void setEjes(int ejes) {
		this.ejes = ejes;
	}
	public int getEjes() {
		return this.ejes;
	}
	
	public static int cantCamion() {
		return Camion.listado.size();
	}

}
