package Plateau;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Observer;
import java.util.Queue;

import Case.Case;
import Case.CaseCarte;
import Case.CaseDepart;
import Case.CaseGare;
import Case.CaseGoPrison;
import Case.CaseParking;
import Case.CasePrison;
import Case.CasePropriete;
import Case.CaseService;
import Case.CaseTaxe;
import Jeu.Jeu;

public class Plateau {
	
	private Case[] cases;
	private Queue<Carte> carteChance;
	private Hashtable<String, Case[]> groupeCouleur;
	private Queue<Carte> carteCommunaute;
	private Jeu GM;
	
	public Plateau(Jeu gM, Observer o) {
		super();
		this.cases = new Case[40];
		//--------------------------------------------------------------
		//Initialisation de chaque case avec son type précis
		//A changer avec quelque chose de plus propre si on a le temps
		cases[0] = new CaseDepart(o);
		cases[1] = new CasePropriete(1, o);
		cases[2] = new CaseCarte(2, o);
		cases[3] = new CasePropriete(3, o);
		cases[4] = new CaseTaxe(4, o);
		cases[5] = new CaseGare(5, o, this.GM);
		cases[6] = new CasePropriete(6, o);
		cases[7] = new CaseCarte(7, o);
		cases[8] = new CasePropriete(8, o);
		cases[9] = new CasePropriete(9, o);
		cases[10] = new CasePrison(o);
		cases[11] = new CasePropriete(11, o);
		cases[12] = new CaseService(12, o);
		cases[13] = new CasePropriete(13, o);
		cases[14] = new CasePropriete(14, o);
		cases[15] = new CaseGare(15, o, this.GM);
		cases[16] = new CasePropriete(16, o);
		cases[17] = new CaseCarte(17, o);
		cases[18] = new CasePropriete(18, o);
		cases[19] = new CasePropriete(19, o);
		cases[20] = new CaseParking(o);
		cases[21] = new CasePropriete(21, o);
		cases[22] = new CaseCarte(22, o);
		cases[23] = new CasePropriete(23, o);
		cases[24] = new CasePropriete(24, o);
		cases[25] = new CaseGare(25, o, this.GM);
		cases[26] = new CasePropriete(26, o);
		cases[27] = new CasePropriete(27, o);
		cases[28] = new CaseService(28, o);
		cases[29] = new CasePropriete(29, o);
		cases[30] = new CaseGoPrison(o);
		cases[31] = new CasePropriete(31, o);
		cases[32] = new CasePropriete(32, o);
		cases[33] = new CaseCarte(33, o);
		cases[34] = new CasePropriete(34, o);
		cases[35] = new CaseGare(35, o, this.GM);
		cases[36] = new CaseCarte(36, o);
		cases[37] = new CasePropriete(37, o);
		cases[38] = new CaseTaxe(38, o);
		cases[39] = new CasePropriete(39, o);
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
		Carte cartePioche  = this.carteCommunaute.remove();
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
		ArrayList<CasePropriete> res = new ArrayList<CasePropriete>();
		for(Case casee : this.cases) {
			if(casee instanceof CasePropriete) {
				res.add((CasePropriete) casee);
			}
		}
		return res;
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
