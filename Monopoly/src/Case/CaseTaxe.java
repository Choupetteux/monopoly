package Case;

import Joueur.Joueur;

import java.util.Observer;

import org.w3c.dom.Node;

public class CaseTaxe extends Case{

	private int taxe;
	
	public CaseTaxe(int id, Observer o){
		this.ID = id;
		for(Node taxe : this.parser.getNodeArray("taxe", this.parser.getGroupes())){
			if(this.ID == Integer.parseInt(this.parser.getNodeAttr("id", taxe))){
				this.taxe = Integer.parseInt(this.parser.getNodeAttr("prix", taxe));
				this.nom = this.parser.getNodeAttr("nom", taxe);
			}
		}
		addObserver(o);
	}

	@Override
	public void jouerAction(Joueur joueur) {
		joueur.setArgent((joueur.getArgent() - this.taxe));
	}
}
