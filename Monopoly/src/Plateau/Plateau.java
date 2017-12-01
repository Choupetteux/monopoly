package Plateau;

import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Queue;

import Case.Case;
import Jeu.Jeu;

public class Plateau {
	
	private Case[] cases;
	private Queue<Carte> carteChance;
	private Hashtable groupeCouleur;
	private Queue<Carte> carteCommunaute;
	private Jeu GM;
	
	public Plateau(Hashtable groupeCouleur, Jeu gM) {
		super();
		this.cases = new Case[41];
		this.carteChance = new LinkedList<Carte>();
		this.groupeCouleur = groupeCouleur;
		this.carteCommunaute = new LinkedList<Carte>();
		GM = gM;
	}
	
	public boolean ajouterCarte(int pos, Carte carte){
		return false;
	}
	
	public boolean ajouterCase(int pos, Case caase){
		return false;
	}
	
	public Carte piocherCommunaute(){
		Carte cartePioche = this.carteCommunaute.remove();
		this.carteCommunaute.add(cartePioche);
		return cartePioche;
	}
	
	public Carte piocherChance() {
		Carte cartePioche = this.carteChance.remove();
		//if(cartePioche == "Libéré prison"){
			//Donner la carte au joueur qui pioche
		//}
		//else{
			this.carteChance.add(cartePioche);
		//}
		return cartePioche;
	}
	
	public Case getCase(int pos){
		return this.cases[pos];
	}
	
}
