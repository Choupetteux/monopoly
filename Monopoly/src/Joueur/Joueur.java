package Joueur;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Observable;

import Case.Case;
import Case.CaseAchetable;
import Case.CaseGare;
import Case.CasePropriete;
import Case.CaseService;
import Jeu.Jeu;
import Jeu.EventMonopoly;
import Jeu.EventType;
import javafx.scene.paint.Color;

public class Joueur extends Observable{
	
	private Hashtable groupeCouleurs = new Hashtable<String, Color>();
	private Jeu jeu;
	private boolean enPrison;
	private int money;
	private String nom;
	private int position;
	private ArrayList<CasePropriete> proprietes = new ArrayList<CasePropriete>();
	private ArrayList<CaseGare> gares = new ArrayList<CaseGare>();
	private ArrayList<CaseService> services = new ArrayList<CaseService>();
	
	public Joueur(String nom, Jeu jeu){
		this.nom = nom;
		this.jeu = jeu;
		this.money = this.jeu.getArgentInitial();
		this.position = 0;
	}
	
	public void acheterPropriete(CasePropriete propriete){
		this.proprietes.add(propriete);
	}
	
	public boolean peutAcheterMaison(){
		//TODO: Sur quelle couleur se pose la maison (ex: blue = 100E vert = 200E)
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
	 * return qqchose;
	 *} 
	 */
	
	public String getNom(){
		return this.nom;
	}
	
	
	//voir plus tard
	public boolean carteSortiePrison(){
		return false; 
	}
	
	public int getPosition(){
		return this.position;
	}
	
	public ArrayList<CasePropriete> getProprietes(){
		return this.proprietes;
	}
	
	public int getNbrPropriete(){
		return this.proprietes.size();
	}
	
	public int getNbrProprieteCouleur(String color){
		return 0;
	}
	
	public boolean estBanqueroute(){
		return this.money<=0;
	}
	
	public boolean estEnPrison(){
		return this.enPrison;
	}
	
	public int nbrGare(){
		return this.gares.size();
	}
	
	public int nbrService(){
		return this.services.size();
	}
	
	public void payerLoyerA(int loyer, Joueur proprietaire){
		this.money -= loyer;
		proprietaire.money += loyer;
	}
	
	public void acheterPropriete(int prix){
		
	}
	
	public void acheterMaison(){
		
	}
	
	public void acheterGare(){}
	
	public void acheterService(){}
	
	public void vendre(CaseAchetable propriete){}
	
	public void mettreEnPrison(){
		this.position = 10;
		this.enPrison = true;
	}
	
	public void setArgent(int money){
		this.money = money;
	}
	
	public void setPosition(int cas){
		this.position = cas;
	}
	
	@Override
	public String toString(){
		return this.nom + " : " + this.money;
	}
	
	public void emitEvent(EventType type) {
        setChanged();
        notifyObservers(new EventMonopoly(type));
    }

}
