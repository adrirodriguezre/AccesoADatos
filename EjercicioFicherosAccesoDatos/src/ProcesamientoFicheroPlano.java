import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ProcesamientoFicheroPlano extends ProcesamientoFichero {
	
	public ArrayList <Libro> leerFichero(String ruta){
		
		File archivo = new File(ruta);
		
		try {
			String linea;
			FileReader fr = new FileReader(archivo);
			BufferedReader br = new BufferedReader(fr);
			
			while((linea=br.readLine())!=null){
				
				//leerFichero.add(linea);
				}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public void guardarFichero(ArrayList<Libro>ArrayLibro) {
		
	}

}
