package vehiculos;

import java.util.ArrayList;

public class Fabricante {
	
	private String nombre;
	private Pais pais;
	private ArrayList<Vehiculo>listado = new ArrayList<Vehiculo>();
	
	public Fabricante(String nombre, Pais pais){
		setNombre(nombre);
		setPais(pais);
	}
	
	public String getNombre() {return this.nombre;}
	void setNombre(String nombre) {this.nombre = nombre;}
	
	public Pais getPais() {return this.pais;}
	void setPais(Pais pais) {this.pais = pais;}
	
	public ArrayList<Vehiculo> getListado() {return this.listado;}
	
	public static Fabricante fabricaMayorVentas(){
		return new Fabricante("Empresa vendedora",new Pais("Pais Generico"));
	}


}
