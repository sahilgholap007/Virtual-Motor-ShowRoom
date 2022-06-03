package Controllers;

import java.io.IOException;

import com.jfoenix.controls.JFXButton;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class RollsRoyceCullinanController {

    @FXML
    private JFXButton Back;
    
    @FXML
    private JFXButton TestDrive;
    

    @FXML
    private JFXButton BookNow;

    
    @FXML
    void TestDrive(ActionEvent event) throws IOException {
    	
    	TestDrive.getScene().getWindow().hide();
       	
       	Stage home = new Stage();	    	
       	Parent root = FXMLLoader.load(getClass().getResource("/FXML/TestDrive.fxml"));
       	Scene scene = new Scene(root);
       	home.setScene(scene);
       	home.show();

    }

    @FXML
    void Back(ActionEvent event) throws IOException {
    	
        Back.getScene().getWindow().hide();
      	
      	Stage home = new Stage();	    	
      	Parent root = FXMLLoader.load(getClass().getResource("/FXML/RollsRoyce.fxml"));
      	Scene scene = new Scene(root);
      	home.setScene(scene);
      	home.show();

    }
    
    @FXML
    void BookNow(ActionEvent event) throws IOException {
    	
        BookNow.getScene().getWindow().hide();
      	
      	Stage home = new Stage();	    	
      	Parent root = FXMLLoader.load(getClass().getResource("/FXML/Payment.fxml"));
      	Scene scene = new Scene(root);
      	home.setScene(scene);
      	home.show();

    }

}
