package vehiculos;

class Fabricante {
	
	private String nombre;
	private Pais pais;
	
	Fabricante(String nombre, Pais pais){
		setNombre(nombre);
		setPais(pais);
	}
	
	String getNombre() {return this.nombre;}
	void setNombre(String nombre) {this.nombre = nombre;}
	
	Pais getPais() {return this.pais;}
	void setPais(Pais pais) {this.pais = pais;}

}
