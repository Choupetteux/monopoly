package IHM;

import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;
import java.lang.Class;
import java.lang.reflect.Field;
import javafx.scene.control.SplitPane;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Observable;
import java.util.Observer;
import java.util.ResourceBundle;

import Jeu.*;
import info.util.javafx.FXUtil;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

/**
 * Classe contrôleur pour l'interface décrite dans le document
 * <b>Monopoly.fxml</b>.
 *
 * Cette classe contient principalement les méthodes appelées en réaction aux
 * événements utilisateur. Une instance de cette classe est créée
 * automatiquement chaque fois que le document <b>Monopoly.fxml</b> est chargé.
 */
public class MonopolyController implements Observer{
	@FXML
	private Stage stage;
	private ResourceBundle bundle;
	@FXML
	private ImageView plateauImg;
	@FXML
	private Button bouton;
	@FXML
	private Label resLancer;
	@FXML
	private Button boutonPropriete;
	@FXML
	private Label recapLabel;
	@FXML
	private ScrollPane recapPane;
	@FXML
	private ScrollPane encherePane;
	@FXML
	private ScrollPane proprietePane;
	@FXML
	private ListView<String> listeJoueur;
	@FXML
	private GridPane plateauGrille;
	@FXML
	private ImageView de1;
	@FXML
	private ImageView de2;

	private Jeu jeu;
	private String currentPane = "Récapitulatif";

	/**
	 * Constructeur.
	 */
	public MonopolyController() {
		this.bundle = ResourceBundle.getBundle("IHM.Monopoly");

	}

	/**
	 * Méthode invoquée automatiquement après instanciation de ce contrôleur par
	 * JavaFX.
	 */
	@FXML
	protected void initialize() {
		this.encherePane.setOpacity(0);
		this.encherePane.setDisable(true);
		this.proprietePane.setOpacity(0);
		this.proprietePane.setDisable(true);
		ObservableList<String> joueurList = FXCollections.observableArrayList("Joueur 1", "fag");
		this.listeJoueur.setItems(joueurList);
		this.jeu = new Jeu();
	}

	/**
	 * Méthode invoquée lorsque la fenêtre dont la scène est associée à ce
	 * contrôleur est affichée. Si nécessaire, complétez cette méthode pour
	 * exécuter du code après l'affichage de la fenêtre.
	 */
	@FXML
	public void onWindowShown() {

	}

	/**
	 * Méthode invoquée lor<sque la fenêtre dont la scène est associée à ce
	 * contrôleur est sur le point d'être fermée par le système. Si nécessaire,
	 * complétez cette méthode pour autoriser/empêcher la fermeture de la
	 * fenêtre.
	 * 
	 * @return {@code true} si la fenêtre peut être fermée, ou {@code false}
	 *         sinon (par exemple pour permettre à l'utilisateur d'enregistrer
	 *         un document).
	 * 
	 */
	@FXML
	public boolean onWindowCloseRequest() {
		return true;
	}

	@FXML
	public void onClickPropriete() {
		this.changePane("Propriété");
		this.currentPane = "Propriété";
	}

	@FXML
	public void onClickEnchere() {
		this.changePane("Enchere");
		this.currentPane = "Enchere";
	}

	@FXML
	public void onClickRecapitulatif() {
		this.changePane("Recapitulatif");
	}

	@FXML
	public void onClickBackToCurrent() {
		this.changePane(currentPane);
	}

	@FXML
	public void btnLancerDes(){
		for(int i = 0; i < 2; i++){
			jeu.getDes(i).relancerDe();
		}
		switch(this.jeu.getDes(0).getLancer()){
		case 1:
			this.de1.setImage(new Image("/IHM/Dice1.gif"));
			break;
		case 2:
			this.de1.setImage(new Image("/IHM/Dice2.gif"));
			break;
		case 3:
			this.de1.setImage(new Image("/IHM/Dice3.gif"));
			break;
		case 4:
			this.de1.setImage(new Image("/IHM/Dice4.gif"));
			break;
		case 5:
			this.de1.setImage(new Image("/IHM/Dice5.gif"));
			break;
		case 6:
			this.de1.setImage(new Image("/IHM/Dice6.gif"));
			break;
		}
		switch(this.jeu.getDes(1).getLancer()){
		case 1:
			this.de2.setImage(new Image("/IHM/Dice1.gif"));
			break;
		case 2:
			this.de2.setImage(new Image("/IHM/Dice2.gif"));
			break;
		case 3:
			this.de2.setImage(new Image("/IHM/Dice3.gif"));
			break;
		case 4:
			this.de2.setImage(new Image("/IHM/Dice4.gif"));
			break;
		case 5:
			this.de2.setImage(new Image("/IHM/Dice5.gif"));
			break;
		case 6:
			this.de2.setImage(new Image("/IHM/Dice6.gif"));
			break;
		}
		this.resLancer.setText("" + jeu.getValeurLancerDes());
		}

	@FXML
	public void changePane(String type) {
		if (type.equals("Propriété")) {
			this.recapPane.setOpacity(0);
			this.recapPane.setDisable(true);
			this.encherePane.setOpacity(0);
			this.encherePane.setDisable(true);
			this.proprietePane.setOpacity(1);
			this.proprietePane.setDisable(false);
		} else if (type.equals("Enchere")) {
			this.recapPane.setOpacity(0);
			this.recapPane.setDisable(true);
			this.encherePane.setOpacity(1);
			this.encherePane.setDisable(false);
			this.proprietePane.setOpacity(0);
			this.proprietePane.setDisable(true);
		} else if (type.equals("Recapitulatif")) {
			this.recapPane.setOpacity(1);
			this.recapPane.setDisable(false);
			this.encherePane.setOpacity(0);
			this.encherePane.setDisable(true);
			this.proprietePane.setOpacity(0);
			this.proprietePane.setDisable(true);
		}
	}
	
	@Override
	public void update(Observable o, Object arg) {
		EventMonopoly event = (EventMonopoly)arg;
		switch(event.type){
		case CASE_GO_PRISON:
			this.jeu.getJoueurs(this.jeu.getCurrentJoueur()).mettreEnPrison();
		case ACHAT_PROPRIETE_REJECT:
			//TODO:
			break;
		case CASE_CCC:
			//TODO:
			break;
		case CASE_CHANCE:
			//TODO:
			break;
		case CASE_DEPART:
			//TODO:
			break;
		case CASE_GARE:
			//TODO:
			break;
		case CASE_GARE_ACHETABLE:
			//TODO:
			break;
		case CASE_INCOME_TAX:
			//TODO:
			break;
		case CASE_LUXURY_TAX:
			//TODO:
			break;
		case CASE_PASSAGE_PRISON:
			//TODO:
			break;
		case CASE_PROPRIETE_ACHETABLE:
			//TODO:
			break;
		case CASE_SERVICE:
			//TODO:
			break;
		case CASE_SERVICE_ACHETABLE:
			//TODO:
			break;
		default:
			break;
		}
		
	}

}
