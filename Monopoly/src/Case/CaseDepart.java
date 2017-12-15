package Case;

import Joueur.Joueur;

public class CaseDepart extends Case{

	public CaseDepart() {
		super();
		this.ID=0;
	}
	
	public void caseDepart(){
			//FX
	}
	
	@Override
	public void jouerAction(Joueur joueur) {
		joueur.setArgent(joueur.getArgent() + 200);
	}
}
