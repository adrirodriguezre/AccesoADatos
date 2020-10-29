import java.util.ArrayList;

public class EjercicioMain {

	public static void main(String[] args) {
		
		ProcesamientoFicheroPlano p1= new ProcesamientoFicheroPlano();
		
		String ruta= "C:\\Users\\PC33\\Desktop\\Personajes.txt";
		
		ArrayList<Libro> Prueba = new ArrayList();
		
		Prueba=p1.leerFichero(ruta);

	}

}
