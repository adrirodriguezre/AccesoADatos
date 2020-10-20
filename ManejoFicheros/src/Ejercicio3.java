import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		PersonaMapeo pm = new PersonaMapeo();
		ArrayList<Persona> personasFichero = new ArrayList<Persona>();
		Persona p1= new Persona("Pedrito", "Sanchez", LocalDate.parse("1970-06-22"));
		Persona p2= new Persona("Mauro", "Morales", LocalDate.parse("1980-04-16"));
		Persona p3= new Persona("Alicia", "Perez", LocalDate.parse("2000-01-05"));
		personasFichero.add(p1);
		personasFichero.add(p2);
		personasFichero.add(p3);
		
		try {
			pm.guardarPersonas(personasFichero);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		//leer
		pm.obtenerPersonas();
	}

}
