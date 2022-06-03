package Controllers;

import java.io.IOException;

import com.jfoenix.controls.JFXButton;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BMWController {
	
    @FXML
    private JFXButton F900R;
    
    @FXML
    private JFXButton R18;
    
    @FXML
    private JFXButton Back;
    
    @FXML
    private JFXButton G310R;

    @FXML
    void f900r(ActionEvent event) throws IOException {
    	
        F900R.getScene().getWindow().hide();
      	
      	Stage home = new Stage();	    	
      	Parent root = FXMLLoader.load(getClass().getResource("/FXML/BMWF900R.fxml"));
      	Scene scene = new Scene(root);
      	home.setScene(scene);
      	home.show();

    }
    
    @FXML
    void back(ActionEvent event) throws IOException {
    	
        Back.getScene().getWindow().hide();
      	
      	Stage home = new Stage();	    	
      	Parent root = FXMLLoader.load(getClass().getResource("/FXML/BikeBrands.fxml"));
      	Scene scene = new Scene(root);
      	home.setScene(scene);
      	home.show();

    }
    
    
    @FXML
    void R18(ActionEvent event) throws IOException {
    	
        R18.getScene().getWindow().hide();
      	
      	Stage home = new Stage();	    	
      	Parent root = FXMLLoader.load(getClass().getResource("/FXML/BMW R 18.fxml"));
      	Scene scene = new Scene(root);
      	home.setScene(scene);
      	home.show();

    }
    
    @FXML
    void G310R(ActionEvent event) throws IOException {
    	
    	G310R.getScene().getWindow().hide();
      	
      	Stage home = new Stage();	    	
      	Parent root = FXMLLoader.load(getClass().getResource("/FXML/BMWG310R.fxml"));
      	Scene scene = new Scene(root);
      	home.setScene(scene);
      	home.show();

    }


}
