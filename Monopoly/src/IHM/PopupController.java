package IHM;

import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
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


public class PopupController {
	@FXML
	private Label labelHappen;
	
	@FXML
	private Button btnOk;
	
	@FXML
	private ImageView imgDesc;
	private Image payement = new Image("IHM/payement.png");
	
	@FXML
	public void setLabel(String text){
		this.labelHappen.setText(text);
	}
	
	@FXML
	public void setImgDescPayement() {
		this.imgDesc.setImage(payement);
		this.imgDesc.setTranslateX(100);
	}
	
	@FXML
	private void onClickBtnOk(){
		Stage stage = (Stage) btnOk.getScene().getWindow();
		stage.close();
	}
}
