package Case;

import Joueur.Joueur;

public class CaseService extends CaseAchetable{
	
	private int prix;
	private int prixHypotheque;
	
	public CaseService(String nom) {
		super(nom, 0, "BLANC", 150);
		this.prixHypotheque = 75;
	}

	public int getPrixHypotheque() {
		return this.prixHypotheque;
	}
	
	public int getLoyerDe() {
		//FX
		return 0;
	}
	
	@Override
	public void jouerAction(Joueur joueur) {
		//FX
	}
}
 