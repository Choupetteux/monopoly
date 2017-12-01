package Jeu;

public class De {
	
	int valeurDe;
	
	public De(){
		this.valeurDe = (int)(1+6*Math.random());
	}
	
	public int getLancer(){
		return this.valeurDe;
	}
}
