package Case;

import java.util.ArrayList;

import org.w3c.dom.Node;

public class CasePropriete extends CaseAchetable{
	
	private int nbMaison;
	private int prixMaison;
	private int prixHypotheque;
	private Node nodeLink;
	private ArrayList<ArrayList<Node>> listeTerrain = this.parser.getArrayTerrains();
	
	public CasePropriete(int id) {
		super(id);
		this.nbMaison = 0;
		for(ArrayList<Node> terrain : listeTerrain){
			for(Node attribut : terrain){
				if(this.ID == Integer.parseInt(this.parser.getNodeAttr("id", attribut))){
					this.prixMaison = Integer.parseInt(this.parser.getNodeAttr("maison", attribut.getParentNode()));
					this.groupeCouleur = this.parser.getNodeAttr("couleur", attribut.getParentNode());
					this.prixAchat = Integer.parseInt(this.parser.getNodeAttr("prix", attribut));
					this.prixHypotheque = Integer.parseInt(this.parser.getNodeAttr("hyp", attribut));
					this.nom = this.parser.getNodeAttr("nom", attribut);
					this.nodeLink = attribut;
				}
			}
		}
	}
	
	public int getLoyer() {
		int res = Integer.parseInt(this.parser.getNodeAttr("t0", nodeLink));
		switch(nbMaison){
			case 1:
				res = Integer.parseInt(this.parser.getNodeAttr("t1", nodeLink));
			case 2:
				res = Integer.parseInt(this.parser.getNodeAttr("t2", nodeLink));
			case 3:
				res = Integer.parseInt(this.parser.getNodeAttr("t3", nodeLink));
			case 4:
				res = Integer.parseInt(this.parser.getNodeAttr("t4", nodeLink));
			case 5:
				res = Integer.parseInt(this.parser.getNodeAttr("t5", nodeLink));
		}
		return res;
	}
	
	public int getNbMaison(){
		return this.nbMaison;
	}
	
	public int getPrixHypotheque(){
		return this.prixHypotheque;
	}
}
