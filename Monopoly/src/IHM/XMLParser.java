package IHM;

import java.io.File;
import java.io.InputStream;
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
	private static XMLParser instance = new XMLParser();

	private XMLParser() {
			try {
				InputStream inputStream = XMLParser.class.getResourceAsStream("config.xml");
				DocumentBuilderFactory docbuildFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder docBuilder = docbuildFactory.newDocumentBuilder();
				Document document = docBuilder.parse(inputStream);

				document.getDocumentElement().normalize();
				NodeList root = document.getChildNodes();

				Node jeu = getNode("jeu", root);
				this.plateau = getNode("plateau", jeu.getChildNodes());
				this.joueur = getNode("joueur", jeu.getChildNodes());
				this.gare = getNode("gare", jeu.getChildNodes());
				this.cartes = getNode("cartes", jeu.getChildNodes());
				this.compagnie = getNode("compagnie", jeu.getChildNodes());
				this.groupes = this.plateau.getChildNodes();
				XMLParser.instance = this;
			} catch (Exception e) {
				System.out.println("Erreur : " + e);
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
	
	public static XMLParser getParserInstance(){
		return XMLParser.instance;
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

	public Node getNode(String tagName, NodeList nodes) {
		for (int x = 0; x < nodes.getLength(); x++) {
			Node node = nodes.item(x);
			if (node.getNodeName().equalsIgnoreCase(tagName)) {
				return node;
			}
		}

		return null;
	}

	public ArrayList<Node> getNodeArray(String tagName, NodeList nodes) {
		ArrayList<Node> res = new ArrayList<Node>();
		for (int x = 0; x < nodes.getLength(); x++) {
			Node node = nodes.item(x);
			if (node.getNodeName().equalsIgnoreCase(tagName)) {
				res.add(node);
			}
		}

		return res;
	}

	public String getNodeValue(Node node) {
		NodeList childNodes = node.getChildNodes();
		for (int x = 0; x < childNodes.getLength(); x++) {
			Node data = childNodes.item(x);
			if (data.getNodeType() == Node.TEXT_NODE)
				return data.getNodeValue();
		}
		return "";
	}

	public String getNodeValue(String tagName, NodeList nodes) {
		for (int x = 0; x < nodes.getLength(); x++) {
			Node node = nodes.item(x);
			if (node.getNodeName().equalsIgnoreCase(tagName)) {
				NodeList childNodes = node.getChildNodes();
				for (int y = 0; y < childNodes.getLength(); y++) {
					Node data = childNodes.item(y);
					if (data.getNodeType() == Node.TEXT_NODE)
						return data.getNodeValue();
				}
			}
		}
		return "";
	}

	public String getNodeAttr(String attrName, Node node) {
		NamedNodeMap attrs = node.getAttributes();
		for (int y = 0; y < attrs.getLength(); y++) {
			Node attr = attrs.item(y);
			if (attr.getNodeName().equalsIgnoreCase(attrName)) {
				return attr.getNodeValue();
			}
		}
		return "";
	}

	public String getNodeAttr(String tagName, String attrName, NodeList nodes) {
		for (int x = 0; x < nodes.getLength(); x++) {
			Node node = nodes.item(x);
			if (node.getNodeName().equalsIgnoreCase(tagName)) {
				NodeList childNodes = node.getChildNodes();
				for (int y = 0; y < childNodes.getLength(); y++) {
					Node data = childNodes.item(y);
					if (data.getNodeType() == Node.ATTRIBUTE_NODE) {
						if (data.getNodeName().equalsIgnoreCase(attrName))
							return data.getNodeValue();
					}
				}
			}
		}

		return "";
	}
	
	public ArrayList<ArrayList<Node>> getArrayTerrains(){
		ArrayList<ArrayList<Node>> terrains = new ArrayList<ArrayList<Node>>();
		ArrayList<Node> groups = XMLParser.instance.getNodeArray("groupe", XMLParser.instance.getGroupes());
		for(Node group : groups){
			terrains.add(XMLParser.instance.getNodeArray("terrain", group.getChildNodes()));
		}
		return terrains;
	}
	
	
}
