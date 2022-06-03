package Controllers;

import java.io.IOException;

import com.jfoenix.controls.JFXButton;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AudiR8Controller {
	

    @FXML
    private JFXButton Back;

	

    @FXML
    private JFXButton TestDrive;
	

    @FXML
    private JFXButton Book;

    @FXML
    void BookNow(ActionEvent event) throws IOException {
    	
    	    Book.getScene().getWindow().hide();
        	
        	Stage home = new Stage();	    	
        	Parent root = FXMLLoader.load(getClass().getResource("/FXML/Payment.fxml"));
        	Scene scene = new Scene(root);
        	home.setScene(scene);
        	home.show();

     }
    
    @FXML
    void TestDrivePage(ActionEvent e) throws IOException {
    	
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
    	Parent root = FXMLLoader.load(getClass().getResource("/FXML/Audi.fxml"));
    	Scene scene = new Scene(root);
    	home.setScene(scene);
    	home.show();

    }

    }


