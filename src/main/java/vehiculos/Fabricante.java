package vehiculos;

import java.util.ArrayList;
import java.util.Collections;

public class Fabricante {
	
	private String nombre;
	private Pais pais;
	public int vendidos;
	private static ArrayList<Fabricante>fabricantes = new ArrayList<Fabricante>();
	
	public Fabricante(String nombre, Pais pais){
		setNombre(nombre);
		setPais(pais);
		Fabricante.getFabricantes().add(this);
	}
	
	public String getNombre() {return this.nombre;}
	void setNombre(String nombre) {this.nombre = nombre;}
	
	public Pais getPais() {return this.pais;}
	void setPais(Pais pais) {this.pais = pais;}
	
	public int getVendidos() {return this.vendidos;}
	
	public static ArrayList<Fabricante> getFabricantes() {return Fabricante.fabricantes;}
	
	public static Object fabricaMayorVentas(){
		ArrayList<Integer> listaVendidos = new ArrayList<Integer>();
		Fabricante maxVendedor = null;
		
		for (Fabricante f: fabricantes) {
			listaVendidos.add(f.getVendidos());
		}
		
		int maximoVendidos = Collections.max(listaVendidos);
		for (Fabricante f: fabricantes) {
			if (f.getVendidos() == maximoVendidos) {
				maxVendedor = f;
			}
		}
		
		return maxVendedor;
	}


}
