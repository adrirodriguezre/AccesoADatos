import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class EjercicioCopiarFich {

	public static void main(String[] args) throws IOException {
		String path="C:\\Users\\PC33\\Desktop\\EjercicioCopiaFicheros";
		
		File f1 = new File("C:\\Users\\PC33\\Desktop\\EjercicioCopiaFicheros\\Directorio");
		f1.mkdir();
		
		File fichero = new File("C:\\Users\\PC33\\Desktop\\EjercicioCopiaFicheros\\Directorio","fichero.txt");
		try {
			fichero.createNewFile();
		} catch (IOException e) {
	
			e.printStackTrace();
		}
		FileWriter fw;
		try {
			String path1="C:\\Users\\PC33\\Desktop\\EjercicioCopiaFicheros\\Directorio\\fichero.txt";
			fw = new FileWriter(path1);
			fw.write("Hola");
			fw.flush();
			fw.close();
		}
		catch(FileNotFoundException ex){
			System.out.printf("No se encontró el fichero: \n%s");
		}
		
		File fichero2 = new File("C:\\Users\\PC33\\Desktop\\EjercicioCopiaFicheros\\Directorio","fichero2.txt");
		InputStream in = new FileInputStream(fichero);
		OutputStream out = new FileOutputStream(fichero2);
		
		if(fichero.exists()) {
			try {
				byte[] buf = new byte[1024];
				
				while ((in.read(buf)) >0 ) {
					out.write(buf);
				}
				in.close();
				out.close();
			} catch(IOException e){
				
			}
		}
		
	}

}
