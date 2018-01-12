package IHM;

import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.shape.Rectangle;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;

import java.io.File;
import java.lang.Class;
import java.lang.reflect.Field;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Label;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.ResourceBundle;

import org.w3c.dom.Node;

import Jeu.*;
import Case.*;
import IHM.XMLParser;
import Case.CasePropriete;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * Classe contrôleur pour l'interface décrite dans le document
 * <b>Monopoly.fxml</b>.
 *
 * Cette classe contient principalement les méthodes appelées en réaction aux
 * événements utilisateur. Une instance de cette classe est créée
 * automatiquement chaque fois que le document <b>Monopoly.fxml</b> est chargé.
 */
public class MonopolyController implements Observer {
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
	private ImageView couleurCase;

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
	private Button btnAcheter;
	@FXML
	private Button boutonSrvc12;
	@FXML
	private Button boutonSrvc28;
	@FXML
	private Button boutonGare5;
	@FXML
	private Button boutonGare15;
	@FXML
	private Button boutonGare25;
	@FXML
	private Button boutonGare35;
	@FXML
	private Button btnLancer;
	@FXML
	private Button btnPasAcheter;
	@FXML
	private Button btnPasserTour;

	@FXML
	private Label recapLabel;
	@FXML
	private Label prixMLabel;
	@FXML
	private Label loyerLabel;
	@FXML
	private Label hypothequeLabel;
	@FXML
	private Label proprieteLabel;
	@FXML
	private Label resLancer;
	@FXML
	private Label labelM;
	@FXML
	private Label labelPaye;
	@FXML
	private Label labelCasePane;
	@FXML
	private Label labelProprio;
	@FXML
	private Label argentJoueur;
	@FXML
	private Label joueurNom;
	@FXML
	private Label labelWhose;

	@FXML
	private Pane grid1;
	@FXML
	private Pane grid2;
	@FXML
	private Pane grid3;
	@FXML
	private Pane grid4;
	@FXML
	private Pane grid5;
	@FXML
	private Pane grid6;
	@FXML
	private Pane grid7;
	@FXML
	private Pane grid8;
	@FXML
	private Pane grid9;
	@FXML
	private Pane grid10;
	@FXML
	private Pane grid11;
	@FXML
	private Pane grid12;
	@FXML
	private Pane grid13;
	@FXML
	private Pane grid14;
	@FXML
	private Pane grid15;
	@FXML
	private Pane grid16;
	@FXML
	private Pane grid17;
	@FXML
	private Pane grid18;
	@FXML
	private Pane grid19;
	@FXML
	private Pane grid20;
	@FXML
	private Pane grid21;
	@FXML
	private Pane grid22;
	@FXML
	private Pane grid23;
	@FXML
	private Pane grid24;
	@FXML
	private Pane grid25;
	@FXML
	private Pane grid26;
	@FXML
	private Pane grid27;
	@FXML
	private Pane grid28;
	@FXML
	private Pane grid29;
	@FXML
	private Pane grid30;
	@FXML
	private Pane grid31;
	@FXML
	private Pane grid32;
	@FXML
	private Pane grid33;
	@FXML
	private Pane grid34;
	@FXML
	private Pane grid35;
	@FXML
	private Pane grid36;
	@FXML
	private Pane grid37;
	@FXML
	private Pane grid38;
	@FXML
	private Pane grid39;
	@FXML
	private Pane grid40;
	
	
	@FXML
	private ScrollPane recapPane;
	@FXML
	private ScrollPane encherePane;
	@FXML
	private ScrollPane proprietePane;
	@FXML
	private ScrollPane startPane;

	@FXML
	private ListView<String> listeJoueur;
	@FXML
	private GridPane plateauGrille;
	@FXML
	private TableView<CasePropriete> listPropriete;
	
	@FXML
	private TextField fieldJ1;
	@FXML
	private TextField fieldJ2;
	
	private Map<String, Pane> listPane = new HashMap<String, Pane>();

	private Image maison = new Image(MonopolyController.class.getResourceAsStream("house.png"));
	private Image vert = new Image(MonopolyController.class.getResourceAsStream("proprieteVerte2.jpeg"));
	private Image bleu = new Image(MonopolyController.class.getResourceAsStream("proprieteBleu.png"));
	private Image marron = new Image(MonopolyController.class.getResourceAsStream("proprieteMarron.png"));
	private Image magenta = new Image(MonopolyController.class.getResourceAsStream("proprieteMagenta.png"));
	private Image cyan = new Image(MonopolyController.class.getResourceAsStream("proprieteCyan.png"));
	private Image rouge = new Image(MonopolyController.class.getResourceAsStream("proprieteRouge.png"));
	private Image jaune = new Image(MonopolyController.class.getResourceAsStream("proprieteJaune.png"));
	private Image orange = new Image(MonopolyController.class.getResourceAsStream("proprieteOrange.png"));
	private Image services = new Image(MonopolyController.class.getResourceAsStream("proprieteServices.png"));
	private ImageView dog = new ImageView(new Image(MonopolyController.class.getResourceAsStream("dog.png")));
	private ImageView car = new ImageView(new Image(MonopolyController.class.getResourceAsStream("car.png")));

	private XMLParser parser = XMLParser.getParserInstance();
	private Jeu jeu;
	private String currentPane = "Récapitulatif";
	private boolean canBuy = false;
	private String typeBuy = "";
	//--Relatif aux popup below
	private FXMLLoader loaderPopup = new FXMLLoader(getClass().getResource("Popup.fxml"));
	private PopupController controllerPopup;
	private Stage stagePopup;
	private MediaPlayer musicPlayer;
	Media de = new Media(MonopolyController.class.getResource("lol.wav").toExternalForm());
	
	//Compteur demo
	public int demoCount;
	
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
		this.startPane.setOpacity(1);
		this.startPane.setDisable(false);
		this.recapPane.setOpacity(0);
		this.recapPane.setDisable(true);
		this.encherePane.setOpacity(0);
		this.encherePane.setDisable(true);
		this.proprietePane.setOpacity(0);
		this.proprietePane.setDisable(true);
		this.btnAcheter.setOpacity(0);
		this.btnPasAcheter.setOpacity(0);
		this.btnPasAcheter.setDisable(true);

		try {
		VBox root = (VBox) loaderPopup.load();
		this.controllerPopup = (PopupController) loaderPopup.getController();
		Scene scene = new Scene(root);
		this.stagePopup = new Stage();
		this.stagePopup.setScene(scene);
		} 
		catch(Exception e) {
			e.printStackTrace();
		}
		
		// Initialisation des méthodes associés aux boutons
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
		boutonSrvc12.setOnAction(e -> onClickService(12));
		boutonSrvc28.setOnAction(e -> onClickService(28));
		boutonGare5.setOnAction(e -> onClickGare(5));
		boutonGare15.setOnAction(e -> onClickGare(15));
		boutonGare25.setOnAction(e -> onClickGare(25));
		boutonGare35.setOnAction(e -> onClickGare(35));
		//Initialisation de la map et des grid
		this.listPane.put("grid1", grid1);
		this.listPane.put("grid2", grid2);
		this.listPane.put("grid3", grid3);
		this.listPane.put("grid4", grid4);
		this.listPane.put("grid5", grid5);
		this.listPane.put("grid6", grid6);
		this.listPane.put("grid7", grid7);
		this.listPane.put("grid8", grid8);
		this.listPane.put("grid9", grid9);
		this.listPane.put("grid10", grid10);
		this.listPane.put("grid11", grid11);
		this.listPane.put("grid12", grid12);
		this.listPane.put("grid13", grid13);
		this.listPane.put("grid14", grid14);
		this.listPane.put("grid15", grid15);
		this.listPane.put("grid15", grid15);
		this.listPane.put("grid16", grid16);
		this.listPane.put("grid17", grid17);
		this.listPane.put("grid18", grid18);
		this.listPane.put("grid19", grid19);
		this.listPane.put("grid20", grid20);
		this.listPane.put("grid21", grid21);
		this.listPane.put("grid22", grid22);
		this.listPane.put("grid23", grid23);
		this.listPane.put("grid24", grid24);
		this.listPane.put("grid25", grid25);
		this.listPane.put("grid26", grid26);
		this.listPane.put("grid27", grid27);
		this.listPane.put("grid28", grid28);
		this.listPane.put("grid29", grid29);
		this.listPane.put("grid30", grid30);
		this.listPane.put("grid31", grid31);
		this.listPane.put("grid32", grid32);
		this.listPane.put("grid33", grid33);
		this.listPane.put("grid34", grid34);
		this.listPane.put("grid35", grid35);
		this.listPane.put("grid36", grid36);
		this.listPane.put("grid37", grid37);
		this.listPane.put("grid38", grid38);
		this.listPane.put("grid39", grid39);
		this.listPane.put("grid40", grid40);
		//Ajout des pions sur la case départ.
		this.listPane.get("grid1").getChildren().add(dog);
		this.listPane.get("grid1").getChildren().add(car);
		//On bouge le pion pour ne pas les stacker
		this.listPane.get("grid1").getChildren().get(this.listPane.get("grid1").getChildren().indexOf(car)).setTranslateX(50);
	}
	
	private void deletePion(){
		switch(this.jeu.getCurrentJoueur()){
		case 0:
			this.listPane.get("grid" + (jeu.getJoueurs(jeu.getCurrentJoueur()).getPosition() + 1)).getChildren().remove(dog);
			break;
		case 1:
			this.listPane.get("grid" + (jeu.getJoueurs(jeu.getCurrentJoueur()).getPosition() + 1)).getChildren().remove(car);
			break;
		}
	}
	
	private void addPion(){
		switch(this.jeu.getCurrentJoueur()){
		case 0:
			this.listPane.get("grid" + (jeu.getJoueurs(jeu.getCurrentJoueur()).getPosition() + 1)).getChildren().add(dog);
			break;
		case 1:
			this.listPane.get("grid" + (jeu.getJoueurs(jeu.getCurrentJoueur()).getPosition() + 1)).getChildren().add(car);
			break;
		}
	}
	
	private void addMaison(Pane cible) {
		//Test methode, à implémenter pour placer les maisons aux bons endroits si time.
		ImageView house = new ImageView(this.maison);
		house.setFitWidth(30);
		house.setFitHeight(25);
		cible.getChildren().add(house);
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
	public void startGame(){
		//Vérification du formulaire des noms de joueurs
		if( fieldJ1.getText().isEmpty() && fieldJ2.getText().isEmpty()){
			this.jeu = new Jeu("Joueur 1", "Joueur 2", this, this);
		}
		else if( fieldJ2.getText().isEmpty() ){
			this.jeu = new Jeu(this.fieldJ1.getText(), "Joueur 2", this, this);
		}
		else if( fieldJ1.getText().isEmpty() ){
			this.jeu = new Jeu("Joueur 1", this.fieldJ2.getText(), this, this);
		}
		else{
			this.jeu = new Jeu(this.fieldJ1.getText(), this.fieldJ2.getText(), this, this);
		}
		//On retire le startPane pour mettre le pane de récapitulatif.
		this.startPane.setOpacity(0);
		this.startPane.setDisable(true);
		this.recapPane.setOpacity(1);
		this.recapPane.setDisable(false);
		this.btnPasserTour.setDisable(true);
		//On remplit la ListView avec les joueurs.
		ObservableList<String> joueurList = FXCollections.observableArrayList();
		for(int i = 0; i < this.jeu.getNbrJoueur(); i++){
			//TODO Maybe add "(1)" quand deux joueurs ont le même nom
			joueurList.add(this.jeu.getJoueurs(i).getNom());
		}
		TableColumn<CasePropriete, Rectangle> color = new TableColumn<CasePropriete, Rectangle>("");
		color.setMinWidth(27);
		color.setMaxWidth(22);
		color.setCellValueFactory(new PropertyValueFactory<>("squareColor"));
		
		
		TableColumn<CasePropriete, String> nom = new TableColumn<CasePropriete, String>("Propriété");
		nom.setMinWidth(200);
		nom.setCellValueFactory(
                new PropertyValueFactory<>("nom"));

        TableColumn<CasePropriete, Integer> loyer = new TableColumn<CasePropriete, Integer>("Loyer");
        loyer.setCellValueFactory(
                new PropertyValueFactory<>("loyer"));
        
        TableColumn<CasePropriete, Integer> nbMaison = new TableColumn<CasePropriete, Integer>("Nombre maison");
        nbMaison.setMinWidth(125);
        nbMaison.setCellValueFactory(new PropertyValueFactory<>("nbMaison"));

    	listPropriete.getColumns().addAll(color, nom, loyer, nbMaison);

        

		this.listeJoueur.setItems(joueurList);
		this.listeJoueur.setOnMouseClicked(new EventHandler<MouseEvent>() {

	        @Override
	        public void handle(MouseEvent event) {
	        	joueurNom.setText(listeJoueur.getSelectionModel().getSelectedItem());
	        	argentJoueur.setText(jeu.getJoueurFromNom(listeJoueur.getSelectionModel().getSelectedItem()).getArgent() + " €");
	        	ObservableList<CasePropriete> lol = FXCollections.observableArrayList();
	        	for(CasePropriete prop : jeu.getJoueurFromNom(listeJoueur.getSelectionModel().getSelectedItem()).getProprietes()){
	        		lol.add(prop);
	        	}
	        	//TODO Populate TableView
	        	listPropriete.setItems(lol);
	        }
	    });

		this.labelWhose.setText("Tour de " + this.jeu.getJoueurs(this.jeu.getCurrentJoueur()).getNom());
		
		
		//test
	}
	
	public Button getBtnLancer(){
		return this.btnLancer;
	}

	@FXML
	public void onClickPropriete(int index) {
		CasePropriete caseProp = (CasePropriete) this.jeu.getPlateau().getCase(index);
		this.labelPaye.setText("Loyer :");
		this.labelM.setText("Nombre maison : ");
		this.labelCasePane.setText("Propriété");
		this.proprieteLabel.setText(caseProp.getNom());
		// -------------------------------------------------------------------
		// Changement couleur case
		if (caseProp.getGroupeCouleur().equals("bleu")) {
			this.couleurCase.setImage(bleu);
		} else if (caseProp.getGroupeCouleur().equals("vert")) {
			this.couleurCase.setImage(vert);
		} else if (caseProp.getGroupeCouleur().equals("jaune")) {
			this.couleurCase.setImage(jaune);
		} else if (caseProp.getGroupeCouleur().equals("rouge")) {
			this.couleurCase.setImage(rouge);
		} else if (caseProp.getGroupeCouleur().equals("orange")) {
			this.couleurCase.setImage(orange);
		} else if (caseProp.getGroupeCouleur().equals("violet")) {
			this.couleurCase.setImage(magenta);
		} else if (caseProp.getGroupeCouleur().equals("mauve")) {
			this.couleurCase.setImage(marron);
		} else if (caseProp.getGroupeCouleur().equals("azur")) {
			this.couleurCase.setImage(cyan);
		}
		// ------------------------------------------------------------------
		// Changement des différentes informations
		this.loyerLabel.setText(Integer.toString(caseProp.getLoyer()) + "€");
		this.prixMLabel.setText("" + caseProp.getNbMaison());
		this.btnAcheter.setText("Acheter : " + Integer.toString(caseProp.getPrixAchat()) + "€");
		this.hypothequeLabel.setText(Integer.toString(caseProp.getPrixHypotheque()) + "€");
		if(caseProp.getProprietaire() == null){
			this.labelProprio.setText("Pas de propriétaire.");
		}
		else{
			this.labelProprio.setText("" + caseProp.getProprietaire().getNom());
		}
		this.displayBtnIfPlayerCanBuy(index);
		this.changePane("Propriété");
		this.currentPane = "Propriété";
		
	}
	
	public void displayBtnIfPlayerCanBuy(int index){
		if (this.canBuy && this.jeu.getJoueurs(this.jeu.getCurrentJoueur()).getPosition() == index){
			this.btnAcheter.setOpacity(1);
			this.btnAcheter.setDisable(false);
			this.btnPasAcheter.setOpacity(1);
			this.btnPasAcheter.setDisable(false);
		}
		else{
			this.btnAcheter.setOpacity(0);
			this.btnAcheter.setDisable(true);
			this.btnPasAcheter.setOpacity(0);
			this.btnPasAcheter.setDisable(true);
		}
	}
	
	@FXML
	public void onClickService(int index){
		if(index == 12){
			this.proprieteLabel.setText("Électricité");
		}
		else if(index == 28){
			this.proprieteLabel.setText("Eau");
		}
		CaseService caseService = (CaseService)this.jeu.getPlateau().getCase(index);
		this.labelCasePane.setText("Service");
		this.labelM.setText("Multiplicateur : ");
		if(caseService.getProprietaire() == null){
			this.labelProprio.setText("Pas de propriétaire.");
		}
		else{
			this.labelProprio.setText("" + caseService.getProprietaire());
		}
		this.labelPaye.setText("Facture : ");
		//TODO set Facture quand un joueur arrive dessus.
		this.loyerLabel.setText("");
		this.hypothequeLabel.setText(caseService.getPrixHypotheque() + "€");
		//TODO set multiplicateur
		this.prixMLabel.setText("");
		this.couleurCase.setImage(services);
		this.changePane("Propriété");
		this.currentPane = "Propriété";
	}
	
	@FXML
	public void onClickGare(int index){
		CaseGare caseGare = (CaseGare) this.jeu.getPlateau().getCase(index);
		this.proprieteLabel.setText(caseGare.getNom());
		if(caseGare.getProprietaire() == null){
			this.labelProprio.setText("Pas de propriétaire.");
		}
		else{
			this.labelProprio.setText("" + caseGare.getProprietaire().getNom());
		}
		this.labelPaye.setText("Prix : " + caseGare.getPrixAchat() + "€");
		//TODO set Facture quand un joueur arrive dessus.
		this.loyerLabel.setText("");
		this.hypothequeLabel.setText(caseGare.getPrixHypotheque() + "€");
		//TODO set multiplicateur
		this.labelM.setText("Prix du billet : ");
		this.prixMLabel.setText(" " + caseGare.getLoyer() + "€");
		this.couleurCase.setImage(services);
		this.displayBtnIfPlayerCanBuy(index);
		this.changePane("Propriété");
		this.currentPane = "Propriété";
	}

	@FXML
	public void onClickRecapitulatif() {
		this.changePane("Recapitulatif");
	}
	
	@FXML
	public void onClickAcheter(){
		if(this.typeBuy.equals("Propriete")){
			int compteur = 0;
			int compteurSameProprietaire = 0;
			CasePropriete caseProp = (CasePropriete) this.jeu.getPlateau().getCase(this.jeu.getJoueurs(this.jeu.getCurrentJoueur()).getPosition());
			this.jeu.getJoueurs(this.jeu.getCurrentJoueur()).acheterPropriete(caseProp);
			this.canBuy = false;
			this.onClickPropriete(this.jeu.getJoueurs(this.jeu.getCurrentJoueur()).getPosition());
			for(CasePropriete caseP : caseProp.getGroupePropriete(caseProp.getGroupeCouleur())) {
				if(caseP.getProprietaire() != null) {
					compteur++;
				}
				if(caseP.getProprietaire() == this.jeu.getJoueurs(this.jeu.getCurrentJoueur())) {
					compteurSameProprietaire++;
				}
			}
			if(compteur == caseProp.getGroupePropriete(caseProp.getGroupeCouleur()).size()) {
				for(CasePropriete caseP : caseProp.getGroupePropriete(caseProp.getGroupeCouleur())) {
					caseP.incrementNbMaison();
				}
			}
			if(compteurSameProprietaire == caseProp.getGroupePropriete(caseProp.getGroupeCouleur()).size()) {
				for(CasePropriete caseP : caseProp.getGroupePropriete(caseProp.getGroupeCouleur())) {
					caseP.incrementNbMaison();
				}
			}
		}
		else if (this.typeBuy.equals("Gare")){
			this.jeu.getJoueurs(this.jeu.getCurrentJoueur()).acheterGare((CaseGare) this.jeu.getPlateau().getCase(this.jeu.getJoueurs(this.jeu.getCurrentJoueur()).getPosition()));
			this.canBuy = false;
			this.onClickGare(this.jeu.getJoueurs(this.jeu.getCurrentJoueur()).getPosition());
		}
	}
	
	@FXML
	public void onClickPasAcheter() {
		this.changePane("Enchere");
		this.currentPane = "Enchere";
	}

	@FXML
	public void onClickBackToCurrent() {
		this.onClickPropriete(this.jeu.getJoueurs(this.jeu.getCurrentJoueur()).getPosition());
	}
	
	public boolean getCanBuy(){
		return this.canBuy;
	}
	
	@FXML
	public void btnLancerDes() {
		this.musicPlayer = new MediaPlayer(de);
		this.musicPlayer.play();
		int[] arrayDe1 = {1,4,6,1,1,5,1,1,2,6,2,2,6,3};
		int[] arrayDe2 = {3,5,4,2,3,6,1,1,1,4,2,4,2,1};
		int valeurDe1 = arrayDe1[this.demoCount];
		int valeurDe2 = arrayDe2[this.demoCount];
		/**
		for (int i = 0; i < 2; i++) {
			jeu.getDes(i).relancerDe();
		}
		**/
		switch (valeurDe1/**this.jeu.getDes(0).getLancer()**/) {
		case 1:
			this.de1.setImage(new Image(MonopolyController.class.getResourceAsStream("Dice1.gif")));
			break;
		case 2:
			this.de1.setImage(new Image(MonopolyController.class.getResourceAsStream("Dice2.gif")));
			break;
		case 3:
			this.de1.setImage(new Image(MonopolyController.class.getResourceAsStream("Dice3.gif")));
			break;
		case 4:
			this.de1.setImage(new Image(MonopolyController.class.getResourceAsStream("Dice4.gif")));
			break;
		case 5:
			this.de1.setImage(new Image(MonopolyController.class.getResourceAsStream("Dice5.gif")));
			break;
		case 6:
			this.de1.setImage(new Image(MonopolyController.class.getResourceAsStream("Dice6.gif")));
			break;
		}
		switch (valeurDe2/**this.jeu.getDes(1).getLancer()**/) {
		case 1:
			this.de2.setImage(new Image(MonopolyController.class.getResourceAsStream("Dice1.gif")));
			break;
		case 2:
			this.de2.setImage(new Image(MonopolyController.class.getResourceAsStream("Dice2.gif")));
			break;
		case 3:
			this.de2.setImage(new Image(MonopolyController.class.getResourceAsStream("Dice3.gif")));
			break;
		case 4:
			this.de2.setImage(new Image(MonopolyController.class.getResourceAsStream("Dice4.gif")));
			break;
		case 5:
			this.de2.setImage(new Image(MonopolyController.class.getResourceAsStream("Dice5.gif")));
			break;
		case 6:
			this.de2.setImage(new Image(MonopolyController.class.getResourceAsStream("Dice6.gif")));
			break;
		}
		this.resLancer.setText((valeurDe1 + valeurDe2) + "");
		this.btnLancer.setDisable(true);
		this.deletePion();
		this.jeu.updateCurrentPos();
		this.addPion();
		if(this.jeu.getTour() == 0){
			this.listPane.get("grid1").getChildren().get(this.listPane.get("grid1").getChildren().indexOf(car)).setTranslateX(5);
		}
		this.jeu.jouerTour();
		this.btnPasserTour.setDisable(false);
		this.demoCount++;
	}
	
	@FXML
	public void onClickPasserTour(){
		this.jeu.passerTour();
		this.labelWhose.setText("Tour de " + this.jeu.getJoueurs(this.jeu.getCurrentJoueur()).getNom());
		this.btnPasserTour.setDisable(true);
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
		EventMonopoly event = (EventMonopoly) arg;
		switch (event.type) {
		case CASE_GO_PRISON:
			this.deletePion();
			this.jeu.getJoueurs(this.jeu.getCurrentJoueur()).mettreEnPrison();
			this.addPion();
		case ACHAT_PROPRIETE_REJECT:
			this.changePane("Enchere");
			// TODO:
			break;
		case CASE_CCC:
			this.jeu.getPlateau().piocherCommunaute();
			break;
		case CASE_CHANCE:
			this.jeu.getPlateau().piocherChance();
			break;
		case CASE_DEPART:
			this.jeu.getJoueurs(this.jeu.getCurrentJoueur())
					.setArgent(this.jeu.getJoueurs(this.jeu.getCurrentJoueur()).getArgent() + 200);
			break;
		case CASE_GARE:
			try {
				CaseGare caseActuelle = (CaseGare) this.jeu.getPlateau().getCase(this.jeu.getJoueurs(jeu.getCurrentJoueur()).getPosition());
				this.controllerPopup.setLabel("Vous avez payé " + caseActuelle.getLoyer() + "€ de train à " + caseActuelle.getProprietaire().getNom() + ".");
				this.stagePopup.setTitle("Payement de train");
				this.controllerPopup.setImgDescPayement();
				this.stagePopup.show();
				this.stagePopup.sizeToScene();
				stagePopup.setAlwaysOnTop(true);
			} catch(Exception e) {
				e.printStackTrace();
			}
			break;
		case CASE_GARE_ACHETABLE:
			this.onClickGare(this.jeu.getJoueurs(this.jeu.getCurrentJoueur()).getPosition());
			this.btnAcheter.setOpacity(1);
			this.btnAcheter.setDisable(false);
			this.btnPasAcheter.setOpacity(1);
			this.btnPasAcheter.setDisable(false);
			this.canBuy = true;
			this.typeBuy = "Gare";
			break;
		case CASE_INCOME_TAX:
			this.jeu.getJoueurs(this.jeu.getCurrentJoueur())
					.setArgent(this.jeu.getJoueurs(this.jeu.getCurrentJoueur()).getArgent() - 200);
			break;
		case CASE_LUXURY_TAX:
			this.jeu.getJoueurs(this.jeu.getCurrentJoueur())
					.setArgent(this.jeu.getJoueurs(this.jeu.getCurrentJoueur()).getArgent() - 100);
			break;
		case CASE_PASSAGE_PRISON:
			break;
		case CASE_PROPRIETE_ACHETABLE:
			this.onClickPropriete(this.jeu.getJoueurs(this.jeu.getCurrentJoueur()).getPosition());
			this.btnAcheter.setOpacity(1);
			this.btnAcheter.setDisable(false);
			this.btnPasAcheter.setOpacity(1);
			this.btnPasAcheter.setDisable(false);
			this.canBuy = true;
			this.typeBuy = "Propriete";
			break;
		case CASE_SERVICE:
			// TODO:Paye batar
			break;
		case CASE_SERVICE_ACHETABLE:
			// TODO:Demande au joueur de buy
			break;
		case CASE_PROPRIETE:
				CasePropriete caseActuelle = (CasePropriete) this.jeu.getPlateau().getCase(this.jeu.getJoueurs(jeu.getCurrentJoueur()).getPosition());
				this.controllerPopup.setLabel("Vous avez payé " + caseActuelle.getLoyer() + "€ de loyer à " + caseActuelle.getProprietaire().getNom() + ".");
				this.stagePopup.setTitle("Payement de loyer");
				this.controllerPopup.setImgDescPayement();
				//this.addMaison(this.listPane.get("grid" + (this.jeu.getJoueurs(jeu.getCurrentJoueur()).getPosition() + 1)));
				this.stagePopup.show();
				this.stagePopup.sizeToScene();
				stagePopup.setAlwaysOnTop(true);
		break;
		default:
			break;
		}

	}

}
