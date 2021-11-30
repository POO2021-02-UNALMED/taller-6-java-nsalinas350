package vehiculos;

public class Camion extends Vehiculo {
	
	int ejes;
	private static int total;
	
	public Camion(String placa, String nombre, long precio, float peso, Fabricante f, int ejes) {
		super(placa,2, 80, nombre, precio, peso, "4X2", f);
		setEjes(ejes);
		total++;
	}
	
	int getEjes() {return this.ejes;}
	void setEjes(int ejes) {this.ejes = ejes;}
	
	static int getTotal() {
		return Camion.total;
	}

}
