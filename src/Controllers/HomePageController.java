package Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HomePageController implements Initializable {
	
	   @FXML
	    private JFXButton Logout;
	   
	    @FXML
	    private JFXButton Cars;
	    
	    @FXML
	    private JFXButton Bikes;



	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	
		
	}
	
    @FXML
    void logout(ActionEvent event) throws IOException {
    	
    	Logout.getScene().getWindow().hide();
    	
    	Stage home = new Stage();	    	
    	Parent root = FXMLLoader.load(getClass().getResource("/FXML/LoginMain.fxml"));
    	Scene scene = new Scene(root);
    	home.setScene(scene);
    	home.show();
    	

    }
    
    @FXML
    void CarBrands(ActionEvent event) throws IOException {
    	
	    Cars.getScene().getWindow().hide();
    	
    	Stage home = new Stage();	    	
    	Parent root = FXMLLoader.load(getClass().getResource("/FXML/CarBrands.fxml"));
    	Scene scene = new Scene(root);
    	home.setScene(scene);
    	home.show();

    }
    
        @FXML
        void BikeBrands(ActionEvent event) throws IOException {
    	
        Bikes.getScene().getWindow().hide();
    	
    	Stage home = new Stage();	    	
    	Parent root = FXMLLoader.load(getClass().getResource("/FXML/BikeBrands.fxml"));
    	Scene scene = new Scene(root);
    	home.setScene(scene);
    	home.show();

    }

}
