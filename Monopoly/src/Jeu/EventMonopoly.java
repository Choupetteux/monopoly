package Jeu;

import java.util.Observable;

import Jeu.EventType;

/**
 * Classe utilisée pour communiquer avec les observateurs d'une connexion
 *
 */
public class EventMonopoly{
    /**
     * Type de l'événement
     */
    public final EventType type;

    /**
     * Constructeur.
     * 
     * @param type
     *            type de l'événement
     * @param data
     *            données de l'événement
     */
    public EventMonopoly(EventType type) {
        this.type = type;
    }
}