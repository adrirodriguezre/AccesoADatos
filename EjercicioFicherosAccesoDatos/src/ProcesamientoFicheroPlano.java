import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class ProcesamientoFicheroPlano extends ProcesamientoFichero {
	
	public ArrayList <Libro> leerFichero(String ruta){
		
		File archivo = new File(ruta);
		ArrayList<Libro> arrayLibros = new ArrayList<Libro>(Arrays.asList());
		//ArrayList<Personajes> arrayPersonajes = new ArrayList<Personajes>();
		
		try {
			
			FileReader fr = new FileReader(archivo);
			BufferedReader contenido = new BufferedReader(fr);	//CREAMOS BUFFER DE LECTURA
			String libro;
			String personajes;
			int x = 0;
			
	        while ((libro=contenido.readLine()) != null) {
	        	
	        	ArrayList<String> arrays = new ArrayList<>(Arrays.asList(libro.split(";")));
	        	
	        	 Libro libro1 = new Libro("Título: ","Editorial: ","Autor: ","FechaPubli: ","Género: ", null);
	             libro1.setTitulo(arrays.get(0));
	             libro1.setEditorial(arrays.get(1));
	             libro1.setAutor(arrays.get(2));
	             libro1.setFechaPubli(arrays.get(3));
	             libro1.setGenero(arrays.get(4));
	             
	             arrayLibros.add(libro1);              
	             
	        }
	        
	        for(Libro array: arrayLibros) {
	        	System.out.println(array.toString());
	        }
	        
	        contenido.close();
			
			

			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return arrayLibros;
	}
	
	public void guardarFichero(ArrayList<Libro>ArrayLibro) {
		
	}

}
