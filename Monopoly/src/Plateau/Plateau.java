package Plateau;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Queue;

import Case.Case;
import Case.CaseCarte;
import Case.CaseDepart;
import Case.CaseGoPrison;
import Case.CaseParking;
import Case.CasePropriete;
import Jeu.Jeu;

public class Plateau {
	
	private Case[] cases;
	private Queue<Carte> carteChance;
	private Hashtable<String, Case[]> groupeCouleur;
	private Queue<Carte> carteCommunaute;
	private Jeu GM;
	
	public Plateau(Jeu gM) {
		super();
		this.cases = new Case[40];
		//Initialisation de chaque case avec son type précis
		//A changer avec quelque chose de plus propre si on a le temps
		cases[0] = new CaseDepart();
		cases[1] = new CasePropriete(1);
		cases[2] = new CaseCarte(2);
		cases[3] = new CasePropriete(3);
		cases[4] = new CaseTaxe(4);
		cases[5] = new CaseGare(5);
		cases[6] = new CasePropriete(6);
		cases[7] = new CaseCarte(7);
		cases[8] = new CasePropriete(8);
		cases[9] = new CasePropriete(9);
		cases[10] = new CasePrison(10);
		cases[11] = new CasePropriete(11);
		cases[12] = new CaseService(12);
		cases[13] = new CasePropriete(13);
		cases[14] = new CasePropriete(14);
		cases[15] = new CaseGare(15);
		cases[16] = new CasePropriete(16);
		cases[17] = new CaseCarte(17);
		cases[18] = new CasePropriete(18);
		cases[19] = new CasePropriete(19);
		cases[20] = new CaseParking();
		cases[21] = new CasePropriete(21);
		cases[22] = new CaseCarte(22);
		cases[23] = new CasePropriete(23);
		cases[24] = new CasePropriete(24);
		cases[25] = new CaseGare(25);
		cases[26] = new CasePropriete(26);
		cases[27] = new CasePropriete(27);
		cases[28] = new CaseService(28);
		cases[29] = new CasePropriete(29);
		cases[30] = new CaseGoPrison();
		cases[31] = new CasePropriete(31);
		cases[32] = new CasePropriete(32);
		cases[33] = new CaseCarte(33);
		cases[34] = new CasePropriete(34);
		cases[35] = new CaseGare(35);
		cases[36] = new CaseCarte(36);
		cases[37] = new CasePropriete(37);
		cases[38] = new CaseTaxe(38);
		cases[39] = new CasePropriete(39);
		//---------------------------------------------
		this.carteChance = new LinkedList<Carte>();
		this.groupeCouleur = new Hashtable<String, Case[]>();
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
	
	public int getCaseNbr(){
		return this.cases.length;
	}
	
	public ArrayList<CasePropriete> getPropriete(){
		//TODO: Retourner une arraylist de toute les carte propriete
		return null;
	}
	
	public int getProprieteNombreCouleur(){
		//TODO: Retourner le nombre de propriété possédant une certaines couleur
		return -1;
	}
	
	public boolean effacerCarte(){
		//TODO: Effacer carte de l'array.
		return false;
	}
	
}
