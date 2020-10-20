import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Mascotas {

	public static void main(String[] args) {
	
		File fichero = new File("C:\\Users\\PC33\\Desktop\\mascotas.xml");
	
		try {
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fichero);
			NodeList nList = doc.getElementsByTagName("mascota"); //creo una lista que obtenga los elementos de cada mascota
			
			for(int cont = 0; cont < nList.getLength(); cont++) { //creo un contador que recorra la lista
				
				  Node nNode = nList.item(cont);

				  if(nNode.getNodeType() == Node.ELEMENT_NODE) {
				    Element eElement = (Element) nNode;

				    System.out.println("\nMascota nombre: " + eElement.getAttribute("Nombre"));
				    System.out.println("Tipo: " + eElement.getElementsByTagName("tipo").item(0).getTextContent());
				    System.out.println("Edad: " + eElement.getElementsByTagName("edad").item(0).getTextContent());
				    
				    	if(eElement.getElementsByTagName("genero") == null) {
				    		System.out.println("Género: " + eElement.getElementsByTagName("genero").item(0).getTextContent());
				    
				    	}
				  }
		 
			}	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
