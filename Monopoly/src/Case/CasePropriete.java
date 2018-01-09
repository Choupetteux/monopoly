package Case;

import java.util.ArrayList;
import java.util.Observer;

import org.w3c.dom.Node;

import Jeu.EventType;
import Joueur.Joueur;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class CasePropriete extends CaseAchetable{
	
	private int nbMaison;
	private int prixMaison;
	private int prixHypotheque;
	private Node nodeLink;
	private ArrayList<ArrayList<Node>> listeTerrain = this.parser.getArrayTerrains();
	private Rectangle squareColor;
	
	public CasePropriete(int id, Observer o) {
		super(id, o);
		this.nbMaison = 0;
		for(ArrayList<Node> terrain : listeTerrain){
			for(Node attribut : terrain){
				if(this.ID == Integer.parseInt(this.parser.getNodeAttr("id", attribut))){
					this.nom = this.parser.getNodeAttr("nom", attribut);
					this.prixMaison = Integer.parseInt(this.parser.getNodeAttr("maison", attribut.getParentNode()));
					this.groupeCouleur = this.parser.getNodeAttr("couleur", attribut.getParentNode());
					this.prixAchat = Integer.parseInt(this.parser.getNodeAttr("prix", attribut));
					this.prixHypotheque = Integer.parseInt(this.parser.getNodeAttr("hyp", attribut));
					this.nom = this.parser.getNodeAttr("nom", attribut);
					this.nodeLink = attribut;
					this.squareColor = new Rectangle(20, 20);
					if(this.groupeCouleur.equals("bleu")){
						this.squareColor.setFill(Color.BLUE);
					}
					else if(this.groupeCouleur.equals("vert")){
						this.squareColor.setFill(Color.GREEN);
					}
					else if(this.groupeCouleur.equals("jaune")){
						this.squareColor.setFill(Color.YELLOW);
					}
					else if(this.groupeCouleur.equals("rouge")){
						this.squareColor.setFill(Color.RED);
					}
					else if(this.groupeCouleur.equals("orange")){
						this.squareColor.setFill(Color.ORANGE);
					}
					else if(this.groupeCouleur.equals("violet")){
						this.squareColor.setFill(Color.PURPLE);
					}
					else if(this.groupeCouleur.equals("azur")){
						this.squareColor.setFill(Color.CYAN);
					}
					else if(this.groupeCouleur.equals("mauve")){
						this.squareColor.setFill(Color.BROWN);
					}
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
	
	public void addMaison(){
		this.nbMaison = nbMaison +1;
	}
	
	public int getPrixHypotheque(){
		return this.prixHypotheque;
	}
	
	public int getPrixMaison(){
		return this.prixMaison;
	}
	
	public Rectangle getSquareColor(){
		return this.squareColor;
	}
	
	@Override
	public void jouerAction(Joueur joueur){
		if(this.getProprietaire() == null){
			if(joueur.getArgent() >= this.prixAchat){
				this.emitEvent(EventType.CASE_PROPRIETE_ACHETABLE);
			}
			else{
				this.emitEvent(EventType.ACHAT_PROPRIETE_REJECT);
			}
		}
		else if(this.proprietaire.equals(joueur)){
				
		}
		else{
			this.emitEvent(EventType.CASE_PROPRIETE);
			joueur.setArgent(joueur.getArgent() - this.getLoyer());
			this.proprietaire.setArgent(this.proprietaire.getArgent() + this.getLoyer());
		}
	}
}
