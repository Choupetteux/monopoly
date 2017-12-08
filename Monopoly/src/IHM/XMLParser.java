package IHM;

import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class XMLParser {
	
	private Node plateau;
	private Node joueur;
	private Node gare;
	private Node cartes;
	private Node compagnie;
	private NodeList groupes;
	
	public XMLParser(){
		try{
		File xmlFile = new File("./src/IHM/config.xml");
		DocumentBuilderFactory docbuildFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docbuildFactory.newDocumentBuilder();
		Document document = docBuilder.parse(xmlFile);
		
		document.getDocumentElement().normalize();
		NodeList root = document.getChildNodes();
		
		Node jeu = getNode("jeu", root);
		this.plateau = getNode("plateau", jeu.getChildNodes());
		this.joueur = getNode("joueur", jeu.getChildNodes());
		this.gare = getNode("gare", jeu.getChildNodes());
		this.cartes = getNode("cartes", jeu.getChildNodes());
		this.compagnie = getNode("compagnie", jeu.getChildNodes());
		this.groupes = this.plateau.getChildNodes();
		}
		catch(Exception e){
			System.out.println("wtf man " + e);
		}
	}
	
	/**
	 * @return the groupes
	 */
	public NodeList getGroupes() {
		return groupes;
	}

	/**
	 * @return the plateau
	 */
	public Node getPlateau() {
		return plateau;
	}

	/**
	 * @return the joueur
	 */
	public Node getJoueur() {
		return joueur;
	}

	/**
	 * @return the gare
	 */
	public Node getGare() {
		return gare;
	}

	/**
	 * @return the cartes
	 */
	public Node getCartes() {
		return cartes;
	}

	/**
	 * @return the compagnie
	 */
	public Node getCompagnie() {
		return compagnie;
	}

	protected Node getNode(String tagName, NodeList nodes) {
	    for ( int x = 0; x < nodes.getLength(); x++ ) {
	        Node node = nodes.item(x);
	        if (node.getNodeName().equalsIgnoreCase(tagName)) {
	            return node;
	        }
	    }
	 
	    return null;
	}
	 
	protected ArrayList<Node> getNodeArray(String tagName, NodeList nodes) {
		ArrayList<Node> res = new ArrayList<Node>();
	    for ( int x = 0; x < nodes.getLength(); x++ ) {
	        Node node = nodes.item(x);
	        if (node.getNodeName().equalsIgnoreCase(tagName)) {
	            res.add(node);
	        }
	    }
	 
	    return res;
	}
	
	protected String getNodeValue( Node node ) {
	    NodeList childNodes = node.getChildNodes();
	    for (int x = 0; x < childNodes.getLength(); x++ ) {
	        Node data = childNodes.item(x);
	        if ( data.getNodeType() == Node.TEXT_NODE )
	            return data.getNodeValue();
	    }
	    return "";
	}
	 
	protected String getNodeValue(String tagName, NodeList nodes ) {
	    for ( int x = 0; x < nodes.getLength(); x++ ) {
	        Node node = nodes.item(x);
	        if (node.getNodeName().equalsIgnoreCase(tagName)) {
	            NodeList childNodes = node.getChildNodes();
	            for (int y = 0; y < childNodes.getLength(); y++ ) {
	                Node data = childNodes.item(y);
	                if ( data.getNodeType() == Node.TEXT_NODE )
	                    return data.getNodeValue();
	            }
	        }
	    }
	    return "";
	}
	 
	protected String getNodeAttr(String attrName, Node node ) {
	    NamedNodeMap attrs = node.getAttributes();
	    for (int y = 0; y < attrs.getLength(); y++ ) {
	        Node attr = attrs.item(y);
	        if (attr.getNodeName().equalsIgnoreCase(attrName)) {
	            return attr.getNodeValue();
	        }
	    }
	    return "";
	}
	 
	protected String getNodeAttr(String tagName, String attrName, NodeList nodes ) {
	    for ( int x = 0; x < nodes.getLength(); x++ ) {
	        Node node = nodes.item(x);
	        if (node.getNodeName().equalsIgnoreCase(tagName)) {
	            NodeList childNodes = node.getChildNodes();
	            for (int y = 0; y < childNodes.getLength(); y++ ) {
	                Node data = childNodes.item(y);
	                if ( data.getNodeType() == Node.ATTRIBUTE_NODE ) {
	                    if ( data.getNodeName().equalsIgnoreCase(attrName) )
	                        return data.getNodeValue();
	                }
	            }
	        }
	    }
	 
	    return "";
	}
}
