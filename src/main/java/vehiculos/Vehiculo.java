package vehiculos;

public class Vehiculo {
	
	String placa;
	int puertas;
	int velocidadMaxima;
	String nombre;
	long precio;
	float peso;
	String traccion;
	Fabricante fabricante;
	
	static private int cantidadVehiculos;
	
	public Vehiculo(){
		cantidadVehiculos++;
	}
	
	public Vehiculo(String placa, int puertas, int vel, String nombre, long precio, float peso, String traccion, Fabricante f) {
		setPlaca(placa);
		setPuertas(puertas);
		setVelocidadMaxima(vel);
		setNombre(nombre);
		setPrecio(precio);
		setPeso(peso);
		setTraccion(traccion);
		setFabricante(f);
		cantidadVehiculos++;
	}
	
	int getCantidadVehiculos() {return Vehiculo.cantidadVehiculos;}
	
	String getPlaca() {return this.placa;}
	void setPlaca(String placa) {this.placa = placa;}
	
	
	int getPuertas() {return this.puertas;}
	void setPuertas(int puertas) {this.puertas = puertas;}
	
	int getVelocidadMaxima() {return this.velocidadMaxima;}
	void setVelocidadMaxima(int v) {this.velocidadMaxima = v;}
	
	String getNombre() {return this.nombre;}
	void setNombre(String nombre) {this.nombre = nombre;}
	
	long getPrecio() {return this.precio;}
	void setPrecio(long precio) {this.precio = precio;}
	
	float getPeso() {return this.peso;}
	void setPeso(float peso) {this.peso = peso;}
	
	String getTraccion() {return this.traccion;}
	void setTraccion(String traccion) {this.traccion = traccion;}
	
	Fabricante getFabricante() {return this.fabricante;}
	void setFabricante(Fabricante f) {this.fabricante = f;}
	
	
	String VehiculosPorTipo(){
		return "Automoviles: "+Automovil.getTotal()+
				"\nCamionetas: "+Camioneta.getTotal()+
				"\nCamiones: "+Camion.getTotal();
	}
	
}
