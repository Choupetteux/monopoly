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

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import java.util.ResourceBundle;

import org.w3c.dom.Node;

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
	private ImageView de1;
	@FXML
	private ImageView de2;
	
	@FXML
	private Button bouton;
	@FXML
	private Button boutonPropriete1;
	@FXML
	private Button boutonPropriete3;
	@FXML
	private Button boutonPropriete6;
	@FXML
	private Button boutonPropriete8;
	@FXML
	private Button boutonPropriete9;
	@FXML
	private Button boutonPropriete11;
	@FXML
	private Button boutonPropriete13;
	@FXML
	private Button boutonPropriete14;
	@FXML
	private Button boutonPropriete16;
	@FXML
	private Button boutonPropriete18;
	@FXML
	private Button boutonPropriete19;
	@FXML
	private Button boutonPropriete21;
	@FXML
	private Button boutonPropriete23;
	@FXML
	private Button boutonPropriete24;
	@FXML
	private Button boutonPropriete26;
	@FXML
	private Button boutonPropriete27;
	@FXML
	private Button boutonPropriete29;
	@FXML
	private Button boutonPropriete31;
	@FXML
	private Button boutonPropriete32;
	@FXML
	private Button boutonPropriete34;
	@FXML
	private Button boutonPropriete37;
	@FXML
	private Button boutonPropriete39;
	
	
	@FXML
	private Label recapLabel;
	@FXML
	private Label prixMLabel;
	@FXML
	private Label prixHLabel;
	@FXML
	private Label loyerLabel;
	@FXML
	private Label hypothequeLabel;
	@FXML
	private Label proprieteLabel;
	@FXML
	private Label resLancer;
	
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
	
	private Image vert = new Image("/IHM/proprieteVerte2.jpeg");
	private Image bleu = new Image("/IHM/proprieteBleu.png");
	private Image marron = new Image("/IHM/proprieteMarron.png");
	private Image magenta = new Image("/IHM/proprieteMagenta.png");
	private Image cyan = new Image("/IHM/proprieteCyan.png");
	private Image rouge = new Image("/IHM/proprieteRouge.png");
	private Image jaune = new Image("/IHM/proprieteJaune.png");
	

	private XMLParser parser = new XMLParser();
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
		//Initialisation des méthodes associés aux boutons
		boutonPropriete1.setOnAction(e -> onClickPropriete(1));
		boutonPropriete3.setOnAction(e -> onClickPropriete(3));
		boutonPropriete6.setOnAction(e -> onClickPropriete(6));
		boutonPropriete8.setOnAction(e -> onClickPropriete(8));
		boutonPropriete9.setOnAction(e -> onClickPropriete(9));
		boutonPropriete11.setOnAction(e -> onClickPropriete(11));
		boutonPropriete13.setOnAction(e -> onClickPropriete(13));
		boutonPropriete14.setOnAction(e -> onClickPropriete(14));
		boutonPropriete16.setOnAction(e -> onClickPropriete(16));
		boutonPropriete18.setOnAction(e -> onClickPropriete(18));
		boutonPropriete19.setOnAction(e -> onClickPropriete(19));
		boutonPropriete21.setOnAction(e -> onClickPropriete(21));
		boutonPropriete23.setOnAction(e -> onClickPropriete(23));
		boutonPropriete24.setOnAction(e -> onClickPropriete(24));
		boutonPropriete26.setOnAction(e -> onClickPropriete(26));
		boutonPropriete27.setOnAction(e -> onClickPropriete(27));
		boutonPropriete29.setOnAction(e -> onClickPropriete(29));
		boutonPropriete31.setOnAction(e -> onClickPropriete(31));
		boutonPropriete32.setOnAction(e -> onClickPropriete(32));
		boutonPropriete34.setOnAction(e -> onClickPropriete(34));
		boutonPropriete37.setOnAction(e -> onClickPropriete(37));
		boutonPropriete39.setOnAction(e -> onClickPropriete(39));
		

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
	public void onClickPropriete(int index) {
		ArrayList<ArrayList<Node>> terrains = new ArrayList<ArrayList<Node>>();
		ArrayList<Node> groups = this.parser.getNodeArray("groupe", this.parser.getGroupes());
		for(Node group : groups){
			terrains.add(this.parser.getNodeArray("terrain", group.getChildNodes()));
		}
		for(ArrayList<Node> terrain : terrains){
			for(Node attribut : terrain){
				if(Integer.parseInt(this.parser.getNodeAttr("id", attribut)) == index){
					//Changement nom case
					this.proprieteLabel.setText(this.parser.getNodeAttr("nom", attribut));
					//-------------------------------------------------------------------
					//Changement couleur case
					if(this.parser.getNodeAttr("couleur", groups).equals("bleu")){
						
					}
				}
			}
		}
		
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
			this.jeu.getPlateau().piocherCommunaute();
			break;
		case CASE_CHANCE:
			this.jeu.getPlateau().piocherChance();
			break;
		case CASE_DEPART:
			this.jeu.getJoueurs(this.jeu.getCurrentJoueur()).setArgent(this.jeu.getJoueurs(this.jeu.getCurrentJoueur()).getArgent() + 200);
			break;
		case CASE_GARE:
			//TODO:pay batar mé fo calculer
			break;
		case CASE_GARE_ACHETABLE:
			//TODO:Demande au joueur de buy
			break;
		case CASE_INCOME_TAX:
			this.jeu.getJoueurs(this.jeu.getCurrentJoueur()).setArgent(this.jeu.getJoueurs(this.jeu.getCurrentJoueur()).getArgent() - 200);
			break;
		case CASE_LUXURY_TAX:
			this.jeu.getJoueurs(this.jeu.getCurrentJoueur()).setArgent(this.jeu.getJoueurs(this.jeu.getCurrentJoueur()).getArgent() - 100);
			break;
		case CASE_PASSAGE_PRISON:
			break;
		case CASE_PROPRIETE_ACHETABLE:
			//TODO:Demande au joueur de buy
			break;
		case CASE_SERVICE:
			//TODO:Paye batar
			break;
		case CASE_SERVICE_ACHETABLE:
			//TODO:Demande au joueur de buy
			break;
		case CASE_PROPRIETE:
			//TODO:Calculus dé maison + paye
		default:
			break;
		}
		
	}

}
