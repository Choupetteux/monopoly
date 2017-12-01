package Jeu;

import Joueur.Joueur;
import Plateau.Plateau;

public class Jeu {
	
	private int joueurMax;
	private De des;
	private Plateau plateau;
	private int argentInitial;
	private Joueur[] joueurs;
	private int tour;
	private int valeurLancerDes;
	
	public int getJoueurMax() {
		return joueurMax;
	}
	public De getDes() {
		return des;
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
		return valeurLancerDes;
	}
	
	public void deplacerJoueur(){
		int mabite = this.joueurs[1].getPosition() + De.getLancer()
		this.joueurs[1].setPosition(Case[mabite]);
	}
	
}