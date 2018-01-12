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
	
	public Jeu(String joueur1, String joueur2, MonopolyController controller, Observer o){
		this.nombreJoueur = 2;
		this.des[0] = new De();
		this.des[1] = new De();
		this.plateau = new Plateau(this, o);
		this.argentInitial = 1500;
		this.joueurs[0] = new Joueur(joueur1, this, o);
		this.joueurs[1] = new Joueur(joueur2, this, o);
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
		
	}
	
	public void passerTour(){
		if(this.joueurs[currentJoueur].getArgent() < 0){
			System.out.println(this.joueurs[currentJoueur] +  " à fait banqueroute !");
		}
		else{
			this.tour = tour + 1;
			this.currentJoueur = tour % this.nombreJoueur;
			this.controller.getBtnLancer().setDisable(false);
		}
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
		//Demo
		int[] arrayDe1 = {1,4,6,1,1,5,1,1,2,6,2,2,6,3};
		int[] arrayDe2 = {3,5,4,2,3,6,1,1,1,4,2,4,2,1};
		int valeurDe1 = arrayDe1[this.controller.demoCount];
		int valeurDe2 = arrayDe2[this.controller.demoCount];
		Joueur current = this.joueurs[this.currentJoueur];
		if( (current.getPosition() + valeurDe1 + valeurDe2/**this.getValeurLancerDes()**/) > 39){
			int firstPos = current.getPosition();
			this.joueurs[this.currentJoueur].setArgent(this.joueurs[this.currentJoueur].getArgent() + 200);
			for(int i = 0; i < valeurDe1 + valeurDe2/**this.getValeurLancerDes()**/; i++){
				if(firstPos + i == 39){
					current.setPosition(0);
					i++;
					current.setPosition(0 + valeurDe1 + valeurDe2/**this.getValeurLancerDes()**/ - i);
				}
			}
		}
		else{
			current.setPosition(current.getPosition() + valeurDe1 + valeurDe2/**this.getValeurLancerDes()**/);
		}
	}
	
	
	/**public void deplacerJoueur(){
		int lol = this.joueurs[1].getPosition() + De.getLancer()
		this.joueurs[1].setPosition(Case[lol]);
	}**/
	
}