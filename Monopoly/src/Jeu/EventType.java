package Jeu;

public enum EventType {
	/**
	 * L'évènement se déclenchera quand un joueur passe sur la case départ,
	 * et lui ajoute 200$ à son argent.
	 */
	CASE_DEPART,
	/**
	 * Se déclenche quand un joueur s'arrête sur une case achetable, lui propose
	 * d'acheter la case.
	 */
	CASE_PROPRIETE_ACHETABLE,
	CASE_PROPRIETE,
	/**
	 * Se déclenche quand un joueur s'arrête sur une case communauté, et lui fait
	 * piocher une carte communauté.
	 */
	CASE_CCC,
	/**
	 * Se délenche quand un joueur s'arrête sur une case Luxury tax, il paye le
	 * montant indiqué.
	 */
	CASE_LUXURY_TAX,
	/**
	 * ^
	 */
	CASE_INCOME_TAX,
	/**
	 * Si la gare est achetable, propose au joueur de l'acheter
	 */
	CASE_GARE_ACHETABLE,
	/**
	 * Si la gare est possédé par un joueur.
	 */
	CASE_GARE,
	/**
	 * Si le joueur tombe sur une case chance
	 */
	CASE_CHANCE,
	/**
	 * Passage dans la prison
	 */
	CASE_PASSAGE_PRISON,
	/**
	 * Amène le joueur en prison
	 */
	CASE_GO_PRISON,
	/**
	 * Case service achetable
	 */
	CASE_SERVICE_ACHETABLE,
	/**
	 * Case service
	 */
	CASE_SERVICE,
	/**
	 * achat de la propriété rejeté par le joueur
	 */
	ACHAT_PROPRIETE_REJECT,
	
}
