package Controllers;

import java.io.IOException;

import com.jfoenix.controls.JFXButton;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AudiA7Controller {
	

    @FXML
    private JFXButton TestDrive;
	

    @FXML
    private JFXButton BookNow;
	
    @FXML
    private JFXButton Back;

    @FXML
    void PreviousPage(ActionEvent event) throws IOException {
    	
        Back.getScene().getWindow().hide();
       	
       	Stage home = new Stage();	    	
       	Parent root = FXMLLoader.load(getClass().getResource("/FXML/Audi.fxml"));
       	Scene scene = new Scene(root);
       	home.setScene(scene);
       	home.show();

    }
    

    @FXML
    void Booking(ActionEvent event) throws IOException {
    	
    	    BookNow.getScene().getWindow().hide();
         	
         	Stage home = new Stage();	    	
         	Parent root = FXMLLoader.load(getClass().getResource("/FXML/Payment.fxml"));
         	Scene scene = new Scene(root);
         	home.setScene(scene);
         	home.show();


    }
    
    @FXML
    void TestDrivePage(ActionEvent event) throws IOException {
    	
    	TestDrive.getScene().getWindow().hide();
     	
     	Stage home = new Stage();	    	
     	Parent root = FXMLLoader.load(getClass().getResource("/FXML/TestDrive.fxml"));
     	Scene scene = new Scene(root);
     	home.setScene(scene);
     	home.show();

    }

}
