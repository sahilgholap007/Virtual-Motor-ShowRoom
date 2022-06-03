package Controllers;

import java.io.IOException;

import com.jfoenix.controls.JFXButton;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class RollsRoyceController {
	
    @FXML
    private JFXButton Dawn;	

    @FXML
    private JFXButton Cullinan;
	
    @FXML
    private JFXButton Back;
    
    @FXML
    private JFXButton Phantom;

    @FXML
    void Back(ActionEvent event) throws IOException {
    	
        Back.getScene().getWindow().hide();
      	
      	Stage home = new Stage();	    	
      	Parent root = FXMLLoader.load(getClass().getResource("/FXML/CarBrands.fxml"));
      	Scene scene = new Scene(root);
      	home.setScene(scene);
      	home.show();

    }
    

    @FXML
    void OpenPage(ActionEvent event) throws IOException {
    	
        Cullinan.getScene().getWindow().hide();
      	
      	Stage home = new Stage();	    	
      	Parent root = FXMLLoader.load(getClass().getResource("/FXML/RollsRoyceCullinan.fxml"));
      	Scene scene = new Scene(root);
      	home.setScene(scene);
      	home.show();

    }
    
    @FXML
    void RollsRoyceDawn(ActionEvent event) throws IOException {
    	
        Dawn.getScene().getWindow().hide();
      	
      	Stage home = new Stage();	    	
      	Parent root = FXMLLoader.load(getClass().getResource("/FXML/RollsRoyceDawn.fxml"));
      	Scene scene = new Scene(root);
      	home.setScene(scene);
      	home.show();

    }
    

    @FXML
    void Phantom(ActionEvent event) throws IOException {
    	
        Phantom.getScene().getWindow().hide();
      	
      	Stage home = new Stage();	    	
      	Parent root = FXMLLoader.load(getClass().getResource("/FXML/RollsRoycePhantom.fxml"));
      	Scene scene = new Scene(root);
      	home.setScene(scene);
      	home.show();

    }

    
    

}
