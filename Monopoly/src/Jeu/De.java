package Jeu;

public class De {
	
	private int valeurDe;
	
	public De(){
		this.valeurDe = 1;
	}
	
	public void relancerDe(){
		this.valeurDe = (int)(1+6*Math.random());
	}
	
	public int getLancer(){
		return this.valeurDe;
	}
}
