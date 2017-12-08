package Case;

import Jeu.*;
import Joueur.Joueur;

public class CaseGoPrison extends Case{

	public CaseGoPrison() {
		super();
	}
	
	@Override
	public void jouerAction(Joueur joueur){
		joueur.emitEvent(EventType.CASE_GO_PRISON);
	}
}
