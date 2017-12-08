package Jeu;

public enum EventType {
	/**
	 * L'évènement se déclenchera quand un joueur passe sur la case départ,
	 * et lui ajoute 200$ à son argent.
	 */
	PASSAGE_GO,
	/**
	 * Se déclenche quand un joueur s'arrête sur une case achetable, lui propose
	 * d'acheter la case.
	 */
	CASE_PROPRIETE_ACHETABLE,
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
	CASE_INCOME_TAX,
	CASE_GARE_ACHETABLE,
	CASE_GARE,
	CASE_CHANCE,
	CASE_PASSAGE_PRISON,
	CASE_PRISON,
	CASE_GO_PRISON,
	CASE_SERVICE_ACHETABLE,
	CASE_SERVICE,
	ACHAT_PROPRIETE_REJECT,
	
}
