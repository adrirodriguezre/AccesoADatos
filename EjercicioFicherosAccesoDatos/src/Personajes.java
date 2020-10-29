
public class Personajes {
	
	private String nombre;
	private String genero;
	private String importancia;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getImportancia() {
		return importancia;
	}

	public void setImportancia(String importancia) {
		this.importancia = importancia;
	}

	public Personajes(String nombre, String genero, String importancia) {
		super();
		this.nombre = nombre;
		this.genero = genero;
		this.importancia = importancia;
	}
	

}