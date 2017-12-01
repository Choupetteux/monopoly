package Case;

public class CaseGare extends CaseAchetable{

	public CaseGare(String nom) {
		super(nom, 25, "NOIR", 200);
	}
	
	public int prixHypotheque(){
		return 100;
	}

}
