package Case;

import Joueur.Joueur;

public class CaseAchetable extends Case{

	protected String groupeCouleur;
	protected int prixAchat;
	protected int prixHypotheque;
	protected boolean disponible;
	protected Joueur proprietaire = null;
	
	public CaseAchetable(int id) {
		super();
		this.ID = id;
	}

	public String getGroupeCouleur() {
		return groupeCouleur;
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
	@Override
	public void jouerAction(Joueur joueur) {
		// TODO Auto-generated method stub
		
	}

}
