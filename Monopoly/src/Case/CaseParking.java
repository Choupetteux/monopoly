package Case;

import java.util.Observer;

import Joueur.Joueur;

public class CaseParking extends Case{

	public CaseParking(Observer o) {
		super();
		this.ID=20;
		addObserver(o);
	}
	
	public void caseParking(){
		//FX
	}

	@Override
	public void jouerAction(Joueur joueur) {
		// TODO Auto-generated method stub
		
	}
	
}
