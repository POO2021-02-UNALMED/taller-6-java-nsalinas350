package vehiculos;

class Automovil extends Vehiculo {
	
	int puestos;
	
	Automovil(String placa, String nombre, long precio, float peso, Fabricante f, int puestos) {
		super(placa,4, 100, nombre, precio, peso, "FWD", f);
		setPuestos(puestos);
	}
	
		int getPuestos() {return this.puestos;}
		void setPuestos(int puestos) {this.puestos = puestos;}
}
