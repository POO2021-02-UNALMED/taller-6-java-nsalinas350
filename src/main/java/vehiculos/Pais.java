package vehiculos;

import java.util.ArrayList;

public class Pais {
	
	private String nombre;
	public int vendidos;
	private static  ArrayList<Pais>paises = new ArrayList<Pais>();
	
	public Pais(String nombre){
		setNombre(nombre);
		Pais.getPaises().add(this);
	}
	
	public String getNombre() {return this.nombre;}
	void setNombre(String nombre) {this.nombre = nombre;}
	
	public int getVendidos() {return this.vendidos;}
	
	public static ArrayList<Pais> getPaises() {return Pais.paises;}
	
	public static Pais paisMasVendedor(){
		return new Pais("Pais Vendedor");
	}

}
