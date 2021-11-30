package vehiculos;

class Camion extends Vehiculo {
	
	int ejes;
	
	Camion(String placa, String nombre, long precio, float peso, Fabricante f, int ejes) {
		super(placa,2, 80, nombre, precio, peso, "4x2", f);
		setEjes(ejes);
	}
	
	int getEjes() {return this.ejes;}
	void setEjes(int ejes) {this.ejes = ejes;}

}
