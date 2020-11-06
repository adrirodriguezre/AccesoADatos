import java.io.File;
import java.util.ArrayList;

public class EjercicioMain {

	public static void main(String[] args) {
		
		ProcesamientoFicheroPlano p1= new ProcesamientoFicheroPlano();
		
		String ruta= "C:\\Users\\PC33\\Desktop\\libros.txt";
		String rutaXML= "C:\\Users\\PC33\\Desktop\\libros.xml";
	
	
		
		ArrayList<Libro> Prueba = new ArrayList();
		
		Prueba=p1.leerFichero(ruta);

	}

}
