package Case;


public class CaseAchetable extends Case{

	private String groupeCouleur;
	private int loyer;
	private int prixAchat;
	
	public CaseAchetable(String nom, int loyer, String groupeCouleur, int prixAchat) {
		super(true, nom, null);
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

}
