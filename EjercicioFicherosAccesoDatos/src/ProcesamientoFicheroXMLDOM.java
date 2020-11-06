import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ProcesamientoFicheroXMLDOM extends ProcesamientoFichero {

	@Override
	public ArrayList<Libro> leerFichero(String rutaXML) {
		
		File fichero = new File(rutaXML);
		ArrayList<Libro> arrayLibros = new ArrayList<Libro>();
		
		try {
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fichero);
			NodeList nList = doc.getElementsByTagName("libro");
			
			for(int cont=0;cont < nList.getLength(); cont++) {
				
				Node nNode = nList.item(cont);
				
				if(nNode.getNodeType() == Node.ELEMENT_NODE) {
				    Element eElement = (Element) nNode;
				    
				    System.out.println("\nLibro: " + eElement.getElementsByTagName("nombre"));
				    System.out.println("Editorial: " + eElement.getElementsByTagName("editorial").item(0).getTextContent());
				    System.out.println("Autor: " + eElement.getElementsByTagName("autor").item(0).getTextContent());
				    System.out.println("Fecha publicación: " + eElement.getElementsByTagName("fechaPubli").item(0).getTextContent());
				    System.out.println("Género: " + eElement.getElementsByTagName("genero").item(0).getTextContent());
				  
				}
			}
		
		
		
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public void guardarFichero(ArrayList<Libro> ArrayLibro) {
		// TODO Auto-generated method stub
		
	}

}
