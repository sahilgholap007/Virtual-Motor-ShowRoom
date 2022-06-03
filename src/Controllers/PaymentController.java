package Controllers;

import java.io.IOException;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXRadioButton;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

public class PaymentController {
	
    @FXML
    private JFXRadioButton Credit;
	
    @FXML
    private JFXButton Back;

    @FXML
    private JFXButton Book;

    @FXML
    private ToggleGroup payment;
    
    @FXML
    private JFXRadioButton NEFT;
    
    @FXML
    private JFXRadioButton EMI;

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
    void Book(ActionEvent event) throws IOException {
    	
       if(Credit.isSelected()) {
    	   
   	    Credit.getScene().getWindow().hide();
    	
       	Stage home = new Stage();	    	
       	Parent root = FXMLLoader.load(getClass().getResource("/FXML/creditdebitcard.fxml"));
       	Scene scene = new Scene(root);
       	home.setScene(scene);
       	home.show();	   
       }
       
       if(NEFT.isSelected()) {
    	   
      	    NEFT.getScene().getWindow().hide();
        	
           	Stage home = new Stage();	    	
           	Parent root = FXMLLoader.load(getClass().getResource("/FXML/Neft.fxml"));
           	Scene scene = new Scene(root);
           	home.setScene(scene);
           	home.show();
        }
       
       if(EMI.isSelected()) {
    	   
     	    EMI.getScene().getWindow().hide();
       	
          	Stage home = new Stage();	    	
          	Parent root = FXMLLoader.load(getClass().getResource("/FXML/emi.fxml"));
          	Scene scene = new Scene(root);
          	home.setScene(scene);
          	home.show();
       }


    }
    
}
