import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;

public class CambiarCodificacion {

	public static void main(String[] args) throws IOException {
		
		String path="C:\\Users\\PC33\\Desktop\\EjercicioCambiarCodificacion";
		
		String path1="C:\\Users\\PC33\\Desktop\\EjercicioCambiarCodificacion\\ficheroUTF8.txt";

		File fichero2 = new File("C:\\Users\\PC33\\Desktop\\EjercicioCambiarCodificacion","ficheroANSI.txt");
		
		
		BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(path1),StandardCharsets.UTF_8));
		Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fichero2), StandardCharsets.ISO_8859_1));
		
		
		String cadena;
				
			while((cadena = in.readLine())!=null) {
				out.write(cadena+"\n");
			}
			in.close();
			out.close();
		
	}
}
