package Controllers;

import java.io.IOException;

import com.jfoenix.controls.JFXButton;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AudiController {
	
	@FXML
	private JFXButton AudiQ8;
	
    @FXML
    private JFXButton AudiR8;
	
    @FXML
    private JFXButton AudiA7;
	
    @FXML
    private JFXButton Back;

    @FXML
    void CarsPage(ActionEvent event) throws IOException {
    	
    	Back.getScene().getWindow().hide();
       	
       	Stage home = new Stage();	    	
       	Parent root = FXMLLoader.load(getClass().getResource("/FXML/CarBrands.fxml"));
       	Scene scene = new Scene(root);
       	home.setScene(scene);
       	home.show();

    }
    

    @FXML
    void AudiA7Page(ActionEvent event) throws IOException {
    	
    	AudiA7.getScene().getWindow().hide();
       	
       	Stage home = new Stage();	    	
       	Parent root = FXMLLoader.load(getClass().getResource("/FXML/AudiA7.fxml"));
       	Scene scene = new Scene(root);
       	home.setScene(scene);
       	home.show();

    }
    

    @FXML
    void AudiR8Page(ActionEvent event) throws IOException {
    	
        AudiR8.getScene().getWindow().hide();
       	
       	Stage home = new Stage();	    	
       	Parent root = FXMLLoader.load(getClass().getResource("/FXML/AudiR8.fxml"));
       	Scene scene = new Scene(root);
       	home.setScene(scene);
       	home.show();


    }
    

    @FXML
    void AudiQ8Page(ActionEvent event) throws IOException {
    	
        AudiQ8.getScene().getWindow().hide();
       	
       	Stage home = new Stage();	    	
       	Parent root = FXMLLoader.load(getClass().getResource("/FXML/AudiQ8.fxml"));
       	Scene scene = new Scene(root);
       	home.setScene(scene);
       	home.show();

    }
    
}
