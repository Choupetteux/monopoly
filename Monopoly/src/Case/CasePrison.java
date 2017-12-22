package Case;

import java.util.Observer;

import Joueur.Joueur;

public class CasePrison extends Case{
	private int prixSortie;

	public CasePrison(Observer o) {
		super();
		this.ID=20;
		this.prixSortie = 50;		
		addObserver(o);
	}
	
	public void casePrison(){
		//FX
	}
	
	@Override
	public void jouerAction(Joueur joueur) {
		// TODO Auto-generated method stub
		
	}
	
}
