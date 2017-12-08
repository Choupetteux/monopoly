package Case;

import java.util.Observable;
import Joueur.Joueur;
import Jeu.EventType;
import Jeu.Jeu;
import Jeu.EventMonopoly;

public abstract class Case{

	protected String nom;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public abstract void jouerAction(Joueur joueur);

	
}
