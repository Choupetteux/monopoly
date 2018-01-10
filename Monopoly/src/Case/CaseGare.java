package Case;

import java.util.ArrayList;
import java.util.Observer;

import org.w3c.dom.Node;

import Jeu.EventType;
import Jeu.Jeu;
import Joueur.Joueur;

public class CaseGare extends CaseAchetable{
	
	private Jeu jeu;
	
	public CaseGare(int ID, Observer o, Jeu jeu) {
		super(ID, o);
			for(Node attribut : this.parser.getNodeArray("gare", this.parser.getGroupes())){
				if(this.ID == Integer.parseInt(this.parser.getNodeAttr("id", attribut))){
					this.nom = this.parser.getNodeAttr("nom", attribut);
				}
			}
		this.jeu = jeu;
		this.prixAchat = Integer.parseInt(this.parser.getNodeAttr("prix", this.parser.getGare()));
		this.prixHypotheque = 100;
	}
	
	public int getPrixHypotheque(){
		return this.prixHypotheque;
	}
	
	public int getLoyer(){
		int res = 0;
		if(this.proprietaire != null){
			int caseGare = this.proprietaire.getGares().size();
			switch(caseGare){
				case 1:
					res = Integer.parseInt(this.parser.getNodeAttr("t0", this.parser.getGare()));
					break;
				case 2:
					res = Integer.parseInt(this.parser.getNodeAttr("t1", this.parser.getGare()));
					break;
				case 3:
					res = Integer.parseInt(this.parser.getNodeAttr("t2", this.parser.getGare()));
					break;
				case 4:
					res = Integer.parseInt(this.parser.getNodeAttr("t3", this.parser.getGare()));
					break;
			}
		}
		return res;
		}
	
	@Override
	public void jouerAction(Joueur joueur){
		if(this.getProprietaire() == null){
			if(joueur.getArgent() >= this.prixAchat){
				this.emitEvent(EventType.CASE_GARE_ACHETABLE);
			}
			else{
				this.emitEvent(EventType.ACHAT_PROPRIETE_REJECT);
			}
		}
		else if(this.proprietaire.equals(joueur)){
				
		}
		else{
			this.emitEvent(EventType.CASE_GARE);
			joueur.setArgent(joueur.getArgent() - this.getLoyer());
			this.proprietaire.setArgent(this.proprietaire.getArgent() + this.getLoyer());
		}
	}

}
