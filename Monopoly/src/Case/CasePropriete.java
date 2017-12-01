package Case;

public class CasePropriete extends CaseAchetable{
	
	private int nbMaison;
	private int prixMaison;
	private int prixHotel;
	private int prixHypotheque;
	
	public CasePropriete(String nom, int loyer, String groupeCouleur, int prixAchat, int prixMaison, int prixHotel, int prixHypotheque) {
		super(nom, loyer, groupeCouleur, prixAchat);
		this.nbMaison = 0;
		this.prixMaison = prixMaison;
		this.prixHotel = prixHotel;
		this.prixHypotheque = prixHypotheque;
	}
	
	public int getNbMaison(){
		return this.nbMaison;
	}
	
	public int getPrixHypotheque(){
		return this.prixHypotheque;
	}
}
