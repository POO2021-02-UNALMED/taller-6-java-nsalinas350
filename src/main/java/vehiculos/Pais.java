package vehiculos;

import java.util.ArrayList;

public class Pais {
	
	private String nombre;
	private ArrayList<Vehiculo>listado = new ArrayList<Vehiculo>();
	
	public Pais(String nombre){
		setNombre(nombre);
	}
	
	public String getNombre() {return this.nombre;}
	void setNombre(String nombre) {this.nombre = nombre;}
	
	public ArrayList<Vehiculo> getListado() {return this.listado;}
	
	public static Pais paisMasVendedor(){
		return new Pais("Pais Vendedor");
	}

}
