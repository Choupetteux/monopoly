package Case;

import java.util.Observer;

import Joueur.Joueur;

public class CaseService extends CaseAchetable{
	
	private int prix;
	
	public CaseService(int id, Observer o) {
		super(id, o);
		this.prix = Integer.parseInt(this.parser.getNodeAttr("prix", this.parser.getCompagnie()));
		this.prixHypotheque = Integer.parseInt(this.parser.getNodeAttr("prix", this.parser.getCompagnie()));
	}

	public int getPrixHypotheque() {
		return this.prixHypotheque;
	}
	
	public int getLoyerDe() {
		return 0;
	}
	
	@Override
	public void jouerAction(Joueur joueur) {
		//FX
	}
}
 