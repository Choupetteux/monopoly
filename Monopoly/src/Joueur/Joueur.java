package Joueur;
import java.util.Hashtable;

import Case.Case;
import Case.CaseAchetable;
import Case.CaseGare;
import Case.CasePropriete;
import Case.CaseService;

public class Joueur {
	
	private Hashtable groupeCouleurs;
	private boolean enPrison;
	private int money;
	private String nom;
	private Case position;
	private CasePropriete[] proprietes;
	private CaseGare[] gares;
	private CaseService[] services;
	
	public Joueur(String nom){
		this.nom = nom;
		this.money = 1500;
		//this.position = CaseDepart;
	}
	
	public void acheterPropriete(){
		// FX
	}
	
	public boolean peutAcheterMaison(){
		//Sur quelle couleur se pose la maison (ex: blue = 100E vert = 200E)
		// Compare l'argent du joueur avec le prix de la maison
		// Voir si il possede toutes les proprietes du groupe de couleur
		// Voir si il ne possede pas déjà 4 maisons ou un hotel
		return false;
	}
	
	public void verifierPropriete(){
		// FX
	}
	
	public void echangerPropriete(){
		//Vérifier le tableau de propriete du joueur avec qui on veut échanger
		//Vérifier qu'il possede la carte dont on veut échanger
		//Vérifier que l'argent que l'on met sur la "table" soit inferieur avec this.money
		//Si tout est OK faire échange
	}
	
	public int getArgent(){
		return this.money;
	}
	
	/*public Type getMonopole(){
	 * return qqchose;} 
	 */
	
	public String getNom(){
		return this.nom;
	}
	
	
	//voir plus tard
	public boolean carteSortiePrison(){
		return false; 
	}
	
	public Case getPosition(){
		return this.position;
	}
	
	public CasePropriete[] getProprietes(){
		return this.proprietes;
	}
	
	public int getNbrPropriete(){
		return this.proprietes.length;
	}
	
	public int getNbrProprieteCouleur(){
		return 0;
	}
	
	public boolean estBanqueroute(){
		return this.money<=0;
	}
	
	public boolean estEnPrison(){
		return this.enPrison;
	}
	
	public int nbrGare(){
		return this.gares.length;
	}
	
	public int nbrService(){
		return this.services.length;
	}
	
	public void payerLoyerA(int loyer, Joueur proprietaire){
		this.money -= loyer;
		proprietaire.money += loyer;
	}
	
	public void acheterPropriete(int prix){
	}
	
	public void acheterMaison(){}
	
	public void acheterGare(){}
	
	public void acheterService(){}
	
	public void vendre(CaseAchetable propriete){}
	
	public void mettreEnPrison(){
		//this.position = CasePrison;
	}
	
	public void setArgent(int money){
		this.money += money;
	}
	
	public void setPosition(Case cas){
		this.position = cas;
	}
	
	@Override
	public String toString(){
		return "";
	}
}
