package Plateau;

import java.util.Hashtable;

import Case.Case;
import Jeu.Jeu;

public class Plateau {
	
	private Case[] cases;
	private Carte[] carteChance;
	private Hashtable groupeCouleur;
	private Carte[] carteCommunaute;
	private Jeu GM;
	
	public Plateau(Hashtable groupeCouleur, Jeu gM) {
		super();
		this.cases = new Case[41];
		this.carteChance = new Carte[15];
		this.groupeCouleur = groupeCouleur;
		this.carteCommunaute = new Carte[15];
		GM = gM;
	}
	
	public boolean ajouterCarte(int pos, Carte carte){
		return false;
	}
	
	public boolean ajouterCase(int pos, Case caase){
		return false;
	}
	
	public Carte piocherCommunaute(){
		int valeur = 
		return this.carteCommunaute[valeur];
	}
}
