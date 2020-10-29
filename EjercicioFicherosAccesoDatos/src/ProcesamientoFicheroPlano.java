import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class ProcesamientoFicheroPlano extends ProcesamientoFichero {
	
	public ArrayList <Libro> leerFichero(String ruta){
		
		try {
			FileReader fr = new FileReader(ruta);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public void guardarFichero(ArrayList<Libro>ArrayLibro) {
		
	}

}
