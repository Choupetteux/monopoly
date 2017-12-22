package Case;

import java.util.Observer;

import Jeu.*;
import Joueur.Joueur;

public class CaseGoPrison extends Case{

	public CaseGoPrison(Observer o) {
		super();
		this.ID = 30;
		addObserver(o);
	}
	
	@Override
	public void jouerAction(Joueur joueur){
		this.emitEvent(EventType.CASE_GO_PRISON);
	}
}
