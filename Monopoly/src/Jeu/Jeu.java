package Jeu;

import Joueur.Joueur;
import Plateau.Plateau;

public class Jeu {
	
	private int joueurMax;
	private De[] des = new De[2];
	private Plateau plateau;
	private int argentInitial;
	private Joueur[] joueurs = new Joueur[2];
	private int tour;
	private int valeurLancerDes;
	
	public Jeu(){
		this.joueurMax = 2;
		this.des[1] = new De();
		this.des[2] = new De();
		this.plateau = new Plateau(this);
		this.argentInitial = 1500;
		this.joueurs[1] = new Joueur("Michel");
		this.joueurs[2] = new Joueur("Robert");
		this.tour = 0;
	}
	
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