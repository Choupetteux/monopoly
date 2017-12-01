package Jeu;

import Joueur.Joueur;
import Plateau.Plateau;

public class Jeu {
	
	private int joueurMax;
	private De[] des = new De[2];
	private Plateau plateau;
	private int argentInitial;
	private Joueur[] joueurs;
	private int tour;
	private int valeurLancerDes;
	
	public int getJoueurMax() {
		return joueurMax;
	}
	public De getDes(int index) {
		return des[index];
	}
	
	public Plateau getPlateau() {
		return plateau;
	}
	
	public int getArgentInitial() {
		return argentInitial;
	}
	
	public Joueur[] getJoueurs() {
		return joueurs;
	}
	public int getTour() {
		return tour;
	}
	public int getValeurLancerDes() {
		return getDes(1).getLancer() + getDes(2).getLancer();
	}
	
	/**public void deplacerJoueur(){
		int mabite = this.joueurs[1].getPosition() + De.getLancer()
		this.joueurs[1].setPosition(Case[mabite]);
	}**/
	
}