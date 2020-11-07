import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class ProcesamientoFicheroXMLDOM extends ProcesamientoFichero{

	@Override
	public ArrayList<Libro> leerFichero(String rutaXML) {
		
		File fichero = new File(rutaXML);
		ArrayList<Libro> arrayLibros = new ArrayList<Libro>();
		ArrayList<Personajes> arrayPersonajes = new ArrayList<Personajes>();
		
		try {
			arrayPersonajes = new ArrayList<Personajes>();
			
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fichero);
			NodeList nList = doc.getElementsByTagName("libro"); //creo una lista que obtenga los elementos de cada libro
			
			for(int cont=0; cont < nList.getLength(); cont++) {	//creo un contador que recorra la lista
				
				Node nNode = nList.item(cont);
				
				if(nNode.getNodeType() == Node.ELEMENT_NODE) {
					
				    Element eElement = (Element) nNode;
				    
				    System.out.println("\nLibro: " + eElement.getElementsByTagName("nombre").item(0).getTextContent());
				    System.out.println("Editorial: " + eElement.getElementsByTagName("editorial").item(0).getTextContent());
				    System.out.println("Autor: " + eElement.getElementsByTagName("autor").item(0).getTextContent());
				    System.out.println("Fecha publicación: " + eElement.getElementsByTagName("fechaPubli").item(0).getTextContent());
				    System.out.println("Género: " + eElement.getElementsByTagName("genero").item(0).getTextContent());
				    System.out.println("Personajes: " + eElement.getElementsByTagName("personajes").item(0).getTextContent());
				    
				    NodeList nListPersonajes = doc.getElementsByTagName("personaje");
				    
				    for (int cont2=0;cont2 < nListPersonajes.getLength(); cont2++) {
				    	
				    	Node nNodePersonajes = nListPersonajes.item(cont2);
				    	
				    	if(nNodePersonajes.getNodeType() == Node.ELEMENT_NODE) {
				    		
				    		Element eElementPersonajes = (Element) nNodePersonajes;
				    		
				    		System.out.println("\nNombre Personaje: " + eElementPersonajes.getElementsByTagName("nombreP").item(0).getTextContent());
				    		System.out.println("Genero Personaje: " + eElementPersonajes.getElementsByTagName("generoPers").item(0).getTextContent());
				    		System.out.println("Importancia: " + eElementPersonajes.getElementsByTagName("importancia").item(0).getTextContent());
				    		
				    		//arrayPersonajes.add(nNodePersonajes);
				    	}
				    	
				    }
				  
				}
			}
		
		
		
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
				return arrayLibros ;
	}

	@Override
	public void guardarFichero(ArrayList<Libro> ArrayLibro) {
				
	}
	
	

}
