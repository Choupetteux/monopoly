package Case;

import Joueur.Joueur;

public class Case {
	private boolean disponible;
	private String nom;
	private Joueur proprietaire;
	
	public Case(boolean disponible, String nom, Joueur proprietaire) {
		super();
		this.disponible = disponible;
		this.nom = nom;
		this.proprietaire = proprietaire;
	}
	
	public void jouerAction(){
	
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Joueur getProprietaire() {
		return proprietaire;
	}

	public void setProprietaire(Joueur proprietaire) {
		this.proprietaire = proprietaire;
	}
	
	public String toString(){
		
		if(this.disponible == false){
			return "Case : " + this.nom + "\n" + "Disponibilité : " + this.disponible + "\n"
					+ "Propriétaire : " + this.proprietaire;
		}
		else {
			return "Case : " + this.nom + "\n" + "Disponibilité : " + this.disponible + "\n";
		}
	}
	
}
