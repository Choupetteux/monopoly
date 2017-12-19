package IHM;
import java.util.ResourceBundle;
import info.util.javafx.FXUtil;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.stage.WindowEvent;

/**
 * Point d'entrée de l'application.
 * 
 * Lorsqu'une application JavaFX est lancée (à l'aide la méthode {@link #launch
 * launch}), les opérations suivantes sont effectuées <u>automatiquement</u> :
 * <ol>
 * <li>Construction d'une instance de cette classe à l'aide du constructeur par
 * défaut
 * <li>Invocation de la méthode {@link #init init} pour les initialisations non graphiques
 * <li>Invocation de la méthode {@link #start start} pour initialiser la fenêtre principale de l'application
 * <li>Attente de la fin de l'exécution de l'application ...
 * <li>Invocation de la méthode {@link #stop stop} pour libérer les ressources utilisées par l'application
 * </ol>
 */
public class MonopolyApplication extends Application {

    /* (non-Javadoc)
     * @see javafx.application.Application#start(javafx.stage.Stage)
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Monopoly.fxml"), ResourceBundle.getBundle("IHM.Monopoly"));
            
            Parent root = loader.load();

            FXUtil.associate(loader.getController(), primaryStage);
            primaryStage.setTitle("Monopoly");
            primaryStage.setScene(new Scene(root));
            primaryStage.setResizable(false);
            Platform.setImplicitExit(false);


            // décommentez la ligne ci-dessous et remplacez "votre_icone" par
            // le nom d'une image ajoutée aux ressources de votre application
            // primaryStage.getIcons().add(new Image("votre_icone"));
            
            //Création d'une boite de dialogue et association du FXML associé.
            Scene scene = new Scene(FXMLLoader.load(getClass().getResource("dialogue.fxml")));
            Stage popup = new Stage();
            popup.setScene(scene);
            popup.show();
            //Quand le dialogue est caché, appelle l'affichage de la fenêtre principale.
            popup.setOnHidden(new EventHandler<WindowEvent>() {

				@Override
				public void handle(WindowEvent event) {
	                primaryStage.show();
					
				}
            });

        }
        catch (Exception e) {
            System.err.println(e.getMessage());
            System.err.println(e.getCause());
            e.printStackTrace();
            System.exit(0);
        }
    }

    /**
     * Méthode appelée automatiquement à la <b>fin de l'exécution</b> de
     * l'application.
     */
    @Override
    public void stop() throws Exception {
        /* libération des ressources de l'application */

        System.exit(0);
    }

    /**
     * Programme principal.
     */
    public static void main(String[] args) {
        // décommentez la ligne ci-dessous pour remplacer la langue par défaut par l'anglais
        // Locale.setDefault(Locale.ENGLISH);
        
        Application.launch(args);
    }
}
