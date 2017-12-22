package Case;

import java.util.Observer;

import Joueur.Joueur;

public class CaseDepart extends Case{

	public CaseDepart(Observer o) {
		super();
		this.ID=0;
		addObserver(o);
	}
	
	public void caseDepart(){
			//FX
	}
	
	@Override
	public void jouerAction(Joueur joueur) {
		joueur.setArgent(joueur.getArgent() + 200);
	}
}
