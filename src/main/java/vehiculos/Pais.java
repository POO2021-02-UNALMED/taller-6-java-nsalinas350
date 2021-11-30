package vehiculos;

public class Pais {
	
	private String nombre;
	
	public Pais(String nombre){
		setNombre(nombre);
	}
	
	public String getNombre() {return this.nombre;}
	void setNombre(String nombre) {this.nombre = nombre;}
	
	public static Pais paisMasVendedor(){
		return new Pais("Pais Vendedor");
	}

}
