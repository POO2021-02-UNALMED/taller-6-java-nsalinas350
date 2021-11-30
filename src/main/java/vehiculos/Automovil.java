package vehiculos;

public class Automovil extends Vehiculo {
	
	int puestos;
	private static int total;
	
	public Automovil(String placa, String nombre, long precio, float peso, Fabricante f, int puestos) {
		super(placa,4, 100, nombre, precio, peso, "FWD", f);
		setPuestos(puestos);
		total++;
	}
	
		int getPuestos() {return this.puestos;}
		void setPuestos(int puestos) {this.puestos = puestos;}
		
		static int getTotal() {
			return Automovil.total;
		}
}
