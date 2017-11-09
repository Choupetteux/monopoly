import javafx.scene.input.MouseEvent;
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

import java.util.ResourceBundle;
import info.util.javafx.FXUtil;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

/**
 * Classe contrôleur pour l'interface décrite dans le document <b>Monopoly.fxml</b>.
 *
 * Cette classe contient principalement les méthodes appelées en réaction aux événements utilisateur.  
 * Une instance de cette classe est créée automatiquement chaque fois que le document <b>Monopoly.fxml</b> est chargé.
 */
public class MonopolyController {
    @FXML
    private Stage stage;
    private ResourceBundle bundle;
    @FXML
    private ImageView plateauImg;
    @FXML
    private Button bouton;
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
    private ListView listeJoueur;
    
    
    /**
     * Constructeur.
     */
    public MonopolyController() {
        this.bundle = ResourceBundle.getBundle("Monopoly");
        
    }

    /**
     * Méthode invoquée automatiquement après instanciation de ce contrôleur par JavaFX.
     */
    @FXML
    protected void initialize() {
        this.encherePane.setOpacity(0);
        this.encherePane.setDisable(true);
        this.proprietePane.setOpacity(0);
        this.proprietePane.setDisable(true);
        ObservableList<String> joueurList = FXCollections.observableArrayList("Joueur 1", "fag");
        this.listeJoueur.setItems(joueurList);
          
          
    }
    
    /**
     * Méthode invoquée lorsque la fenêtre dont la scène est associée à ce contrôleur
     * est affichée.
     * Si nécessaire, complétez cette méthode pour exécuter du code après l'affichage de
     * la fenêtre.
     */
    @FXML
    public void onWindowShown() {
        
    }

    /**
     * Méthode invoquée lorsque la fenêtre dont la scène est associée à ce contrôleur
     * est sur le point d'être fermée par le système.
     * Si nécessaire, complétez cette méthode pour autoriser/empêcher la fermeture
     * de la fenêtre.
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
    public void onClickPropriete(){
        this.changePane("Propriété");
    }
    
    @FXML
    public void onClickCase(){
        this.changePane("Case");
    }
    
    @FXML
    public void changePane(String type){
        if(type.equals("Enchere")){
            
        }
        else if (type.equals("Propriété")){
            this.recapPane.setOpacity(0);
            this.recapPane.setDisable(true);
            this.encherePane.setOpacity(0);
            this.encherePane.setDisable(true);
            this.proprietePane.setOpacity(1);
            this.proprietePane.setDisable(false);
        }
        else if (type.equals("Case")){
            this.recapPane.setOpacity(0);
            this.recapPane.setDisable(true);
            this.encherePane.setOpacity(1);
            this.encherePane.setDisable(false);
            this.proprietePane.setOpacity(0);
            this.proprietePane.setDisable(true);
        }
    }

}
