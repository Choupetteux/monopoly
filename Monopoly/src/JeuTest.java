import static org.junit.Assert.*;

import java.util.Observer;

import org.junit.Before;
import org.junit.Test;

import Jeu.Jeu;
import IHM.MonopolyController;
import java.util.Observable;

public class JeuTest implements Observer {

	@Before
	public void setUp() throws Exception {
	}


	@Test
	public void JoueurConstructeur(){
		Jeu a = new Jeu("Luigi", "Lea", new MonopolyController(), this);
		assertTrue(a.getJoueurFromNom("Luigi").getNom().equals("Luigi"));
		assertFalse(a.getJoueurs(1).equals("Luigi"));
		assertTrue(a.getJoueurs(1).getNom().equals("Lea"));
	}

	@Test
	public void SommeCorrecte(){
		Jeu a = new Jeu("Luigi", "Lea", new MonopolyController(), this);
		assertTrue(a.getJoueurs(0).getArgent()==(1500));
	}
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}
}
