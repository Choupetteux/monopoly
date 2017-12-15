package Case;

import Joueur.Joueur;

public class CaseService extends CaseAchetable{
	
	private int prix;
	
	public CaseService(int id) {
		super(id);
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
 