import java.io.File;

public abstract class ProcesamientoFichero implements IProcesamientoFichero {
	
	 public boolean existeFichero(String ruta) {
		return true;
		 
	}
	 public boolean borrarFichero(String ruta) {
		
		 boolean x = true;
		 File archivo = new File(ruta);
		 
		 if(archivo.delete()) {
			 
			 x = true;
		 }else {
			 
			 x = false;
		 }
		 
		 return x;
	 }

}
