package Case;

import java.util.Observer;

import Joueur.Joueur;

public class CaseCarte extends Case{

	private int typeCarte;
	
	public CaseCarte(int id, Observer o){
		super();
		this.ID = id;
		addObserver(o);
	}

	@Override
	public void jouerAction(Joueur joueur) {
		// TODO Auto-generated method stub
		
	}
	
	
}
