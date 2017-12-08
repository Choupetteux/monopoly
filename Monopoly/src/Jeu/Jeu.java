package Jeu;

import java.util.Observable;
import java.util.Observer;

import Joueur.Joueur;
import Plateau.Plateau;

public class Jeu{
	
	private int joueurMax;
	private De[] des = new De[2];
	private Plateau plateau;
	private int argentInitial;
	private Joueur[] joueurs = new Joueur[2];
	private int tour;
	private int valeurLancerDes;
	private int currentJoueur;
	
	public Jeu(){
		this.joueurMax = 2;
		this.des[0] = new De();
		this.des[1] = new De();
		this.plateau = new Plateau(this);
		this.argentInitial = 1500;
		this.joueurs[0] = new Joueur("Michel", this);
		this.joueurs[1] = new Joueur("Robert", this);
		this.tour = 0;
		this.currentJoueur = 0;
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
	
	public Joueur getJoueurs(int index) {
		return this.joueurs[index];
	}
	
	public int getTour() {
		return tour;
	}
	
	public int getValeurLancerDes() {
		return getDes(0).getLancer() + getDes(1).getLancer();
	}
	
	public int getCurrentJoueur(){
		return this.currentJoueur;
	}

	
	
	/**public void deplacerJoueur(){
		int mabite = this.joueurs[1].getPosition() + De.getLancer()
		this.joueurs[1].setPosition(Case[mabite]);
	}**/
	
}