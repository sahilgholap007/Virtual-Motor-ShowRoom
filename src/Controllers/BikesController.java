package Controllers;

import java.io.IOException;

import com.jfoenix.controls.JFXButton;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BikesController {
	
    @FXML
    private JFXButton Home;
    
    @FXML
    private JFXButton BMW;
    
    @FXML
    private JFXButton HD;

    @FXML
    void HomePage(ActionEvent event) throws IOException {
	Home.getScene().getWindow().hide();
      	
      	Stage home = new Stage();	    	
      	Parent root = FXMLLoader.load(getClass().getResource("/FXML/HomePage.fxml"));
      	Scene scene = new Scene(root);
      	home.setScene(scene);
      	home.show();

    }
    
    @FXML
    void BMW(ActionEvent event) throws IOException {
    	
        BMW.getScene().getWindow().hide();
      	
      	Stage home = new Stage();	    	
      	Parent root = FXMLLoader.load(getClass().getResource("/FXML/BMW.fxml"));
      	Scene scene = new Scene(root);
      	home.setScene(scene);
      	home.show();

    }
    
    @FXML
    void HD(ActionEvent event) throws IOException {
    	
        HD.getScene().getWindow().hide();
      	
      	Stage home = new Stage();	    	
      	Parent root = FXMLLoader.load(getClass().getResource("/FXML/HarleyDavidson.fxml"));
      	Scene scene = new Scene(root);
      	home.setScene(scene);
      	home.show();


    }


}
