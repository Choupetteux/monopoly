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

}
