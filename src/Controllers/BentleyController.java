package Controllers;

import java.io.IOException;

import com.jfoenix.controls.JFXButton;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BentleyController {
	
    @FXML
    private JFXButton Mulsanne;
	
    @FXML
    private JFXButton Bentayga;

    @FXML
    private JFXButton FlyingSpur;
	
    @FXML
    private JFXButton Back;

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
    void Bentayga(ActionEvent event) throws IOException {
    	
    	Bentayga.getScene().getWindow().hide();
    	
    	Stage home = new Stage();	    	
    	Parent root = FXMLLoader.load(getClass().getResource("/FXML/Bentayga.fxml"));
    	Scene scene = new Scene(root);
    	home.setScene(scene);
    	home.show();


    }

    @FXML
    void FlyingSpur(ActionEvent event) throws IOException {
    	
    	FlyingSpur.getScene().getWindow().hide();
    	
    	Stage home = new Stage();	    	
    	Parent root = FXMLLoader.load(getClass().getResource("/FXML/Bentley FlyingSpur.fxml"));
    	Scene scene = new Scene(root);
    	home.setScene(scene);
    	home.show();


    }
    

    @FXML
    void Mulsanne(ActionEvent event) throws IOException {
    	
    	FlyingSpur.getScene().getWindow().hide();
    	
    	Stage home = new Stage();	    	
    	Parent root = FXMLLoader.load(getClass().getResource("/FXML/Bentley mulsanne.fxml"));
    	Scene scene = new Scene(root);
    	home.setScene(scene);
    	home.show();

    }



}
