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
		ArrayList<Personajes> arrayPersonajes = new ArrayList<Personajes>();
		
		try {
			
			FileReader fr = new FileReader(archivo);			//LLAMAMOS AL ARCHIVO PARA LEERLO
			BufferedReader contenido = new BufferedReader(fr);	//CREAMOS BUFFER DE LECTURA
			String libro;
			
			
	        while ((libro=contenido.readLine()) != null) {	//LEEMOS EL CONTENIDO 
	        	arrayPersonajes = new ArrayList<Personajes>();
	        	ArrayList<String> arrays = new ArrayList<>(Arrays.asList(libro.split(";"))); //SEPARA LA LISTA CUANDO ENCUENTRA " ; "
	        	
	        	 Libro libro1 = new Libro("Título: ","Editorial: ","Autor: ","FechaPubli: ","Género: ", arrayPersonajes); //CREAMOS UN OBJETO LIBRO
	             libro1.setTitulo(arrays.get(0));
	             libro1.setEditorial(arrays.get(1));
	             libro1.setAutor(arrays.get(2));
	             libro1.setFechaPubli(arrays.get(3));
	             libro1.setGenero(arrays.get(4));
	             arrayLibros.add(libro1);
	             
	             
	             String personajes = arrays.get(5);
	             
	             if(personajes != null) { //SI EN LA POSICIÓN 5 EXISTEN DATOS ENTONCES 
	            	 
	            	 ArrayList<String> arrayPers = new ArrayList<>(Arrays.asList(personajes.split("-"))); //SEPARA LA LISTA CUANDO ENCUENTRA " - "
            	 
	            	 for(String strPers:arrayPers) {
	            		 
	            		ArrayList<String> arrayPersSeparado = new ArrayList<>(Arrays.asList(strPers.split(",")));
	            		Personajes p1 = new Personajes(arrayPersSeparado.get(0), arrayPersSeparado.get(1), arrayPersSeparado.get(2));
	            		arrayPersonajes.add(p1);
	            		
//		            Personajes p1 = new Personajes("Nombre personaje: ", "Genero personaje: ", "Importancia: ");
//	            	 p1.setNombre(arrayPers.get(0));
//	            	 p1.setGeneroPers(arrayPers.get(1));
//	            	 p1.setImportancia(arrayPers.get(2));
//	            	 arrayPersonajes.add(p1);
	        
	            	 }
	            	 /*ArrayList<String> arrayPersSeparado = new ArrayList<>(Arrays.asList(personajes.split(",")));
	            	 p1.setNombre(arrayPersSeparado.get(0));
	            	 p1.setGeneroPers(arrayPersSeparado.get(1));
	            	 p1.setImportancia(arrayPersSeparado.get(2));*/
	           
	             }
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
