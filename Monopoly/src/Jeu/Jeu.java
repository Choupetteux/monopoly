package Jeu;

import java.util.Observable;
import java.util.Observer;

import IHM.MonopolyController;
import Joueur.Joueur;
import Plateau.Plateau;

public class Jeu{
	
	private MonopolyController controller;
	private int nombreJoueur;
	private De[] des = new De[2];
	private Plateau plateau;
	private int argentInitial;
	private Joueur[] joueurs = new Joueur[2];
	private int tour;
	private int valeurLancerDes;
	private int currentJoueur;
	
	public Jeu(String joueur1, String joueur2, MonopolyController controller){
		this.nombreJoueur = 2;
		this.des[0] = new De();
		this.des[1] = new De();
		this.plateau = new Plateau(this);
		this.argentInitial = 1500;
		this.joueurs[0] = new Joueur(joueur1, this);
		this.joueurs[1] = new Joueur(joueur2, this);
		this.tour = 0;
		this.controller = controller;
		this.currentJoueur = 0;
	}
	
	public int getNbrJoueur() {
		return nombreJoueur;
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
	
	public void jouerTour(){
		this.plateau.getCase(this.joueurs[currentJoueur].getPosition()).jouerAction(this.joueurs[currentJoueur]);
		this.tour = tour + 1;
		this.currentJoueur = tour % this.nombreJoueur;
		this.controller.getBtnLancer().setDisable(false);
	}
	
	public Joueur getJoueurFromNom(String nom){
		for(Joueur joueur : this.joueurs){
			if (joueur.getNom().equals(nom)){
				return joueur;
			}
		}
		return null;
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
	
	public void updateCurrentPos(){
		Joueur current = this.joueurs[this.currentJoueur];
		if( (current.getPosition() + this.getValeurLancerDes()) > 39){
			int firstPos = current.getPosition();
			for(int i = 0; i < this.getValeurLancerDes(); i++){
				if(firstPos + i == 39){
					current.setPosition(0);
					i++;
					current.setPosition(0 + this.getValeurLancerDes() - i);
				}
			}
		}
		else{
			current.setPosition(current.getPosition() + this.getValeurLancerDes());
		}
	}
	
	
	/**public void deplacerJoueur(){
		int lol = this.joueurs[1].getPosition() + De.getLancer()
		this.joueurs[1].setPosition(Case[lol]);
	}**/
	
}