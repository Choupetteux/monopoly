package Case;

import java.util.ArrayList;

import org.w3c.dom.Node;

public class CasePropriete extends CaseAchetable{
	
	private int nbMaison;
	private int prixMaison;
	private int prixHypotheque;
	private ArrayList<ArrayList<Node>> listeTerrain = this.parser.getArrayTerrains();
	
	public CasePropriete(int id) {
		super(id);
		this.nbMaison = 0;
		for(ArrayList<Node> terrain : parser.getArrayTerrains()){
			for(Node attribut : terrain){
				if(this.ID == Integer.parseInt(this.parser.getNodeAttr("id", attribut))){
					this.prixMaison = Integer.parseInt(this.parser.getNodeAttr("maison", attribut.getParentNode()));
					this.groupeCouleur = this.parser.getNodeAttr("couleur", attribut.getParentNode());
					
				}
			}
		}
	}
	
	public int getLoyer() {
		switch(nbMaison){
			case 0:
				this.parser
		}
	}
	
	public int getNbMaison(){
		return this.nbMaison;
	}
	
	public int getPrixHypotheque(){
		return this.prixHypotheque;
	}
}
