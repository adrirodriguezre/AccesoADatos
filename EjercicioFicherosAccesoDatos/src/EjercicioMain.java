import java.io.File;
import java.util.ArrayList;

public class EjercicioMain {

	public static void main(String[] args) {
		
		ProcesamientoFicheroPlano p1= new ProcesamientoFicheroPlano();
		
		//String ruta= "C:\\Users\\PC33\\Desktop\\Personajes.txt";
		String home = System.getProperty("user.home");
		String ruta=(home + File.separator + "Desktop" + File.separator + "libros.txt");
	
		
		ArrayList<Libro> Prueba = new ArrayList();
		
		Prueba=p1.leerFichero(ruta);
		//System.out.println(Prueba);

	}

}
