package Case;

import java.util.Observer;

public class CaseGare extends CaseAchetable{

	public CaseGare(int ID, Observer o) {
		super(ID, o);
	}
	
	public int prixHypotheque(){
		return 100;
	}

}
