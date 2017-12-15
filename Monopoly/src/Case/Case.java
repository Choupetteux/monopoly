package Case;

import java.util.ArrayList;
import java.util.Observable;

import org.w3c.dom.Node;

import IHM.XMLParser;
import Joueur.Joueur;
import Jeu.EventType;
import Jeu.Jeu;
import Jeu.EventMonopoly;

public abstract class Case{
	
	protected String nom;
	protected int ID;
	protected XMLParser parser = XMLParser.getParserInstance();

	public String getNom() {
		return nom;
	}
	
	public int getID(){
		return this.ID;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public abstract void jouerAction(Joueur joueur);

	
}
