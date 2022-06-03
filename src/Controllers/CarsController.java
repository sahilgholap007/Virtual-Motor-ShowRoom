package Controllers;

import java.io.IOException;

import com.jfoenix.controls.JFXButton;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CarsController {
	
    @FXML
    private JFXButton Home;
    

    @FXML
    private JFXButton RollsRoyce;
    

    @FXML
    private JFXButton Audi;
    
    @FXML
    private JFXButton Bentley;



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
    void rolls(ActionEvent event) throws IOException {
    	
        RollsRoyce.getScene().getWindow().hide();
      	
      	Stage home = new Stage();	    	
      	Parent root = FXMLLoader.load(getClass().getResource("/FXML/RollsRoyce.fxml"));
      	Scene scene = new Scene(root);
      	home.setScene(scene);
      	home.show();
    }
    
    

    @FXML
    void AudiPage(ActionEvent event) throws IOException {
    	
    	    Audi.getScene().getWindow().hide();
        	
        	Stage home = new Stage();	    	
        	Parent root = FXMLLoader.load(getClass().getResource("/FXML/Audi.fxml"));
        	Scene scene = new Scene(root);
        	home.setScene(scene);
        	home.show();

    }
    
    @FXML
    void Bentley(ActionEvent event) throws IOException {
    	
	    Bentley.getScene().getWindow().hide();
    	
    	Stage home = new Stage();	    	
    	Parent root = FXMLLoader.load(getClass().getResource("/FXML/Bentley.fxml"));
    	Scene scene = new Scene(root);
    	home.setScene(scene);
    	home.show();


    }

}
