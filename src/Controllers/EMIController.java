package Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

public class EMIController implements Initializable {
	
    @FXML
    private JFXButton logout;

    @FXML
    private JFXButton booknow;

    @FXML
    private ToggleGroup emi;
    
    @FXML
    private JFXTextField name;

    @FXML
    void booknow(ActionEvent event) throws IOException {
    	
	    booknow.getScene().getWindow().hide();
    	
    	Stage home = new Stage();	    	
    	Parent root = FXMLLoader.load(getClass().getResource("/FXML/BookNow.fxml"));
    	Scene scene = new Scene(root);
    	home.setScene(scene);
    	home.show(); 


    }

    @FXML
    void logout(ActionEvent event) throws IOException {
    	
	    logout.getScene().getWindow().hide();
    	
    	Stage home = new Stage();	    	
    	Parent root = FXMLLoader.load(getClass().getResource("/FXML/LoginMain.fxml"));
    	Scene scene = new Scene(root);
    	home.setScene(scene);
    	home.show(); 


    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		name.setStyle("-fx-text-inner-color: white");
		
		
	}

}
