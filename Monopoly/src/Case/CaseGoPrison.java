package Case;

import Jeu.*;
import Joueur.Joueur;

public class CaseGoPrison extends Case{

	public CaseGoPrison() {
		super();
		this.ID = 30;
	}
	
	@Override
	public void jouerAction(Joueur joueur){
		this.emitEvent(EventType.CASE_GO_PRISON);
	}
}
