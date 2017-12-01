package Case;

import Joueur.Joueur;

public class CaseAchetable extends Case{

	protected String groupeCouleur;
	protected int loyer;
	protected int prixAchat;
	protected boolean disponible;
	protected Joueur proprietaire;
	
	public CaseAchetable(String nom, int loyer, String groupeCouleur, int prixAchat) {
		super();
		this.loyer = loyer;
		this.groupeCouleur = groupeCouleur;
		this.prixAchat = prixAchat;
	}

	public String getGroupeCouleur() {
		return groupeCouleur;
	}

	public int getLoyer() {
		return loyer;
	}

	public int getPrixAchat() {
		return prixAchat;
	}


	public Joueur getProprietaire() {
		return proprietaire;
	}

	public void setProprietaire(Joueur proprietaire) {
		this.proprietaire = proprietaire;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
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
