package Jeu;

public class De {
	
	int valeurLancer;
	
	public De(){
		this.valeurLancer = (int)(1+6*Math.random()) + (int) (1+6*Math.random());
	}
	
	public int getLancer(){
		return this.valeurLancer;
	}
}
