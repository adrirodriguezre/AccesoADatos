import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class PersonaMapeo {

	public void guardarPersonas(ArrayList<Persona> listaPersonas) throws FileNotFoundException, IOException {

		ObjectOutputStream escribir = new ObjectOutputStream(
				new FileOutputStream("C:\\Users\\PC33\\Desktop\\EjercicioPersonaMapeo\\PersonaMapeo.txt"));

		for (Persona pe : listaPersonas) {
			escribir.writeObject(pe);
		}
		escribir.close();

	}

	public ArrayList<Persona> obtenerPersonas() {

		ArrayList<Persona> personasFichero = new ArrayList<Persona>();
		
		try {
			ObjectInputStream leer = new ObjectInputStream(new FileInputStream("C:\\Users\\PC33\\Desktop\\EjercicioPersonaMapeo\\PersonaMapeo.txt"));

			for (;;) {

				Object o;

				o = leer.readObject();

				Persona p = (Persona) o;
				personasFichero.add(p);
			}
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} 
		catch (EOFException e) {
			
			e.printStackTrace();
		}
		catch (IOException e) {
			
			e.printStackTrace();
		}
		
		return personasFichero;
	}

}
