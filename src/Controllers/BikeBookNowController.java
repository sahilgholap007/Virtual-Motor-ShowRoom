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
import javafx.stage.Stage;

public class BikeBookNowController implements Initializable{

    @FXML
    private JFXButton previous;
    
    @FXML
    private JFXTextField name;
    
    @FXML
    private JFXButton Book;

    @FXML
    void previous(ActionEvent event) throws IOException {
    	
    	previous.getScene().getWindow().hide();
     	
     	Stage home = new Stage();	    	
     	Parent root = FXMLLoader.load(getClass().getResource("/FXML/BikeBrands.fxml"));
     	Scene scene = new Scene(root);
     	home.setScene(scene);
     	home.show();

    }

    @FXML
    void Book(ActionEvent event) throws IOException {
    	
    	Book.getScene().getWindow().hide();
    	
    	Stage home = new Stage();	    	
    	Parent root = FXMLLoader.load(getClass().getResource("/FXML/Payment.fxml"));
    	Scene scene = new Scene(root);
    	home.setScene(scene);
    	home.show();


    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}
}
