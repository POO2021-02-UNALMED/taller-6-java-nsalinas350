package vehiculos;

public class Camioneta extends Vehiculo {
	
	boolean volco;
	private static int total;
	
	public Camioneta(String placa, int puertas, String nombre, long precio, float peso, Fabricante f, boolean volco) {
		super(placa,puertas, 90, nombre, precio, peso, "4x4", f);
		setVolco(volco);
		total++;
	}
	
	boolean isVolco() {return this.volco;}
	void setVolco(boolean volco) {this.volco = volco;}
	
	static int getTotal() {
		return Camioneta.total;
	}
}
